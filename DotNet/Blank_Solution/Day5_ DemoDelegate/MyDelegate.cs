using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day5__DemoDelegate
{
    
    internal class MyDelegate
    {
        public static void sayHi()
        {
            Console.WriteLine("Hello from sayHi");
        }
        public static void sayHello()
        {
            Console.WriteLine("Hello from sayHello");
        }

        public void Multicast(string s )
        {
            Console.WriteLine( $"Demo for multicasting { s } ");
        }
        public void Multicas2(string s )
        {
            Console.WriteLine($"Demo for multicasting2 { s }");
        }


       public void Add(int a , int b)
        {
            Console.WriteLine($"Addition is {a + b}");
        }

    }
}
