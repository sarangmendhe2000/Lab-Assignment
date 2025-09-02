// Copy String into another string

#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    char str1[50]="Hello World";
    char str2[50];

    strcpy(str2, str1);
    cout<<"After copying string into new string"<<endl;
    cout<<str2;
    


}




