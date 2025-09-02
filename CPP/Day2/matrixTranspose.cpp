#include <iostream>
using namespace std;

int main()
{
    int i, j;
    int a[3][3];
    int transpose[3][3];

    cout << "Enter matrix value" << endl;
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            cin >> a[i][j];
        }
    }

    cout<<"Transpose of the matrix will be - "<<endl;

     for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            transpose[j][i]= a[i][j];
        }
    }

    //Showing matrix
     for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            cout<<transpose[i][j]<<" ";
        }
        cout<<endl;
    }
     
}