#include <iostream>  
using namespace std;
int main()
{
	int numerator, denominator, result;
    cout << "Enter numerator: ";
    cin >> numerator;
    cout << "Enter denominator: ";
    cin >> denominator;
    try{
	if(denominator==0)
	throw 0;
	else
	{
	
    result=numerator/denominator;
    cout<<"result"<<result<<endl;
	}
	cout<<"end";
	}

    catch(...)
	{
		cout<<"something went wrong need to check\n";
	}
		
    

	cout<<"end of the program good bye\n";
}
