#include<iostream>
using namespace std;

int main()
{
    int num , deno , result , arr[4]={1,2,3,4};

    int index;

    cout<<"Enter array index : ";
    cin>>index;

    try
    {
        if(index >= 4)
        {
            throw "Error: Array out of bound";
        }
        else
        {
            cout<<"Enter num : ";
            cin>>num;
            cout<<"Enter Deno : ";
            cin>>deno;

            if(deno == 0)
            {
                throw 0;
            }

            else
            {
                arr[index]= num/deno;
            }
        }
    }

    catch (const char* msg)
    {
        cout<<msg<<endl;
    }
    catch (int num)
    {
        cout<<"Can not be divided by "<<num;
    }
    catch(...)
    {
        cout<<"Unexcepted exception! ";
    }

    return 0;

}