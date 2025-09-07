#include<iostream>
using namespace std;

class Student
{
    int rollnum;
    char name[30];
    int marks[5];

    public:

    void display()
    {
        int sum=0;
        int avg;
        cout<<"Enter roll number : ";
        cin>>rollnum;
        cout<<"Enter name of the Student : ";
        cin>>name;
        cout<<"Enter marks for each subject ";
        for(int i=0;i<5;i++)
        {
            cout<<"Subject "<<i+1<<" :- ";
            cin>>marks[i];
            sum = sum+marks[i];
        }

        avg = sum/5;
        
        cout<<"Roll number - "<<rollnum<<endl;
        cout<<"Name is -"<<name<<endl;
        cout<<"Average is - "<<avg;

        
    }
};

int main()
{
    int n;
    cout<<"Enter Number of Student ";
    cin>>n;
    Student* s = new Student[n];
    for(int i=0;i<n;i++)
    {
        s[i].display();
    }
}