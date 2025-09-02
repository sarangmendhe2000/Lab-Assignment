#include <iostream>
using namespace std;

   class cDate
   {
   	int dd, mm, yy;
   	
   	public:
   		
   		void accept();
   		void display();
   		void setDate(int);
   		int getDate();
   };
   
   void cDate ::  accept()
   {
   	cout<<"Enter date , month , year "<<endl;
   	cin>>dd>>mm>>yy;
   }
   
   void cDate :: display()
   {
   	cout<<dd<<"/"<<mm<<"/"<<yy<<endl;
   }
   
   void cDate :: setDate(int date)
   {
   	 dd = date; 
   }
   
   int cDate :: getDate()
   {
   	return mm;
   }
   
   
int main()
{
	cDate c1;
	c1.accept();
	c1.display();
	c1.setDate(22);
	c1.getDate();
	
	cout<<"Month is "<<c1.getDate();
}