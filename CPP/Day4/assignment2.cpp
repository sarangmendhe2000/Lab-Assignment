#include <iostream>
using namespace std;

class Complex
{
    int real;
    int img;

public:
    void accept()
    {

        cout<<"Enter real and imaginary numbers";
        cin>>real>>img;

    }
    void setReal(int r);
    int getImg() const;
    void show() const
    {
        cout << "Complex Number is " << real << "+ " << img << "i" << endl;
    }
    Complex(int r, int i)
    {
        real = r;
        img = i;
    }
};

// void Complex :: accept() 
// {

//     cout << "Enter real and imaginary numbers";
//     cin >> real >> img;
// }

void Complex ::setReal(int r)
{
    real = r;
}
int Complex :: getImg() const
{
    return img;
}


int main()
{
   const Complex obj(5,2);
    obj.accept();
    obj.show();
    // obj.setReal(10);
    obj.show();
    cout<<"imaginary part is "<<obj.getImg();
}

