#include<iostream>
using namespace std;


//Call by value 


// void swap(int p , int q)
// {
//     p= p+q;
//     q=p-q;
//     p=p-q;

//     cout<<"Inside swap function the value of a = "<<p<<" b= "<<q<<endl;
// }
// int main()
// {
//     int a= 10 , b= 20;
//     cout<<"Before Swapping a = "<<a <<" b= "<<b<<endl;
//     swap(a,b);
//     cout<<"After swapping in main function a = "<<a<<" b = "<<b<<endl;
// }


// Call by address
// void swap(int* p , int* q)
// {
//     *p= *p+*q;
//     *q=*p-*q;
//     *p=*p-*q;

//     cout<<"Inside swap function the value of a = "<<*p<<" b= "<<*q<<endl;
// }

// int main()
// {
//     int a= 10 , b= 20;
//     cout<<"Before Swapping a = "<<a <<" b= "<<b<<endl;
//     swap(&a,&b);
//     cout<<"After swapping in main function a = "<<a<<" b = "<<b<<endl;
// }


//Call by Reference


void swap(int &p , int &q)
{
  
    p=p+q;
    q=p-q;
    p=p-q;

    cout<<"Inside swap function the value of a = "<<p<<" b= "<<q<<endl;
}

int main()
{
    int a= 10 , b= 20;
    cout<<"Before Swapping a = "<<a <<" b= "<<b<<endl;
    swap(a,b);
    cout<<"After swapping in main function a = "<<a<<" b = "<<b<<endl;


}






