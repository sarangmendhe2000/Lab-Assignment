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

class protectedDerived : protected Base

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
    protectedDerived obj ;

    // cout<<"Private = "<<obj.getPvt()<<endl;   //All public attributes and data members become proteces here , therefore it is not accessible here directly
    cout<<"Protected = "<<obj.getProt()<<endl;
    // cout<<"Public = "<<obj.pub<<endl;  //  This is also public therefore we can't access it diectly 

    cout<<"Public = "<<obj.getPub()<<endl;
    cout<<"Private is not accessible"<<endl;

}