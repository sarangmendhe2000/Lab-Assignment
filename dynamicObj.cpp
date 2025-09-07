#include<iostream>
using namespace std;

class cDate
{
    int dd , mm , yy;

    public:

    cDate()
    {
        dd=0;
        mm=0;
        yy=0;
    }

    cDate(int d , int m , int y)
    {
        dd=d;
        mm=m;
        yy=y;
    }

    void display()
    {
        cout<<"Date is "<<dd<<"/"<<mm<<"/"<<yy<<endl;
    }
};

int main()
{
    cDate* obj = new cDate(20,06,2000);
    
    obj->display();
}