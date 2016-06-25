#include<iostream.h>
#include<conio.h>
#include<stdlib.h>
#include<time.h>
void main()
{  clrscr();
   int us,n;
   time_t t;
   n=(int)time(&t);
   srand(n);
   char a[58],s=1,b=95,c=124;
   for(int i=0;i<58;i++)
   {  home:
      us=(int)(rand() % 128);
      if(us==0 || us==7 || us==8 || us==9 || us==10 || us==13 || us==26 || us==28 || us==32 || us==34 ||(us>=39 && us<=47)  || (us>=48 && us<=62) || (us>=65 && us<=90) || (us>=97 && us<=125))
	 goto home;
      a[i]=us;
   }
   char sam;
   int uk;
   lable:
   uk=(int)(rand() % 128);
   if(uk==0 || uk==7 || uk==8 || uk==9 || uk==10 || uk==13 || uk==26 || uk==28 || uk==32|| us==34 ||(us>=39 && us<=47) || (uk>=48 && uk<=62) || (uk>=65 && uk<=90) || (uk>=97 && uk<=125))
       goto lable;
   sam=uk;
   cout<<"\n00."<<a[0]<<"    25."<<a[23]<<"    50."<<a[45]<<"    75."<<a[9];cout<<"                            By - SAMARTH SANGHI "<<s<<s;
   cout<<"\n01."<<a[1]<<"    26."<<a[24]<<"    51."<<a[46]<<"    76."<<a[10];cout<<"                            Credit - UTKARSH KAHAR";
   cout<<"\n02."<<a[2]<<"    27."<<sam<<"    52."<<a[47]<<"    77."<<a[11];
   cout<<"\n03."<<a[3]<<"    28."<<a[25]<<"    53."<<a[48]<<"    78."<<a[12];
   cout<<"\n04."<<a[4]<<"    29."<<a[26]<<"    54."<<sam<<"    79."<<a[13];
   cout<<"\n05."<<a[5]<<"    30."<<a[27]<<"    55."<<a[49]<<"    80."<<a[14];
   cout<<"\n06."<<a[6]<<"    31."<<a[28]<<"    56."<<a[50]<<"    81."<<sam;
   cout<<"\n07."<<a[7]<<"    32."<<a[29]<<"    57."<<a[51]<<"    82."<<a[15];
   cout<<"\n08."<<a[8]<<"    33."<<a[30]<<"    58."<<a[52]<<"    83."<<a[16];
   cout<<"\n09."<<sam<<"    34."<<a[31]<<"    59."<<a[53]<<"    84."<<a[17];
   cout<<"\n10."<<a[9]<<"    35."<<a[32]<<"    60."<<a[54]<<"    85."<<a[18];
   cout<<"\n11."<<a[10]<<"    36."<<sam<<"    60."<<a[55]<<"    86."<<a[19];
   cout<<"\n12."<<a[11]<<"    37."<<a[33]<<"    62."<<a[56]<<"    87."<<a[20];
   cout<<"\n13."<<a[12]<<"    38."<<a[34]<<"    63."<<sam<<"    88."<<a[21];
   cout<<"\n14."<<a[13]<<"    39."<<a[35]<<"    64."<<a[57]<<"    89."<<a[22];
   cout<<"\n15."<<a[14]<<"    40."<<a[36]<<"    65."<<a[0]<<"    90."<<sam;
   cout<<"\n16."<<a[15]<<"    41."<<a[37]<<"    66."<<a[1]<<"    91."<<a[23];
   cout<<"\n17."<<a[16]<<"    42."<<a[38]<<"    67."<<a[2]<<"    92."<<a[24];
   cout<<"\n18."<<sam<<"    43."<<a[39]<<"    68."<<a[3]<<"    93."<<a[25];
   cout<<"\n19."<<a[17]<<"    44."<<a[40]<<"    69."<<a[4]<<"    94."<<a[26]<<"     Choose any two digit no.";
   cout<<"\n20."<<a[18]<<"    45."<<sam<<"    70."<<a[5]<<"    95."<<a[27]<<"     Now, Add both the digits";
   cout<<"\n21."<<a[19]<<"    46."<<a[41]<<"    71."<<a[6]<<"    96."<<a[28]<<"     Then subtract the obtained no. from that two";
   cout<<"\n22."<<a[20]<<"    47."<<a[42]<<"    72."<<sam<<"    97."<<a[29]<<"      digit no.";
   cout<<"\n23."<<a[21]<<"    48."<<a[43]<<"    73."<<a[7]<<"    98."<<a[30]<<"     Now, see the symbol of no.";
   cout<<"\n24."<<a[22]<<"    49."<<a[44]<<"    74."<<a[8]<<"    99."<<a[31]<<"\t\t";
   getch();
   clrscr();
   cout<<"\t\t\t\t\t\t\tBy - SAMARTH SANGHI "<<s<<s<<"\n\t\t\t\t\t\t\tCredit - UTKARSH KAHAR";
   cout<<"\n\n\n\n\n\n\n\n\t\t\t\tYour symbol is:\n\n\t\t\t\t "<<b<<b<<b<<b<<b<<b<<b<<b<<b<<b<<b<<b<<b<<b<<b<<b;
   cout<<"\n\t\t\t\t"<<c<<"                "<<c;
   cout<<"\n\t\t\t\t"<<c<<"        "<<sam<<"       "<<c;
   cout<<"\n\t\t\t\t"<<c<<b<<b<<b<<b<<b<<b<<b<<b<<b<<b<<b<<b<<b<<b<<b<<b<<c;
   cout<<"\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t";
   getch();
}