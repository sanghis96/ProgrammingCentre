#include <stdio.h>

int main()
{
    int n; 
    scanf("%d",&n);
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
    printf("%d",max);
    return 0;
}
