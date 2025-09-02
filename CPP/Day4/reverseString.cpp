#include<iostream>
using namespace std;

int main()
{
    string str = "Hello I am Sarang";
    string new_str="";

    // const char* str_ptr = str.c_str();


    for(int i=str.length()-1;i>=0;i--)
    {
        // new_str+= *(str_ptr+i);
        new_str+= str[i];
    }

    cout<<"After reverse new string will be - "<<endl;
    cout<<new_str;
}