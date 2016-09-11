#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    float mealCost;
    int tipPercent, taxPercent;
    scanf("%f",&mealCost);
    scanf("%d",&tipPercent);
    scanf("%d",&taxPercent);
    
    mealCost += (mealCost*(tipPercent+taxPercent)/100);
    int totalCost = (int)round(mealCost);
    
    printf("The total meal cost is %d dollars.", totalCost);
    return 0;
}
