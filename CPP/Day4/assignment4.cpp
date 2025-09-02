#include<iostream>
using namespace std;

class temp
{
    public:
    void show()
    {
        cout<<"Non constant method"<<endl;
    }

    void show() const 
    {
        cout<<"Constant method";
    }
};

int main()
{
    temp t;
    t.show();
    const temp t2;
    t2.show();
}