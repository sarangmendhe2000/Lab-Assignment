#include<iostream>
using namespace std;

int main()
{
    int num , denom , result ;

    cout<<"Enter num"<<endl;
    cin>>num;

    cout<<"Enter denominator : ";
    cin>>denom;

    try
    {
        if(denom == 0)
        {
            throw 0;
        }
        else
        {
            result = num/denom;
        }
        cout<<"Result "<<result<<endl;
    }

    catch(float e)
    {
        cout<<"in 1st catch";
    }
    catch(int e)
    {
        cout<<"Denominator should not be 0 "<<endl;
    }

    cout<<"End"<<endl;
}