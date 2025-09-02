#include<iostream>
using namespace std;

int main()
{
    int a[5],i;
cout<<"Enter 5 elements ";
for(i=0;i<5;i++)
{
    cin>>a[i];

}

int max= *(a+0);

for(i=1;i<5;i++)
{
    if(max < *(a+i))
    {
        max = *(a+i);
    }
}

cout<<"Meximum element is = " << max;
}
