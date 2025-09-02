#include<iostream>
using namespace std;

int y=10;

void show()
{
    cout<<y<<endl;
    static int y; // y=0;
    cout<<y<<endl;
    y++;
    cout<<y<<endl;
}
int main()
{
    cout<<y<<endl;
    y++;
    show();
    cout<<y<<endl;
}