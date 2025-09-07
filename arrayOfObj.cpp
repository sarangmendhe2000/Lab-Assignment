#include<iostream>
using namespace std;

class Employee
{
    int id;
    char name[30];
    public:
    void setData()
    {
        cout<<"Enter id";
        cin>>id;
        cout<<"Enter name";
        cin>>name;
    }

    void getData()
    {
        cout<<"Id is -"<<id<<endl;
        cout<<"Name is - "<<name<<endl;
        
    }


};

int main()
{
    Employee e1[30];
    int i , n;
    cout<<"Enter total Employee ";
    cin>>n;
    for(i=0;i<n;i++)
    {
        e1[i].setData();
    }
    cout<<"Employee data will be - "<<endl;
    for(i=0;i<n;i++)
    {
        e1[i].getData();
    }
}