#include<iostream>
using namespace std;

class ABC 
{
    public:
    int a ;
    ABC()
    {
        a=10;
    }

};

int main()
{
    const ABC obj;
    cout<<"The value of a is "<<obj.a<<endl;
    // obj.a = 200;   read only
    cout<<"New value of a is - "<<obj.a<<endl;
}