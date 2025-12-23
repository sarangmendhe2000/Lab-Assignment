namespace BoxingUnboxing
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Boxing
            //Value type to reference type
            int x = 100;
            string str = "Hello World";
           Object obj1 = new object();
            obj1 = x;
            Console.WriteLine(obj1);

            Object obj2 = new object();
            obj2 = str;
            Console.WriteLine(obj2);

            //UnBoxing
            //Reference type to value type

            Object obj3 = new object();
            obj3 = x;
            int num = Convert.ToInt32(obj3);
            Console.WriteLine(num);


            //Type Casting 
            // Reference type to referenc type 
            // Value type to value type 

        }
    }
}
