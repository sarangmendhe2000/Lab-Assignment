using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sealed
{
    internal sealed class Operation
    {
        public void Add(int x , int y)
        {
            Console.WriteLine("Addition is {0}" , x+y);
        }

        public void Sub(int x, int y)
        {
            Console.WriteLine("Subtraction is {0}", y - x);
        }

    }

    class Math //: Operation
    {
        public virtual  void Multiply(int x, int y)
        {
            Console.WriteLine("Multiplication is {0}" , x*y);
        }
    }

    class Math2 : Math
    {
        public sealed override void Multiply(int x, int y)
        {
            Console.WriteLine("Multiplication is {0}", x * y *10);
        }
    }

    //class Math3 : Math2
    //{
    //    public override void Multiply(int x , int y)
    //    {
    //        Console.WriteLine();
    //    }
    //}




}
