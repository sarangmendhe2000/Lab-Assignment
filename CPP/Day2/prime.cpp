#include<iostream>
using namespace std;

int i,flag=false,n;
int main()
{
    cout<<"Enter any number";
cin>>n;

if(n<=1)
{
    cout<<"The number is not a prime number";
}
else
{

for(i=2;i<n/2;i++)
{
    if(n%i==0)
    {
        flag=true;
        break;
    }
}

if(flag==true)
{
    cout<<"the number is prime number";
}
else
{
    cout<<"The number is not prime";
}
}
}

