#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

void main()
{
	int i,j,cnt,l,count[50]={0};
	char str[50];
	int en[50];
	cout<<"Enter the string: ";
	cin>>str;
	cout<<"\n\tOriginal String is: "<<str;
	cout<<"\n\n\tEncoded String is: ";
	l = strlen(str);
	/*
	for(i=0; i<l; i*=1)
	{
		j = 0;
		count[i] = 1;
		do
		{
			j++;
			if(str[i+j] == str[i])
				count[i]++;
		}while(str[i+j]==str[i]);
		if(count[i] == 1)
		{
			cout<<count[i]<<str[i];
			i++;
		}
		else
		{
			cout<<count[i]<<str[i];
			i += count[i];
		}
	}*/
	for(i=0; i<l; i*=1)
	{
		j = 0;
		cnt = 1;
		do
		{
			j++;
			if(str[i+j] == str[i])
				cnt++;
		}while(str[i+j]==str[i]);
		if(cnt == 1)
		{
			j = 0;
			cnt = 1;
			do
			{
				j++;
				if(str[i+j] != str[i])
					cnt++;
			}while(str[i+j]!=str[i]);
			cout<<(-1*cnt);
			for(int k=0; k<cnt; k++)
				cout<<str[i+k];
			i += cnt;
		}
		else
		{
			cout<<cnt<<str[i];
			i += cnt;
		}

	}
	cout<<en;
	getch();
}