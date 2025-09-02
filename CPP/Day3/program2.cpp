#include<iostream>
using namespace std;

int main()
{
    int i,n;
    cout<<"Enter total number of elements of the array";
    cin>>n;
    int arr[n];

    cout<<"Enter elements";
    for(i=0;i<n;i++)
    {
        cin>>*(arr+i);
       // cin>>arr[i]; 
    }

    cout<<"array --> ";
    for(i=0;i<n;i++)
    {
         cout<<*(arr+i)<<"  ";
       // cout<<arr[i]<<"  ";
    }
}