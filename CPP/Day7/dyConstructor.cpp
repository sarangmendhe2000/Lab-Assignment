#include<iostream>
using namespace std;

class Demo
{
    int *ptr;

    public:

    Demo()
    {
        ptr =new int ;
        *ptr=25;
    }

    void display()
    {
        cout<<"Valuie is - "<<*ptr;
    }
};

int main()
{
    Demo d;
    d.display();
}
