#include<iostream>
#include<fstream>
using namespace std;

int main()
{

    ifstream myfile("example.txt");
    string line;
    
    while(!myfile.eof())
    {
        getline(myfile , line);

        cout<<line<<endl;
    }

    myfile.close();
}

