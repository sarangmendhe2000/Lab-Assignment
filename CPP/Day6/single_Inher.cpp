#include<iostream>
using namespace std;

class A
{
    float bonus=5000;

    public:
    int getBonus()
    {
        return bonus;
    }
};

class B : private A
{
    public:
    float sal = 32000;  

    void calcSalary()
    {
        cout<<sal+getBonus();
    }
};


int main()
{
    B obj;
    obj.calcSalary();
}