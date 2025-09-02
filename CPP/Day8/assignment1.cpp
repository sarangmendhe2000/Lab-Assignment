#include <iostream>
using namespace std;


class Employee {
public:
    int id;

    Employee() {
        cout << "Employee default constructor called." << endl;
    }
};


class Manager : virtual public Employee {
public:
    double petrol_allow;
    double food_allow;

    Manager() {
        cout << "Manager default constructor called." << endl;
    }
};



class Salesperson : virtual public Employee {
public:
    double sales;
    double commission;

    Salesperson() {
        cout << "Salesperson default constructor called." << endl;
    }
};


class SalesManager : public Manager, public Salesperson {
public:
    SalesManager() : Employee(), Manager(), Salesperson() {
        cout << "SalesManager constructor called." << endl;
    }
};

int main() {
    
    SalesManager sm;

    // We can't initialize the ID here as it's not a constructor parameter.
    // Instead, we would have to set it after the object is created.
    sm.id = 101; 

    cout << "\nSales Manager ID: " << sm.id << endl;
    

    return 0;
}