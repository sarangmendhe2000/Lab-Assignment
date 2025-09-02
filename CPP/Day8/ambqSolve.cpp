#include<iostream>
using namespace std;

class Base
{
    public:

    Base(int x)
    {
        cout<<"Base class constructor called"<<endl;
    }
    Base()
    {
        cout<<"Default base class constructor called"<<endl;
    }
};

class Parent1 : virtual public Base
{
    public:
    Parent1(int x)
    {
        cout<<"Parent1 constructor called...."<<endl;
    }
};

class Parent2 :virtual public Base
{
    public:

    Parent2(int x) 
    {
        cout<<"Parent2 constructor is called"<<endl;
    }
};

class Child : public Parent1 , public Parent2
{
    public : 

    Child(int x) : Parent1(x) , Parent2(x)
    {
        cout<<"Child class constuctor is called"<<endl;
    }
};

int main()
{
    Child c(30) ;
    cout<<sizeof(c);


}