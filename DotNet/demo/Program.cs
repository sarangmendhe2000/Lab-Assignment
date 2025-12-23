namespace demo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the value of A ");
            string input = Console.ReadLine();
            int a = Convert.ToInt32(input);

            Console.WriteLine("Enter the value of B ");
            string input2 = Console.ReadLine();
            int b = Convert.ToInt32(input2);


            operation op = new operation();

            op.Addition(a,b);
            op.Substraction(a,b);
            op.Multiplication(a,b);
            op.Division(a,b);
        }
    }
}
