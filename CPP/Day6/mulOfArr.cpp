#include<iostream>
using namespace std;

int main()
{
    int a[3][3];
    int b[3][3];
    int c[3][3];
    int i,j;

    cout<<"Enter element of first array";
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            cin>>a[i][j];
        }
    }
    cout<<"Enter element of second array";
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            cin>>b[i][j];
        }
    }

    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            c[i][j] = 0;
        }
    }


    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            for(int k=0 ;k<3;k++)
            {
                c[i][j] += a[i][k] * b[k][j];
            }
        }
    }
cout<<"Multiplication of the two matrix will be - \n";


    for(i=0 ; i<3 ;i++)
    {
        for(j=0;j<3;j++)
        {
            cout<<c[i][j]<<" ";
        }
        cout<<endl;
    }
}