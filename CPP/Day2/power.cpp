
#include<iostream>
using namespace std;

int main()
{
    int base, exp, result =1;
    cout<<"Enter base";
    cin>>base;
    cout<<"Enter exponential";
    cin>>exp;

    while(exp!=0)
    {
        result = result*base;
        exp--;
    }

    cout<<result;
}