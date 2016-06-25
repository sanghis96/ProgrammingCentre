#include<iostream.h>
#include<conio.h>
char SA=1;
void main()
{ char p;
  char a=2,b=3,c=11,d=12,e=14,f=15,g=20,h=21,i='';
  clrscr();cout<<"                                                      By - SAMARTH SANGHI "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   UTKARSH KAHAR "<<SA<<" "<<SA;
  cout<<"\n\n\n\n\n\n\n\t\t\tYou are playing WONDER CARDS";
  getch();
  do
  {char ch[10],ans='!';
   int flag=0;
   clrscr();cout<<"                                                      By - SAMARTH SANGHI "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   UTKARSH KAHAR "<<SA<<" "<<SA;
   cout<<"\n\n\tThis is your master card";
   cout<<"\n\n\n\t\t _________   "<<endl;
   cout<<"\t\t|         |   "<<endl;                         //Master card
   cout<<"\t\t| "<<a<<"  "<<b<<"  "<<c<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<d<<"  "<<e<<"  "<<f<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<g<<"  "<<h<<"  "<<i<<" |   "<<endl;
   cout<<"\t\t|_________|   ";
   cout<<"\n\n\n\tChoose one symbol from these 9 symbols press enter after you're done";
   getch();
   clrscr();cout<<"\t\t\t\t\t\t\t    By - UTKARSH KAHAR "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   SAMARTH SANGHI "<<SA<<" "<<SA;
   cout<<"\n\n\tLook for your symbol in this card. Is it here(y/n)?";
   cout<<"\n\n\n\n\n\t\t _________   "<<endl;
   cout<<"\t\t|         |   "<<endl;                          //card 1
   cout<<"\t\t| "<<b<<"  "<<g<<"    |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<i<<"  "<<h<<"    |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<e<<"  "<<c<<"  "<<f<<" |   "<<endl;
   cout<<"\t\t|_________|   ";
   cout<<"\n\n\t\t\t\t\t=> ";
   cin>>ch[0];
   clrscr();cout<<"\t\t\t\t\t\t\tBy - SAMARTH SANGHI "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   UTKARSH KAHAR "<<SA<<" "<<SA;
   cout<<"\n\n\tLook for your symbol in this card. Is it here(y/n)?";
   cout<<"\n\n\n\n\n\t\t _________   "<<endl;
   cout<<"\t\t|         |   "<<endl;                             //card 2
   cout<<"\t\t| "<<d<<"  "<<c<<"  "<<g<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t|    "<<e<<"  "<<a<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t|    "<<h<<"  "<<b<<" |   "<<endl;
   cout<<"\t\t|_________|   ";
   cout<<"\n\n\t\t\t\t\t=> ";
   cin>>ch[1];
   clrscr();cout<<"\t\t\t\t\t\t\tBy - UTKARSH KAHAR "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   SAMARTH SANGHI "<<SA<<" "<<SA;
   cout<<"\n\n\tLook for your symbol in this card. Is it here(y/n)?";
   cout<<"\n\n\n\n\n\t\t _________   "<<endl;
   cout<<"\t\t|         |   "<<endl;                             //card 3
   cout<<"\t\t| "<<e<<"       |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<h<<"  "<<c<<"  "<<g<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<f<<"  "<<i<<"  "<<d<<" |   "<<endl;
   cout<<"\t\t|_________|   ";
   cout<<"\n\n\t\t\t\t\t=> ";
   cin>>ch[2];
   clrscr();cout<<"\t\t\t\t\t\t\tBy - SAMARTH SANGHI "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   UTKARSH KAHAR "<<SA<<" "<<SA;
   cout<<"\n\n\tLook for your symbol in this card. Is it here(y/n)?";
   cout<<"\n\n\n\n\n\t\t _________   "<<endl;
   cout<<"\t\t|         |   "<<endl;                              // card 4
   cout<<"\t\t|    "<<e<<"  "<<h<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t|    "<<g<<"  "<<i<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<b<<"  "<<d<<"  "<<a<<" |   "<<endl;
   cout<<"\t\t|_________|   ";
   cout<<"\n\n\t\t\t\t\t=> ";
   cin>>ch[3];
   clrscr();cout<<"\t\t\t\t\t\t\tBy - UTKARSH KAHAR "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   SAMARTH SANGHI "<<SA<<" "<<SA;
   cout<<"\n\n\tLook for your symbol in this card. Is it here(y/n)?";
   cout<<"\n\n\n\n\n\t\t _________   "<<endl;
   cout<<"\t\t|         |   "<<endl;                              //card 5
   cout<<"\t\t| "<<i<<"  "<<h<<"  "<<b<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t|       "<<c<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<d<<"  "<<a<<"  "<<g<<" |   "<<endl;
   cout<<"\t\t|_________|   ";
   cout<<"\n\n\t\t\t\t\t=> ";
   cin>>ch[4];
   clrscr();cout<<"\t\t\t\t\t\t\tBy - SAMARTH SANGHI "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   UTKARSH KAHAR "<<SA<<" "<<SA;
   cout<<"\n\n\tLook for your symbol in this card. Is it here(y/n)?";
   cout<<"\n\n\n\n\n\t\t _________   "<<endl;
   cout<<"\t\t|         |   "<<endl;                              //card 6
   cout<<"\t\t| "<<c<<"  "<<i<<"  "<<a<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<f<<"       |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<g<<"  "<<b<<"  "<<h<<" |   "<<endl;
   cout<<"\t\t|_________|   ";
   cout<<"\n\n\t\t\t\t\t=> ";
   cin>>ch[5];
   clrscr();cout<<"\t\t\t\t\t\t\tBy - UTKARSH KAHAR "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   SAMARTH SANGHI "<<SA<<" "<<SA;
   cout<<"\n\n\tLook for your symbol in this card. Is it here(y/n)?";
   cout<<"\n\n\n\n\n\t\t _________   "<<endl;
   cout<<"\t\t|         |   "<<endl;                                //card 7
   cout<<"\t\t| "<<g<<"  "<<b<<"  "<<c<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<a<<"  "<<d<<"  "<<f<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t|       "<<e<<" |   "<<endl;
   cout<<"\t\t|_________|   ";
   cout<<"\n\n\t\t\t\t\t=> ";
   cin>>ch[6];
   clrscr();cout<<"\t\t\t\t\t\t\tBy - SAMARTH SANGHI "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   UTKARSH KAHAR "<<SA<<" "<<SA;
   cout<<"\n\n\tLook for your symbol in this card. Is it here(y/n)?";
   cout<<"\n\n\n\n\n\t\t _________   "<<endl;
   cout<<"\t\t|         |   "<<endl;                            //card 8
   cout<<"\t\t| "<<h<<"  "<<a<<"  "<<e<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<c<<"  "<<b<<"    |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<i<<"  "<<f<<"    |   "<<endl;
   cout<<"\t\t|_________|   ";
   cout<<"\n\n\t\t\t\t\t=> ";
   cin>>ch[7];
   clrscr();cout<<"\t\t\t\t\t\t\tBy - UTKARSH KAHAR "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   SAMARTH SANGHI "<<SA<<" "<<SA;
   cout<<"\n\n\tLook for your symbol in this card. Is it here(y/n)?";
   cout<<"\n\n\n\n\n\t\t _________   "<<endl;
   cout<<"\t\t|         |   "<<endl;                             //card 9
   cout<<"\t\t|       "<<d<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<g<<"  "<<f<<"  "<<h<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<a<<"  "<<e<<"  "<<i<<" |   "<<endl;
   cout<<"\t\t|_________|   ";
   cout<<"\n\n\t\t\t\t\t=> ";
   cin>>ch[8];
   clrscr();cout<<"\t\t\t\t\t\t\tBy - SAMARTH SANGHI "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   UTKARSH KAHAR "<<SA<<" "<<SA;
   cout<<"\n\n\tLook for your symbol in this card. Is it here(y/n)?";
   cout<<"\n\n\n\n\n\t\t _________   "<<endl;
   cout<<"\t\t|         |   "<<endl;                            //card 10
   cout<<"\t\t| "<<b<<"  "<<c<<"  "<<d<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<e<<"  "<<f<<"  "<<i<<" |   "<<endl;
   cout<<"\t\t|         |   "<<endl;
   cout<<"\t\t| "<<a<<"       |   "<<endl;
   cout<<"\t\t|_________|   ";
   cout<<"\n\n\t\t\t\t\t=> ";
   cin>>ch[9];
   { if((ch[0]=='n'||ch[0]=='N') && (ch[2]=='n'||ch[2]=='N'))
	ans=a;flag=1;
     if((ch[2]=='n'||ch[2]=='N') && (ch[8]=='n'||ch[8]=='N'))
	ans=b;flag=1;
     if((ch[3]=='n'||ch[3]=='N') && (ch[8]=='n'||ch[8]=='N'))
	ans=c;flag=1;
     if((ch[0]=='n'||ch[0]=='N') && (ch[5]=='n'||ch[5]=='N'))
	ans=d;flag=1;
     if((ch[4]=='n'||ch[4]=='N') && (ch[5]=='n'||ch[5]=='N'))
	ans=e;flag=1;
     if((ch[3]=='n'||ch[3]=='N') && (ch[4]=='n'||ch[4]=='N'))
	ans=f;flag=1;
     if((ch[7]=='n'||ch[7]=='N') && (ch[9]=='n'||ch[9]=='N'))
	ans=g;flag=1;
     if((ch[6]=='n'||ch[6]=='N') && (ch[9]=='n'||ch[9]=='N'))
	ans=h;flag=1;
     if((ch[1]=='n'||ch[1]=='N') && (ch[6]=='n'||ch[6]=='N'))
	ans=i;flag=1;
     if(ans=='!'/*ans !='@' || ans !='%' || ans !='$' || ans !='?' || ans !='#' || ans !='+' || ans !='~' || ans !='&' || ans !='*'*/)
     {	cout<<"\n\n\tYou did something wrong";
	getch();
	goto uk;
     }
   }
   if(flag)
   {  clrscr();cout<<"\t\t\t\t\t\t\tBy - UTKARSH KAHAR "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   SAMARTH SANGHI "<<SA<<" "<<SA;
      cout<<"\n\n\n\t\tThe Symbol You Chose Was:";
      cout<<"\n\n\t\t _____________";
      cout<<"\n\t\t|             |";
      cout<<"\n\t\t|      "<<ans<<"      |";
      cout<<"\n\t\t|_____________|";
      getch();
   }
   uk:
   clrscr();cout<<"\t\t\t\t\t\t\tBy - SAMARTH SANGHI "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   UTKARSH KAHAR "<<SA<<" "<<SA;
   cout<<"\n\n\n\n\tDo you play more(y/n):";
   cin>>p;
  }while(p == 'y' || p == 'Y');
  clrscr();cout<<"\t\t\t\t\t\t\tBy - UTKARSH KAHAR "<<SA<<" "<<SA;
	    cout<<"\n\t\t\t\t\t\t\t           &";
	    cout<<"\n\t\t\t\t\t\t\t   SAMARTH SANGHI "<<SA<<" "<<SA;
  cout<<"\n\n\n\n\n\n\n\n\t\t\tTHANK YOU "<<SA<<" "<<SA<<" "<<SA<<" "<<SA<<" "<<SA<<" "<<SA<<" "<<SA;
  getch();
}