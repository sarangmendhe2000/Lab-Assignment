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

class privateDerived : private Base

{
    public:

    int getProt()
    {
        return prot;
    }

    int getPub()
    {
        return pub;
    }

};

int main()
{
    privateDerived obj;

        // cout<<"Private = "<<obj.getPvt()<<endl;  //Not accessible because it is in base class (public -> private in derived class)
        // cout<<"protected = "<<obj.prot;  // Not accessible
       cout<<"Protected = "<<obj.getProt()<<endl;
    //    cout<<"Public = "<<obj.pub<<endl;  

    cout<<"Public = "<<obj.getPub()<<endl;
    cout<<"Private is not accessible"<<endl;
}