#include<iostream>
#include<string.h>
using namespace std;

class String
{
    public: 

    int len;
    char* ptr;

    // public:

    String(char* s)
    {
        len = strlen(s);
        ptr = new char[len+1];
        strcpy(ptr , s);
    }

    void display()
    {
        cout<<"Address of ptr is "<<(void*)ptr<<endl;
    }

    ~String ()
    {
        cout<<"Destructor is called for  "<<ptr<<endl;
        delete[] ptr;
    }
};

int main()
{
    String s1("Hello") ;

    String s2 = s1;

    cout<<"Before S1 is modified - "<<endl;
    s1.display();
    s2.display();

    s1.ptr[0]= 'S';
    s2.ptr[0]= 'Q';

     cout<<"After S1 is modified - "<<endl;
    s1.display();
    s2.display();
    
    return 0;
}