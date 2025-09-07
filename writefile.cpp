#include<iostream>
#include<fstream>
using namespace std;

int main()
{
    ofstream myfile("example.txt" , ios::app);

    myfile<<"Here is first line"<<endl;
    myfile<<"Here is second line"<<endl;
    myfile<<"Here is third line"<<endl;
    myfile<<"Here is fourth line"<<endl;

    myfile.close();

}