#include<iostream.h>
#include<conio.h>
#include<stdlib.h>
char SA=1;
char box[3][3];
void sam();
void main()
{    clrscr();
     int m,n,p;
     char ch;
     lable:
     do
     {  clrscr();
	cout<<"\n\t\t\t\t\t\t\t-- SAMARTH SANGHI "<<SA;
	for(m=0;m<3;m++)
	   for(n=0;n<3;n++)
	      box[m][n]='\0';
	cout<<"\n\t\t\tTIC - TAC - TOE";
	cout<<"\n\n1.Single Player";
	cout<<"\n2.Double Player";
	cout<<"\n3.Exit";
	cout<<"\n\nEnter your choice:";
	cin>>p;
	switch(p)
	{   case 2:clrscr();
		   cout<<"\n\t\t\t\t\t\t\t-- SAMARTH SANGHI "<<SA;
		   int i,j,sum=0;
		   while(sum < 10)
		   {
		      if(sum == 0)
			sam();
		      cout<<"Player 1 is 'X':choose the row and coloumn"<<endl;
		      cout<<"Row :";
		      cin>>i;
		      cout<<"Column :";
		      cin>>j;
		      for(int chance=1;i>3 || i<1 || j>3 || j<1 || ('X'==box[i-1][j-1] || 'O'==box[i-1][j-1]);chance++)
		      {  cout<<"Sorry !!!, but you have to choose another place.\n";
			 cout<<"Row :";
			 cin>>i;
			 cout<<"Column :";
			 cin>>j;
			 if(chance==3)
			 {  cout<<"\n\nYour game is restarted";
			    getch();
			    goto lable;
			 }
		      }
		      box[i-1][j-1] = 'X';
		      sum++;
		      sam();              //calling function to display game setup

		      //check if player 1 wins
		      if(box[0][0] == 'X' && box[0][0] == box[1][1] && box[1][1] == box[2][2])
		      {  cout<<"Player 1 wins"<<endl;
			 break;
		      }
		      if(box[2][0] == 'X' && box[2][0] == box[1][1] && box[1][1] == box[0][2])
		      {  cout<<"Player 1 wins"<<endl;
			 break;
		      }
		      if(box[0][0] == 'X' && box[0][0] == box[1][0] && box[1][0] == box[2][0])
		      {  cout<<"Player 1 wins"<<endl;
			 break;
		      }
		      if(box[0][1] == 'X' && box[0][1] == box[1][1] && box[1][1] == box[2][1])
		      {  cout<<"Player 1 wins"<<endl;
			 break;
		      }
		      if(box[0][2] == 'X' && box[0][2] == box[1][2] && box[1][2] == box[2][2])
		      {  cout<<"Player 1 wins"<<endl;
			 break;
		      }
		      if(box[0][0] == 'X' && box[0][0] == box[0][1] && box[0][1] == box[0][2])
		      {  cout<<"Player 1 wins"<<endl;
			 break;
		      }
		      if(box[1][0] == 'X' && box[1][0] == box[1][1] && box[1][1] == box[1][2])
		      {  cout<<"Player 1 wins"<<endl;
			 break;
		      }
		      if(box[2][0] == 'X' && box[2][0] == box[2][1] && box[2][1] == box[2][2])
		      {  cout<<"Player 1 wins"<<endl;
			 break;
		      }
		      if(sum == 9)
		      {
			cout<<"The game is over and no one wins, hahaha.................."<<endl;
			break;
		      }
		      //player 2's turn
		      cout<<"Player 2 is 'O':choose the row and coloumn"<<endl;
		      cout<<"Row :";
		      cin>>i;
		      cout<<"Column :";
		      cin>>j;
		      for(chance=1;i>3 || i<1 || j>3 || j<1 || ('X'==box[i-1][j-1] || 'O'==box[i-1][j-1]);chance++)
		      {  cout<<"Sorry !!!, but you have to choose another place.\n";
			 cout<<"Row :";
			 cin>>i;
			 cout<<"Column :";
			 cin>>j;
			 if(chance==3)
			 {  cout<<"\n\nYour game is restarted";
			    getch();
			    goto lable;
			 }
		      }
		      box[i-1][j-1] = 'O';
		      sum++;
		      //the play box
		      sam();
		      //check if player 2 wins
		      if(box[0][0] == 'O' && box[0][0] == box[1][1] && box[1][1] == box[2][2])
		      {  cout<<"Player 2 wins"<<endl;
			 break;
		      }
		      if(box[2][0] == 'O' && box[2][0] == box[1][1] && box[1][1] == box[0][2])
		      {  cout<<"Player 2 wins"<<endl;
			 break;
		      }
		      if(box[0][0] == 'O' && box[0][0] == box[1][0] && box[1][0] == box[2][0])
		      {  cout<<"Player 2 wins"<<endl;
			 break;
		      }
		      if(box[0][1] == 'O' && box[0][1] == box[1][1] && box[1][1] == box[2][1])
		      {  cout<<"Player 2 wins"<<endl;
			 break;
		      }
		      if(box[0][2] == 'O' && box[0][2] == box[1][2] && box[1][2] == box[2][2])
		      {  cout<<"Player 2 wins"<<endl;
			 break;
		      }
		      if(box[0][0] == 'O' && box[0][0] == box[0][1] && box[0][1] == box[0][2])
		      {  cout<<"Player 2 wins"<<endl;
			 break;
		      }
		      if(box[1][0] == 'O' && box[1][0] == box[1][1] && box[1][1] == box[1][2])
		      {  cout<<"Player 2 wins"<<endl;
			 break;
		      }
		      if(box[2][0] == 'O' && box[2][0] == box[2][1] && box[2][1] == box[2][2])
		      {  cout<<"Player 2 wins"<<endl;
			 break;
		      }
		   }
		   break;
	    case 1:clrscr();
		   cout<<"\n\t\t\t\t\t\t\t-- SAMARTH SANGHI "<<SA;
		   i,j,sum=0;
		   while(sum < 10)
		   {
		      if(sum == 0)
			sam();
		      cout<<"You are 'X':choose the row and coloumn"<<endl;
		      cout<<"Row :";
		      cin>>i;
		      cout<<"Column :";
		      cin>>j;
		      for(int chance=1;i>3 || i<1 || j>3 || j<1 || ('X'==box[i-1][j-1] || 'O'==box[i-1][j-1]);chance++)
		      {  cout<<"Sorry !!!, but you have to choose another place.\n";
			 cout<<"Row :";
			 cin>>i;
			 cout<<"Column :";
			 cin>>j;
			 if(chance==3)
			 {  cout<<"\n\nYour game is restarted";
			    getch();
			    goto lable;
			 }
		      }
		      box[i-1][j-1] = 'X';
		      sum++;
		      sam();              //calling function to display game setup

		      //check if player wins
		      if(box[0][0] == 'X' && box[0][0] == box[1][1] && box[1][1] == box[2][2])
		      {  cout<<"You win"<<endl;
			 break;
		      }
		      if(box[2][0] == 'X' && box[2][0] == box[1][1] && box[1][1] == box[0][2])
		      {  cout<<"You win"<<endl;
			 break;
		      }
		      if(box[0][0] == 'X' && box[0][0] == box[1][0] && box[1][0] == box[2][0])
		      {  cout<<"You win"<<endl;
			 break;
		      }
		      if(box[0][1] == 'X' && box[0][1] == box[1][1] && box[1][1] == box[2][1])
		      {  cout<<"You win"<<endl;
			 break;
		      }
		      if(box[0][2] == 'X' && box[0][2] == box[1][2] && box[1][2] == box[2][2])
		      {  cout<<"You win"<<endl;
			 break;
		      }
		      if(box[0][0] == 'X' && box[0][0] == box[0][1] && box[0][1] == box[0][2])
		      {  cout<<"You win"<<endl;
			 break;
		      }
		      if(box[1][0] == 'X' && box[1][0] == box[1][1] && box[1][1] == box[1][2])
		      {  cout<<"You win"<<endl;
			 break;
		      }
		      if(box[2][0] == 'X' && box[2][0] == box[2][1] && box[2][1] == box[2][2])
		      {  cout<<"You win"<<endl;
			 break;
		      }
		      if(sum == 9)
		      {
			cout<<"The game is over and no one wins, hahaha.................."<<endl;
			break;
		      }
		      //computer's turn
		      back:
		      int n1,n2;
		      randomize();
		      n1=(int)(rand() % 3);
		      n2=(int)(rand() % 3);
		      for(int k=0;k<3;k++)
		      {  for(int l=0;l<3;l++)
			 {  if(box[k][l]==box[n1][n2] && (box[n1][n2]=='X' || box[n1][n2]=='O'))
			       goto back;
			 }
		      }
		      i=n1;
		      j=n2;
		      box[i][j] = 'O';
		      sum++;
		      //the play box
		      sam();
		      //check if player 2 wins
		      if(box[0][0] == 'O' && box[0][0] == box[1][1] && box[1][1] == box[2][2])
		      {  cout<<"You lose"<<endl;
			 break;
		      }
		      if(box[2][0] == 'O' && box[2][0] == box[1][1] && box[1][1] == box[0][2])
		      {  cout<<"You lose"<<endl;
			 break;
		      }
		      if(box[0][0] == 'O' && box[0][0] == box[1][0] && box[1][0] == box[2][0])
		      {  cout<<"You lose"<<endl;
			 break;
		      }
		      if(box[0][1] == 'O' && box[0][1] == box[1][1] && box[1][1] == box[2][1])
		      {  cout<<"You lose"<<endl;
			 break;
		      }
		      if(box[0][2] == 'O' && box[0][2] == box[1][2] && box[1][2] == box[2][2])
		      {  cout<<"You lose"<<endl;
			 break;
		      }
		      if(box[0][0] == 'O' && box[0][0] == box[0][1] && box[0][1] == box[0][2])
		      {  cout<<"You lose"<<endl;
			 break;
		      }
		      if(box[1][0] == 'O' && box[1][0] == box[1][1] && box[1][1] == box[1][2])
		      {  cout<<"You lose"<<endl;
			 break;
		      }
		      if(box[2][0] == 'O' && box[2][0] == box[2][1] && box[2][1] == box[2][2])
		      {  cout<<"You lose"<<endl;
			 break;
		      }
		   }
		   break;
	    case 3:goto thanks;
	    default:cout<<"\n\n\n\t\tWrong choice!!!";
	}
	cout<<"\nWould you like to play again???(Y - N)\n";
	cin>>ch;
     }while(ch=='y' || ch=='Y');
     thanks:
     clrscr();
     cout<<"\n\t\t\t\t\t\t\t-- SAMARTH SANGHI "<<SA;
     cout<<"\n\n\n\n\n\n\n\t\tTHANK YOU "<<SA<<" "<<SA<<" "<<SA<<" "<<SA<<" "<<SA;
     getch();
}
void sam()        //the play box
{  clrscr();
   cout<<"\n\t\t\t\t\t\t\t-- SAMARTH SANGHI "<<SA;
   cout<<"\n\t\t     1   2   3\n"<<endl;
   cout<<"\t\t  1  "<<box[0][0]<<" | "<<box[0][1]<<" | "<<box[0][2]<<endl;
   cout<<"\t\t    ---|---|---\n";
   cout<<"\t\t  2  "<<box[1][0]<<" | "<<box[1][1]<<" | "<<box[1][2]<<endl;
   cout<<"\t\t    ---|---|---\n";
   cout<<"\t\t  3  "<<box[2][0]<<" | "<<box[2][1]<<" | "<<box[2][2]<<"\n\n\n";
}