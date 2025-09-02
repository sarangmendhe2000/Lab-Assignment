#include<iostream>
using namespace std;

int main()
{
    int a =10;
    int b=20;

    cout<<"Before Swapping a = "<<a<<" b= "<<b<<endl;

    a=a+b;
    b=a-b;
    a=a-b;

    cout<<"After Swapping a = "<<a<<" b= "<<b<<endl;
}