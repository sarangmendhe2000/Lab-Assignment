#include<iostream>
using namespace std;

int main()
{
    int n, rem, result=0;
    
    cout<<"Enter 3 digit Number to check weather the number is armstrong or not : - ";
    cin>>n;

    int temp = n;

    while(n!=0)
    {
        rem= n%10;
        result = result + (rem*rem*rem)
        n = n/10;

    }

    

    if(temp==result)
    {
        cout<<"Armstrong Number";
    }
    else
    {
        cout<<"Not a Armstrong Number";
    }


    // Program to check armstrong of any digit 

    
}