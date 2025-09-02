#include <iostream>
using namespace std;

int main() {
    int n = 5;

    for (int i = 1; i <= n; i++) {
        
        for (int j = n - i; j > 0; j--) {
            cout << "  ";
        }

      
        int num = i;
        for (int k = 1; k <= i; k++) {
            cout << num << " ";
            num++;
        }

       
        num -= 2; 
        for (int k = 1; k < i; k++) {
            cout << num << " ";
            num--;
        }

        cout << endl;
    }

   
}