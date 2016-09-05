#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;


int main() 
{
    int T,t,i,length;
    string s;
    cin>>T;
    string temp;
    getline(cin,temp);
    for(t=0; t<T; t++)
    {
        getline(cin,s);
        length = s.length();
        for(i=0; i<length; i+=2)
            cout<<s[i];
        cout<<" ";
        for(i=1; i<length; i+=2)
            cout<<s[i];
        cout<<endl;
    }    
    return 0;
}
