#include<iostream>
using namespace std;

class A
{

    public:

    A()
    {
     cout<<"A's constructor is called...."<<endl;
    }
};

class B
{

    public: 

    B()
    {
        cout<<"B's constructor is  called...."<<endl;
    }
};


class C : public B , public A
{
    public:
     C()
     {
        cout<<"C's constructor isn called....."<<endl;
     }

};
int main()
{
    
}