#include<iostream>
using namespace std;

class A 
{
    public:

    void show()
    {
        cout<<"Show method of A class"<<endl;
    }
};
class B 
{
    public:

    void show()
    {
        cout<<"Show method of B class"<<endl;
    }
};

class C : public  A , public  B

{
    public: 

    void display()
    {
        cout<<"Display method of class C "<<endl;
    }
};

int main()
{
    C c ;
    // c.show();
    c.A::show();
    c.B::show();
}