// See https://aka.ms/new-console-template for more information
using Day9_Database.DAL;
using Day9_Database.Models;

Console.WriteLine("Hello, World!");


DBContext dBContext = new DBContext();  

while (true)
{
    Console.WriteLine("Press 1 for Login");
    Console.WriteLine("Press 2 for Registration");
    Console.WriteLine("Press 3 for Forget Password");

    Console.WriteLine("Enter choice : ");
    int choice = Convert.ToInt32(Console.ReadLine());

    switch(choice)
    {
        case 1 :
            Console.WriteLine("Enter Username");
            string name = Console.ReadLine();
            Console.WriteLine("Enter Pasword");
            string pass = Console.ReadLine();


            dBContext.LoginUser(name , pass);

            break;

            case 2 :

            User user = new User();

            Console.WriteLine("Enter Name");
            user.username = Console.ReadLine();
            Console.WriteLine("Enter Password");
            user.password = Console.ReadLine();

            dBContext.RegisterUser(user);

            break;
    }
}