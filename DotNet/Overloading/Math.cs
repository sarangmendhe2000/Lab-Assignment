using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Overloading
{
    internal class Math
    {
        public int Add(int a, int b)
        {
            return a + b;
        }

        public int Subtract(int a, int b)
        {
            return a - b;
        }

        public virtual void Multiply(int a, int b)
        {
            Console.WriteLine(a * b);
        }
    }

    class AdvanceMath : Math
    {
        public int Add(int a, int b, int c)
        {
            Console.WriteLine("{0}" , a+b+c);
            return a + b + c;
        }


        public override void Multiply(int a , int b)
        {
            Console.WriteLine(a * b *100);
        }
    }
}
