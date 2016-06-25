#include<iostream.h>
#include<conio.h>
#include<math.h>

void main()
{
   clrscr();
   for(int i=0;i<11;++i)
   {  for(int j=0;j<11;++j)
	 cout<<(abs(i-11/2)+abs(j-11/2)<=11/2 ? "*" : " ");
      cout<<endl;
   }
   getch();
}
