#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    int T,t,i,length;
    char string[10000];
    scanf("%d",&T);
    for(t=0; t<T; t++)
    {
        scanf("%s",&string);
        length = strlen(string);
        for(i=0; i<length; i+=2)
            printf("%c",string[i]);
        printf(" ");
        for(i=1; i<length; i+=2)
            printf("%c",string[i]);
        printf("\n");
    }    
    return 0;
}
