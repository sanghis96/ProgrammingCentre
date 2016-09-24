#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    int n;
    scanf("%d",&n);
    printf("%d",factorial(n));
    return 0;
}
int factorial(int n)
{
    if(n<=1)
        return 1;
    else
        return n * factorial(n-1);
}
