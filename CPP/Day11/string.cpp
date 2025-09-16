#include<iostream>
using namespace std;

int main()
{
    string str = "My name is Sarang";
    string str1="";
    int space =0;
    int vowel =0;

    for(int i=str.length()-1;i>=0;i--)
    {
        str1= str1+str[i];
    }

    if(str == str1)
    {
        cout<<"String is palindrome"
    }

    cout<<str1;
}