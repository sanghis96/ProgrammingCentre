#include<iostream>
#include<conio.h>
#include<string.h>

using namespace std;

void main()
{
	int i,j,cnt,l,count[50]={0};
	char str[50];
	cout<<"Enter the string: ";
	cin>>str;
	cout<<"\n\tOriginal String is: "<<str;
	cout<<"\n\n\tEncoded String is: ";
	l = strlen(str);
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
	}
	getch();
}