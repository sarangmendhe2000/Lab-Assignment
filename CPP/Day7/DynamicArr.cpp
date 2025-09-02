#include<iostream>
using namespace std;
class Student{

    int rollno;
    char name[10];
    public:
    void acccept()
    {
        cout<<"Enter roll number  - "<<endl;
        cin>>rollno;
        cout<<"Enter Name - "<<endl;
        cin>>name;
    }
    void display()
    {
        cout<<"Roll mumber \n"<<rollno<<"Name is \n"<<name<<endl;
    }

    ~Student()
    {
        cout<<"Destructor is calling......."<<endl;
    }

};

int main()
{
    int i , n;
    

    cout<<"Enter total numbers"<<endl;
    cin>>n;
    Student* ptr =new Student[n];
    for(i=0;i<n;i++)
    {
        ptr[i].acccept();
    }
    cout<<"Displaying details"<<endl;
    for(int i=0;i<n;i++)
    {
        ptr[i].display();
    }

    delete[] ptr;

    // cout<<"Displaying details "<<endl;
    // for(int i=0;i<n;i++)
    // {
    //     ptr[i].display();
    // }
}