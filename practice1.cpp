#include<iostream>
using namespace std;

class Item
{
    int itemId;
    char itemName;
    float price;
    int stockQuantity;

    public:

    Item(int id , char name , float amount , int quantity)
    {
        itemId = id;
        itemName =name;
        price = amount;
        stockQuantity = quantity;
    }


};

class Bill : public Item
{
    int billId;
    char customerName;
    int purchaseItem[];
};

int main()
{
    int n , itemId , quantity;
    char name;
    float price;
    cout<<"Enter total number of objects : ";
    cin>>n;
    for(int i=0;i<n;i++)
    {
        cout<<"Item Id :- ";
        cin>>itemId;
        cout<<"Item Name :- ";
        cin>>name;
        cout<<"Price :- ";
        cin>>price;
        cout<<"Quantity :- ";
        cin>>quantity;
    }
}