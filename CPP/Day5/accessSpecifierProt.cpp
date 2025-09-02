#include<iostream>
using namespace std;

class Parent
{
    protected:

    int id;

};

class Child : public Parent
{
    public:

    void setId(int setId)
    {
        id= setId;
    }

    void display()
    {
        cout<<"Protected ID is "<<id<<endl;
    }

};

int main()
{
    Child c1;
    c1.setId(2077); // Here the member function of the derived class can access the protected data member of the base class 
    c1.display(); // Therefore we do not get error here...
}