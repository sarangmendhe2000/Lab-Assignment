#include<iostream>
using namespace std;

int main()
{
    int row,col;
    cout<<"Enter the value of row";
    cin>>row;
    cout<<"Enter the value of column";
    cin>>col;
    int arr[row][col];

    cout<<"Enter Elements of the array";

    for(int i=0;i<=row;i++)
    {
        for(int j=0;j<=col;j++)
        {
            // cin>>*(*(arr+i)+j);
            cin>>arr[i][j];
        }
    }

    cout<<"Array --> " <<endl;

    for(int i=0;i<=row;i++)
    {
        for(int j=0;j<=col;j++)
        {
            // cout<<*(*(arr+i)+j)<<" ";
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }


}    