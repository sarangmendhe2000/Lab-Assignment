#include<iostream>
using namespace std;

class Complex
{
    int real;
    int img;

    public:

    Complex()
    {
        this->real =0;
        this->img =0;
    }

    Complex(int real , int img)
    {
        this->real = real;
        this->img = img;
    }

   Complex operator+(Complex &obj)
    {
        Complex temp;
        temp.real = this->real + obj.real;
        temp.img = this->img + obj.img;
        return temp;
    }

    Complex operator-(Complex obj2)
    {
        Complex temp;
        temp.real = real - obj2.real;
        temp.img= img = obj2.img;
        return temp;
    }

    void display()
    {
        cout<<"Additon of Complex number is "<<real<<"+"<<img<<"i"<<endl;
    }
    void display2()
    {
        cout<<"Subtraction of Complex number is "<<real<<"+"<<img<<"i"<<endl;
    }
};

int main()
{
    Complex c1(8,5);
    Complex c2(5,2);
    Complex c3 = c1+c2;
    c3.display();
    Complex c4 = c1-c2;
    c4.display2();

}

