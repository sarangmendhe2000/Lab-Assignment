#include<iostream>
using namespace std; 

class Parent
{
    public: 
    int p_id;

};

class Child : public Parent
{
    public:
    int c_id;

};

int main()
{
    Child obj;
    obj.p_id = 101;
    obj.c_id=501;
    cout<<"Parent id is - "<<obj.p_id<<endl;
    cout<<"Child id is - "<<obj.c_id; 
}

// Here we can access both parent and child class Id because when we created the object of the base class memory is created for both the base class as well as derived class