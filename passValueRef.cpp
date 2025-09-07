#include<iostream>
using namespace std;

// void swap(int a , int b)
// {
//     int temp;
//     temp = a;
//     a=b;
//     b=temp;
// }

// int main()
// {
//     int a = 10;
//     int b = 20;

//     cout<<"Before Swapping : a = "<<a<<" b= "<<b<<endl;

//     swap(a, b);

//     cout<<"After Swapping : a = "<<a<<" b= "<<b<<endl;
// }




//pass by reference 

void swap(int* a , int* b)
{
    int temp;
    temp = *a;
    *a=*b;
    *b=temp;
}

int main()
{
    int a = 10;
    int b = 20;

    cout<<"Before Swapping : a = "<<a<<" b= "<<b<<endl;

    swap(&a, &b);

    cout<<"After Swapping : a = "<<a<<" b= "<<b<<endl;
}