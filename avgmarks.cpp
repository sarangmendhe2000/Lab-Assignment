#include<iostream>
using namespace std;

class Student

{
    char name[20];
    int marks[5];

    public:
    int avg , sum=0;

    void accept()
    {
        cout<<"Enter name of the student  ";
        cin>>name;
        for(int i=0;i<5;i++)
        {
            cout<<"Enter marks for subject "<<i+1<<": ";
            cin>>marks[i];
            sum = sum+marks[i];
        }
        avg= sum/5;
    }
    void display()
    {
        cout<<"Name -  "<<name<<endl;
        cout<<"Avg - "<<avg;

    }
};

int main()
{
    int n;
    cout<<"Enter total number of student : ";
    cin>>n;
    Student* s = new Student[n];

    for(int i=0;i<n;i++)
    {
        s[i].accept();
    }

    cout<<"Displaying the details "<<endl;
    for(int i=0;i<n;i++)
    {
        s[i].display();
    }
}