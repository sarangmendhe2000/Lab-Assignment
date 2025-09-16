#include<iostream>
#include<string.h>
using namespace std;

class String 
{
    public:

    int len;
    char* ptr;

    String(char* s)
    {
        len = strlen(s);
        ptr = new char(len+1);
        strcpy(ptr , s);
    }

    //Copy Constructor
    String(String& s)
    {
        ptr = new char[strlen(s.ptr)+1];
        strcpy(ptr , s.ptr);
    }

    void display()
    {
        cout << "Displaying address of ptr: " << (void*)ptr << " and value: " << ptr << endl;
    }

    ~String()
    {
        delete [] ptr;
        cout << "Destructor is called for address: " << (void*)ptr << " with content: " << ptr << endl;
    }
};

int main()
{
    String s1("Hello");
    String s2 = s1;

    cout<<"Before S1 is modified - "<<endl;
    s1.display();
    s2.display();

   
    s1.ptr[0]= 'S';
    s2.ptr[0]= 'Q';

    cout<<"After S1 is modified - "<<endl;
    s1.display();
    s2.display();

}