#include<iostream>
#include<string.h>

using namespace std;


int main()
{
    char str1[20]= "Hello";
    char str2[20]= "Bye";
    strcat(str1 , str2);
    cout<<"After Concatation the string will become - "<<str1;
}