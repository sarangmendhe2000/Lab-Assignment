#include<iostream>
using namespace std;

// void show()
// {
//     int x = 0;
//     cout<<x;
//     x++;
// }

// int main()
// {
//      show();
//      show();
//      show();
// }

// While we declaring the int static its scope remain throghout the liftime of the program 

void show()
{
    static int x = 0;
    cout<<x;
    x++;
}

int main()
{
     show();
     show();
     show();
}
