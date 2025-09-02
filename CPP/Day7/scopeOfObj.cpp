#include<iostream>
using namespace std;


class Test
{
	public:
	Test()
	{
		cout<<"constructor is invoked"<<endl;
	}
	~Test()
	{
		cout<<"destructor is invoked"<<endl;
	}
};
Test t1;
int main()
{
	cout<<"main begins"<<endl;
	Test t2;
	{
		cout<<"block begins"<<endl;
		Test t3;
		cout<<"block ends"<<endl;
	}
	cout<<"main ends"<<endl;
}