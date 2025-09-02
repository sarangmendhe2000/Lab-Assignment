#include<iostream>
using namespace std;

class Animal
{
    public: 

    Animal()
    {
        cout<<"Constructor calling ...."<<endl;
    }

    void eat()
    {
        cout<<"All Animal eat food"<<endl;
    }
};

class Mammal : public Animal
{
    public:

    void walk()
    {
        cout<<"All mammals can walk on land"<<endl;
    }
};

class Dog : public Mammal
{
    public:

    void bark()
    {
        cout<<"Dog can  bark"<<endl;
    }
};

int main()

{
    Dog d ;
    d.eat();
    d.walk();
    d.bark();
}