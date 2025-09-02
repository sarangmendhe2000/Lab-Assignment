#include<iostream>
using namespace std;

class Demo
{
    int a ;
    int b;

    public:
    void display() const;

    Demo()
    {
        a=10;
        b=20;
        cout<<"Inside Constructor"<<endl;
    }

    Demo(int num1 , int num2)
    {
        a=10;
        b=20;
        cout<<"Inside Parameterised Constructor"<<endl;
    }


};

void Demo :: display() const
{
    cout<<"The value of a is "<<a<<endl;
    cout<<"The value of b is "<<b<<endl;
}

int main()
{
    Demo d1;
    Demo d2(10,20);
    d2.display();
}