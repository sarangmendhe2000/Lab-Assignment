// Can constructor can be declared as constant using const keyword  ?? 

// The purpose of a constructor is used initalialize the member function which invole modifying its member variables.
// therefore decalring the constructor as constant would contradict within iself. 


#include<iostream>
using namespace std;

class Student
{
    int marks;
public:
    const Student()
    {
        marks = 65 ; 
    }

    void show()
    {
        cout<<"The marks of the students is - "<<endl;
    }
};

int main()
{
    Student s1;
    s1.show();

}
