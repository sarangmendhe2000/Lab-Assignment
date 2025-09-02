#include<iostream>
using namespace std;

class Student
{
    public:

    int rollno;
    string dob;
    float marks;

     Student() 
     {
        rollno = 0 ;
        dob ="";
        marks= 0.0f;
     }

           Student(int roll, string date , float mark)
    {
        rollno = roll ;
        dob = date;
        marks = mark;
    }

    void display() 
    {
        cout<<"Roll number is "<<rollno;
        cout<<"DOB is - "<<dob;
        cout<<"Marks = "<<marks;
        cout<<endl;
    }
};

void sort(Student arr[] , int size)
{
    for(int i=0;i<size-1;i++)
    {
        for(int j=0;j<size-1-i;j++)
        {
            if(arr[j].rollno > arr[j+1].rollno)
            {
                Student temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= temp;
            }
        }
    }
}

int main()
{
    Student s[10] ;

    for(int i=0;i<10;i++)
    {
        int roll ;
        string dob;
        float marks;

        cout<<"Enter roll number - ";
        cin>>roll;

        cout<<"Enter DOB - ";
        cin>>dob;

        cout<<"Enter marks ";
        cin>>marks;

        s[i]= Student(roll , dob , marks);
    }

    sort(s , 10);
    cout<<"Displaying the details ....";

    for(int i=0;i<10;i++)
    {
        s[i].display();
    }
}
