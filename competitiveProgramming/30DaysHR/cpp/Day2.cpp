#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() 
{
    float mealCost;
    int tipPercent, taxPercent;
    cin>>mealCost>>tipPercent>>taxPercent;
    
    mealCost += (mealCost*(tipPercent+taxPercent)/100);
    int totalCost = (int)round(mealCost);
    
    cout<<"The total meal cost is "<<totalCost<<" dollars.";
    return 0;
}
