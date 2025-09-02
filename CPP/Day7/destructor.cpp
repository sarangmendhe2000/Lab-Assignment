#include<iostream>
#include<string.h>
using namespace std;

class string1
{
    int len;
    char *ptr;

    public:

    string1()
    {
        len = 1;
        ptr = new char[len];
        *ptr = 'S';
    }
    void display()
    {
        if(len>1)
        {
            cout<<"Length of character is "<<len<<endl;
            cout<<"String is "<<ptr<<endl;
        }
        else
        {
            cout<<"Length of character is "<<len<<endl;
            cout<<"Character is - "<<*ptr<<endl;
        }
    }

    string1(char* s)
    {
        len = strlen(s);
        ptr = new char[len+1];
        strcpy(ptr , s);    
    }

    string1(char c , int l)
    {
        len = l;
    ptr = new char[len+1];

    for(int i=0;i<len;i++)
    {
        ptr[i]= c;
    }
    ptr[len]= '\0';
    }

    string1(int l)
    {
        len = l;
        ptr = new char[len+1];
        cout<<"Enter string - "<<endl;
        cin>>ptr;
    }

    ~string1()
    {
        if(ptr)
        {
            cout<<"Destructor is called ..."<<endl;
            delete[]ptr;
            ptr = NULL;
        }
    }
    
};

int main()
{
    string1 s1;
    s1.display();

    string1 s2("rohit");
    s2.display();

    string1 s3('*' , 10);
    s3.display();

    string1 s4(10);
    s4.display();
}