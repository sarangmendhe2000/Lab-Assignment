#include<iostream>
#include<cmath>
using namespace std;


int main()
{
    double r,base, ci,t,p, result=1;
    cout<<"Enter Principal";
    cin>>p;
    cout<<"Enter rate of interest";
    cin>>r;
    cout<<"Enter time";
    cin>>t;

    base= r/100+1;
    while(t!=0)
    {
        result = result * base;
        t--;
    }
    // cal = pow(cal , t);
    ci = (p * result) - p;

    cout<<"Compound interest will be - "<<ci;

}   