// Copy string into another string without using predefined function 

#include<iostream>
#include<string.h>
using namespace std;

void user_strcpy(char* s1 , char* s2)
{
    while (*s1 != '\0')    
    {
        *s2= *s1;
        s1++;
        s2++;
    }
    *s2 = '\0';
    
}
int main()
{
    char str1[20];
    char str2[30];

    cout<<"Enter string : ";
    cin>>str1;
    user_strcpy(str1 , str2);
    cout<<"After copying successfully new string is - "<<str2<<endl;
}
