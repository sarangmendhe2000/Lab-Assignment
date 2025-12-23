namespace Singleton
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter you Database Choice :  1. SQL Server 2.MySQl server 3.Oracle Server");

            int opChoice = Convert.ToInt32(Console.ReadLine());

            DatabaseFactory factory = new DatabaseFactory();
            Database obj = factory.getDatabaseName(opChoice);


            Console.WriteLine("Enter Operation name : 1. Insert 2. Update 3. Delete");

            int opn = Convert.ToInt32(Console.ReadLine());

            switch (opn)
            {

                case 1:
                    obj.Insert();
                    break;
                
                case 2:
                    obj.Update(); 
                    break;
                case 3:
                    obj.Delete();
                    break;
                default:
                    Console.WriteLine("Invalid Choice");
                    break;
            }
        }
    }
}
