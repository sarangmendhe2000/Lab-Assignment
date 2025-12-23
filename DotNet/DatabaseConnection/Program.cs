namespace DatabaseConnection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Your db choice 1.SqlServer  2.MySqlServwer  3.OracleServer ");
            int opChoice = Convert.ToInt32(Console.ReadLine());

            DataBaseFactory factory = new DataBaseFactory();
            IDatabase someDatabaseObject = factory.GetSomeDatabase(opChoice);

            Console.WriteLine("Enter db Opration choice 1.Insert 2.Update ,Delete");
            int opnChoice = Convert.ToInt32(Console.ReadLine());
            switch (opnChoice)
            {
                case 1:
                    someDatabaseObject.Insert();
                    break;
                case 2:
                    someDatabaseObject.Update();
                    break;
                case 3:
                    someDatabaseObject.Delete();
                    break;
                default:
                    Console.WriteLine("Invalid db choice");
                    break;

            }
        }
    }
    public interface IDatabase
    {
        void Insert();
        void Update();

        void Delete();
    }

    public class MySqlServer : IDatabase
    {
        public void Insert()
        {


            Console.WriteLine("Inserted Successfully in mysql server");
        }
        public void Update()
        {


            Console.WriteLine("Updated  Successfully in mysql server");
        }

        public void Delete()
        {


            Console.WriteLine("Deleted Successfully in mysql server");
        }
    }
    public class SqlServer : IDatabase
    {


        public void Insert()
        {


            Console.WriteLine("Inserted Successfully in sql server");
        }
        public void Update()
        {


            Console.WriteLine("Updated  Successfully in sql server");
        }

        public void Delete()
        {


            Console.WriteLine("Deleted Successfully in mysql server");
        }
    }
    public class OracleServer : IDatabase
    {
        public void Insert()
        {


            Console.WriteLine("Inserted Successfully in Oracle server");
        }
        public void Update()
        {


            Console.WriteLine("Updated  Successfully in Oracle server");
        }

        public void Delete()
        {


            Console.WriteLine("Deleted Successfully in oracle server");
        }
    }
}