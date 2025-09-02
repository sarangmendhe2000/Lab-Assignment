#include<iostream>
using namespace std;

class Circle
{
    
    double radius;

    public:
    double area()
    {
        return 3.14*radius*radius;
    }
};

int main()
{
    Circle c;
    c.radius = 6.05; // Here we get error because we are tring to access radius which is declared as private

    cout<<"Radius is "<<c.radius<<endl;
    cout<<"Area is "<<c.area();
}