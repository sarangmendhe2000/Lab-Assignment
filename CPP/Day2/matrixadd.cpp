#include<iostream>
using namespace std;

int main()
{
    int i,j;
    int a[3][3];
    int b[3][3];
    int add[3][3];

cout<<"Enter first matrix value"<<endl;
for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
        cin>>a[i][j];
    }
}

cout<<"Enter Second matrix value"<<endl;
for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
        cin>>b[i][j];
    }
}

cout<<"Addition of two matrix is - "<<endl;


for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
        add[i][j] = a[i][j]+b[i][j];

    }
}


for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
        cout<<add[i][j]<<" ";
    }
    cout<<endl;
}
}