#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank ";

    // Declare second integer, double, and String variables.
    int myInt;
    float myDouble;
    char myString[50];
    char temp;
    
    // Read and save an integer, double, and String to your variables.
    scanf("%d%f",&myInt,&myDouble);
    scanf("%c",&temp);
    scanf("%[^\n]",myString);
    
    // Print the sum of both integer variables on a new line.
    printf("%d",i+myInt);
    
    // Print the sum of the double variables on a new line.
    printf("\n%.1f",d+myDouble);
    
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.
    printf("\n%s%s",s,myString);
    return 0;
}
