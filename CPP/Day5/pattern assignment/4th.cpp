#include<iostream>
using namespace std; 

int main()
{
    

    for(int i=0 ;i<5 ;i++)
    {
        for(int j=5-i-1 ;j>0;j--)
        {
            cout<<"  ";
        }
        char ch = 'A';
        for(int k=0 ;k<(2*i +1); k++ )
        {
            cout<<ch<<" ";
            ch++;
        }
        cout<<endl;
        
        
    }
}