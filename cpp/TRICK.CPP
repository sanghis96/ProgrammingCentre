#include<iostream.h>
#include<conio.h>
#include<process.h>
void main()
{
    char a,b,c,d,e,f,p,z=1;
    sam:
    clrscr();
    cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
    cout<<"\n\n\tThink of a number between 1 to 52";
    cout<<"\n\n\t\tPlease... Be Honest...\t\t|Enter|";
    getch();
    clrscr();
    cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
    cout<<"\n\n\tIs the number appeared here?";
    cout<<"\n\n\t\t1, 3, 5, 7, 9, 11, 13,\n\n\t\t15, 17, 19, 21, 23,\n\n\t\t25, 27, 29, 31, 33,\n\n\t\t35, 37, 39, 41, 43,\n\n\t\t45, 47, 49, 51";
    cout<<"\n\n\t\t                      YES";
    cout<<"\n\n\t\t                      NO    :";
    cin>>a;
    clrscr();
    cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
    cout<<"\n\n\tHow about here?";
    cout<<"\n\n\t\t2, 3, 6, 7, 10, 11,\n\n\t\t14, 15, 18, 19, 22,\n\n\t\t23, 26, 27, 30, 31,\n\n\t\t34, 35, 38, 39, 42,\n\n\t\t43, 46, 47, 50, 51";
    cout<<"\n\n\t\t                      YES";
    cout<<"\n\n\t\t                      NO    :";
    cin>>b;
    clrscr();
    cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
    cout<<"\n\n\tAnd here...";
    cout<<"\n\n\t\t4, 5, 6, 7, 12, 13,\n\n\t\t14, 15, 20, 21, 22,\n\n\t\t23, 28, 29, 30, 31,\n\n\t\t36, 37, 38, 39, 44,\n\n\t\t45, 46, 47, 52";
    cout<<"\n\n\t\t                      YES";
    cout<<"\n\n\t\t                      NO    :";
    cin>>c;
    clrscr();
    cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
    cout<<"\n\n\t...here???";
    cout<<"\n\n\t\t8, 9, 10, 11, 12, 13,\n\n\t\t14, 15, 24, 25, 26,\n\n\t\t27, 28, 29, 30, 31,\n\n\t\t40, 41, 42, 43, 44,\n\n\t\t45, 46, 47";
    cout<<"\n\n\t\t                      YES";
    cout<<"\n\n\t\t                      NO    :";
    cin>>d;
    clrscr();
    cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
    cout<<"\n\n\tHmmm... How about here?";
    cout<<"\n\n\t\t16, 17, 18, 19, 20,\n\n\t\t21, 22, 23, 24, 25,\n\n\t\t26, 27, 28, 29, 30,\n\n\t\t31, 35, 48, 49, 50, 51,\n\n\t\t52";
    cout<<"\n\n\t\t                      YES";
    cout<<"\n\n\t\t                      NO    :";
    cin>>e;
    clrscr();
    cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
    cout<<"\n\n\tNow here???";
    cout<<"\n\n\t\t32, 33, 34, 35, 36,\n\n\t\t37, 38, 39, 40, 41,\n\n\t\t42, 43, 44, 45, 46,\n\n\t\t47, 48, 49, 50, 51,\n\n\t\t52";
    cout<<"\n\n\t\t                      YES";
    cout<<"\n\n\t\t                      NO    :";
    cin>>f;
    if(a=='y' && b=='y' && c=='y' && d=='y' && e=='y' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nHey! i said between 1 to 52";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='n' && c=='n' && d=='n' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 1";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='y' && c=='n' && d=='n' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 2";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='y' && c=='n' && d=='n' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 3";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='n' && c=='y' && d=='n' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 4";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='n' && c=='y' && d=='n' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 5";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='y' && c=='y' && d=='n' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 6";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='y' && c=='y' && d=='n' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 7";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='n' && c=='n' && d=='y' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 8";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='n' && c=='n' && d=='y' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 9";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='y' && c=='n' && d=='y' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 10";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='y' && c=='n' && d=='y' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 11";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='n' && c=='y' && d=='y' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 12";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='n' && c=='y' && d=='y' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 13";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='y' && c=='y' && d=='y' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 14";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='y' && c=='y' && d=='y' && e=='n' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 15";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='n' && c=='n' && d=='n' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 16";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='n' && c=='n' && d=='n' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 17";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='y' && c=='n' && d=='n' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 18";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='y' && c=='n' && d=='n' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 19";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='n' && c=='y' && d=='n' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 20";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='n' && c=='y' && d=='n' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 21";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='y' && c=='y' && d=='n' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 22";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='y' && c=='y' && d=='n' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 23";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='n' && c=='n' && d=='y' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 24";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='n' && c=='n' && d=='y' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 25";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='y' && c=='n' && d=='y' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 26";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='y' && c=='n' && d=='y' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 27";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='n' && c=='y' && d=='y' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 28";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='n' && c=='y' && d=='y' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 29";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='y' && c=='y' && d=='y' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 30";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='y' && c=='y' && d=='y' && e=='y' && f=='n')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 31";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='n' && c=='n' && d=='n' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 32";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='n' && c=='n' && d=='n' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 33";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='y' && c=='n' && d=='n' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 34";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='y' && c=='n' && d=='n' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 35";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='n' && c=='y' && d=='n' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 36";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='n' && c=='y' && d=='n' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 37";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='y' && c=='y' && d=='n' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 38";
       cout<<"\n\n\t\t\t\t|Play Again... ";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='y' && c=='y' && d=='n' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 39";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='n' && c=='n' && d=='y' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 40";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='n' && c=='n' && d=='y' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 41";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='y' && c=='n' && d=='y' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 42";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='y' && c=='n' && d=='y' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 43";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='n' && c=='y' && d=='y' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 44";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='n' && c=='y' && d=='y' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 45";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='y' && c=='y' && d=='y' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 46";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='y' && c=='y' && d=='y' && e=='n' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 47";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='n' && c=='n' && d=='n' && e=='y' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 48";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='n' && c=='n' && d=='n' && e=='y' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 49";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='y' && c=='n' && d=='n' && e=='y' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 50";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='y' && b=='y' && c=='n' && d=='n' && e=='y' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 51";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else if(a=='n' && b=='n' && c=='y' && d=='n' && e=='y' && f=='y')
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\nThe number is... 52";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    else
    {  clrscr();
       cout<<"\n\t\t\t\t\t\tBy - SAMARTH SANGHI "<<z;
       cout<<"\n\n\n\n\t\tNothing";
       cout<<"\n\n\t\t\t\t|Play Again...|";
       cout<<"\n\t\t\t\t|  Exit  |";
       cin>>p;
    }
    if(p=='p')
      goto sam;
    //else if(p=='e')
      //exit();
    else
      cout<<"\n\n\n\t\tWrong choice!!!";
    getch();
}