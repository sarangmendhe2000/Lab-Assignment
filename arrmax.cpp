#include<iostream>
using namespace std;

int main()
{
    int arr[5];
    cout<<"Enter array elements";
    for(int i=0;i<5;i++)
    {
        cin>>arr[i];
    }

    int max = arr[0];

    for(int i=1 ;i<=4;i++)
    {
        if(max < arr[i])
        {
            max=arr[i];
        }
    }

    cout<<"Maximum number is "<<max<<endl;
}