#include<iostream>
#include<fstream>
using namespace std;

int main()
{
    fstream myfile("example.txt" , ios::out);

    myfile<<"This is the new line"<<endl;
    myfile<<"This is next line"<<endl;

    myfile.close();

    string line;

    myfile.open("example.txt" , ios::in);
    while(!myfile.eof())
    {
        getline(myfile , line);
        cout<<line<<endl;
    }

    myfile.close();

    myfile.open("example.txt" , ios::app);

    myfile<<"This is the extra line"<<endl;

    myfile.close();
}