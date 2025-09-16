#include<iostream>
using namespace std;

inline int cube(int c)
{
    return c*c*c;
}

int main()
{
    cout<<"Cube is "<<cube(5)<<endl;
}