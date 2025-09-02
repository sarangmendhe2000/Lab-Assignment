#include<iostream>
using namespace std;

class Base
{
    int pvt= 20;

    protected:
    int prot = 30;

    public:
    int pub = 40;

    int getPvt()
    {
        return pvt;

    }
};

class PublicDerived : public Base

{
    public:

    int getProt()
    {
        return prot;
    }

};

int main()
{
    PublicDerived obj ;

    cout<<"Private = "<<obj.getPvt()<<endl;
    cout<<"Protected = "<<obj.getProt()<<endl;
    cout<<"Public = "<<obj.pub<<endl;
    cout<<"public = "<<obj.prot<<endl; // we can not call protected here , it is not accessible in main directly
}