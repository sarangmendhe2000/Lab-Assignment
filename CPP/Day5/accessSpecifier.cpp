#include<iostream>
using namespace std;

class Circle
{
    public:
    double radius;

    double area()
    {
        return 3.14*radius*radius;
    }
};

int main()
{
    Circle c;
    c.radius = 6.05; // Here we can access radius 

    cout<<"Radius is "<<c.radius<<endl;
    cout<<"Area is "<<c.area();
}