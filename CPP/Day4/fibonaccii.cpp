#include <iostream>
using namespace std;

int main()
{
    int i, n, a = 0, b = 1,c;

    cout << "Please Enter total number you want to print - ";
    cin >> n;

    if (n <= 0)
    {
        cout << "PLease enter valid number";
    }
    else if (n == 1)
    {
        return a;
    }
    else if (n == 2)
    {
        return a + b;
    }

    else
    {
        cout<<"0 1 ";
        
        
        for (int i = 3; i <= n; i++)
        {
            
            c = a + b;
            a=b;
            b=c;
            cout<<c<<" ";
        }
    }
}