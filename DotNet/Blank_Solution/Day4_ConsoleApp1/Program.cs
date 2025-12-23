using Day4_ClassLibrary;

namespace Day4_ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Only Add is accessible 

           Mymath math = new Mymath();
            math.Add(5, 10);

            Client c = new Client();
           


        }
    }

    class Client : Mymath
    {
        
        
    }

}
