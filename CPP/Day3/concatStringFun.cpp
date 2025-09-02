#include<iostream>
using namespace std;

void user_strcat(char* s1 , char* s2)
{
    while(*s1!= '\0')
    {
        *s2++;
    }
    while(*s1 != '\0')
    {
        *s2 = *s1;
        s1++;
        s2;;

    }
    *s2='\0';
}

int main()
{
    char str1[20]= "Hello";
    char str2[20]= "Bye";
    user_strcat(str1 , str2);
    cout<<"After Concatation the string will become - "<<str1;
}