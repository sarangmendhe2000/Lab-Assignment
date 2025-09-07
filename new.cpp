#include<iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter total number of student : ";
    cin>>n;

    float* gpa;
    gpa = new float[n];

    cout<<"Enter GPA of students-"<<endl;

    for(int i=0;i<n;i++)
    {
        cout<<"Student "<<i+1<<" : ";
        cin>>gpa[i];
    }

    cout<<"Displaying GPA "<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<"Student - "<<i+1<<" :- "<<gpa[i]<<endl;;
    }
}