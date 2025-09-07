#include <iostream>
#include <cstring>
using namespace std;

class Item {
    int itemID;
    char itemName[50];
    float price;
    int stockQuantity;

public:
    Item() {
        itemID = 0;
        strcpy(itemName, "NA");
        price = 0;
        stockQuantity = 0;
    }

    Item(int id, const char* name, float p, int qty) {
        itemID = id;
        strcpy(itemName, name);
        price = p;
        stockQuantity = qty;
    }

    float getPrice() const { return price; }
    const char* getName() const { return itemName; }
    int getID() const { return itemID; }
    int getQty() const { return stockQuantity; }

    void reduceStock(int q) { stockQuantity -= q; }

    void display() const {
        cout << "ID: " << itemID << " | Name: " << itemName
             << " | Price: " << price << " | Stock: " << stockQuantity << endl;
    }
};

class Bill {
    int billID;
    char customerName[50];
    Item purchasedItems[20]; // fixed-size array instead of vector
    int quantities[20];      // parallel array for purchased quantities
    int itemCount;

public:
    Bill(int id, const char* name) {
        billID = id;
        strcpy(customerName, name);
        itemCount = 0;
    }

    // Overload + to add item
    Bill& operator+(Item& it) {
        if (itemCount < 20) {
            purchasedItems[itemCount] = it;
            quantities[itemCount] = 1; // default 1 quantity for now
            itemCount++;
        }
        return *this;
    }

    // Overload << to display bill
    friend ostream& operator<<(ostream& out, const Bill& b) {
        out << "-----------------------------\n";
        out << "Bill ID: " << b.billID << "\n";
        out << "Customer: " << b.customerName << "\n";
        out << "Items Purchased:\n";
        float total = 0;
        for (int i = 0; i < b.itemCount; i++) {
            out << b.purchasedItems[i].getName()
                << "  x" << b.quantities[i]
                << "  Price: " << b.purchasedItems[i].getPrice() * b.quantities[i] 
                << endl;
            total += b.purchasedItems[i].getPrice() * b.quantities[i];
        }
        out << "-----------------------------\n";
        out << "Total Amount: " << total << endl;
        out << "-----------------------------\n";
        return out;
    }
};

int main() {
    // Create some store items
    Item laptop(101, "Laptop", 50000, 10);
    Item mouse(102, "Mouse", 800, 50);
    Item keyboard(103, "Keyboard", 1500, 20);

    // Display items
    cout << "Available Items:\n";
    laptop.display();
    mouse.display();
    keyboard.display();

    // Create a bill
    Bill bill1(1, "Sarang");

    // Add items to the bill (operator+)
    bill1 + laptop;
    bill1 + mouse;

    // Display bill (operator<<)
    cout << bill1;

    return 0;
}
