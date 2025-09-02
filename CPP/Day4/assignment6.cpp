//It prove that the address of cuurent object is hold by this pointer

#include<iostream>
using namespace std;

class test
{
    int a, b;

    public:

    void show()
    {
        a=20;
        b=40;

        cout<<"Address of this is -"<<this<<endl;
        cout<<"The value of a is - "<<a<<endl;
        cout<<"The value of b is - "<<b<<endl;
    }
};

int main()
{
    test t;
    cout<<"Address of the object is "<<&t<<endl;
    t.show();
}