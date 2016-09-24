#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int count=0, max=0;
    while(n!=0)
    {
        if(n%2 == 0)
            count=0;
        else
            count++;
        if(count>max)
            max=count;
        n = n/2;
    }
    cout<<max;
    return 0;
}
