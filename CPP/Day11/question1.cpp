#include <iostream>
#include <string>

using namespace std;

class Items
{
    int iid;
    string name;
    float price;
    int stock;
    int quantity;

public:
    Items()
    {
        iid = 0;
        name = "";
        price = 0.0f;
        stock = 0;
        quantity = 0;
    }

    Items(int id, string name, float p, int s, int q)
    {
        iid = id;
        this->name = name;
        price = p;
        stock = s;
        quantity = q;
    }

    void getArray(Items getArr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            int id, stock, quantity;
            float price;
            string name;

            cout << "Enter Id " << endl;
            cin >> id;
            cout << "Name - " << endl;
            cin >> name;
            cout << "Price - " << endl;
            cin >> price;
            cout << "Stock - " << endl;
            cin >> stock;
            cout << "Quantity - " << endl;
            cin >> quantity;
            getArray[i] = Items(iid, name, price, stock, quantity);
        }
    }

    void display()
    {
        cout << "Id is - " << iid << endl;
        cout << "Name is - " << name << endl;
        cout << "Price - " << price << endl;
        cout << "Stock - " << stock << endl;
        cout << "Quantity - " << quantity << endl;
    }

    // void exception(Items *t)

    // {
    //     if (t->quantity > t->stock)
    //     {
    //         throw runtime_error("Out of stock");
    //     }
    //     if (t->price == 0)
    //     {
    //         throw runtime_error("Invalid Price");
    //     }
    //     if (t->stock < 0)
    //     {
    //         throw runtime_error("Invalid value of stock");
    //     }
    // }

    Items operator+(Items &p)
    {

        if (p.price <= 0)
            throw runtime_error("Invalid Price");
        if (p.stock < 0)
            throw runtime_error("Invalid value of stock");
        if (p.quantity > p.stock)
            throw runtime_error("Out of stock");


        Items temp;

        temp.price = this->price + (p.price * p.quantity);
        // exception(&p);
        return temp;
    }
};

class Bill : public Items
{
    int bid;
    string cname;
    int n;
    Items *arr;

public:
    Bill()
    {
        bid = 0;
        cname = "";
        n = 0;

        arr = new Items[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = 0;
        }
    }
    Bill(int id, string name, int n, Items *obj)
    {
        bid = id;
        cname = name;
        this->n = n;
        arr = new Items[n];

        for (int i = 0 ; i < n; i++)
        {
            arr[i] = new Items();
            arr[i] = obj[i];
        }
    }

    void displayBill()
    {
        cout << "-----------------" << endl;
        cout << "Bill Id -" << bid;
        cout <<r nam "Customee - " << cname;
    }

    void totalPrice(Items sum, Items getArray[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            sum = sum + getArray[i];
        }
        cout << "Sum is - " << sum;
    }
};

int
main()
{
    int n;
    cout << "Enter total items ";
    cin >> n;

    Items sum;

    Items getArr[n];
    Items *obj = new Items[n];

   
    getArr[0].getArray(getArr, n);
    obj->display();

    Bill b1(101, "Akshat", n, obj);

    b1.displayBill();
    b1.totalPrice(sum , getArr , n);
}