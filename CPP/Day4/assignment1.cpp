#include<iostream>
using namespace std;

class Cdate
{
    int dd, mm , yy;
    public:

    int getDay() const;

    Cdate(int d , int m , int y)
    {
        dd= d;
        mm=m;
        yy=y;
    }

    void display() const
    {
        cout<<"display Date -";
        cout<<dd<<mm<<yy;
    }
    void setDay(int day)
    {
        dd= day;
       
    } 
};

int Cdate :: getDay() const
{
    return dd;
}

int main()
{
  const Cdate obj1(25,8,2025);
    obj1.setDay(20);
    obj1.display();
}
