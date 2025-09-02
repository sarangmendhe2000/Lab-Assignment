#include<iostream>
using namespace std;

int main()
{
    int arr[6] = {25,1,3,8,2,-5};
    int i ,j;

    for(i=0 ; i<6;i++)
    {
        for(j=0;j<6-i;j++)
        {
            if(arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
    }

    cout<<"Second largest element in the array is -  "<<arr[1];

}


