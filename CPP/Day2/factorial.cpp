#include<iostream>
using namespace std;

int main()
{
    int n, result = 1;
    cout<<"Enter number to find factorial";
    cin>>n;

    if(n==0 || n==1)
    {
        cout<<"Factorial of the given number is 1";
    }
    else if(n<0)
    {
        cout<<"Please enter positive value";
    }
    else
    {
        for(int i=2;i<=n;i++)
        {
            result = result * i; 
        }

        cout<<"Factorial of the given number is "<< result<<endl;
    }
}