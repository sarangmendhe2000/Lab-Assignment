using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Oops_interface2
{

    public interface Ix
    {
        public void Add(int a,int b);
        public void Sub(int a, int b);

    }
    public interface Iy
    {
        public void Mul(int a,int b);
        public void Add(int a, int b);
    }

    public interface Iz
    {

        public void Div(int a, int b);
        
    }





    internal class Operation :Ix,Iz ,Iy
    {
       void Iy.Add(int a, int b)
        {
            Console.WriteLine("{0}", a + b);
        }
            void Ix.Add(int a, int b)
            {
                Console.WriteLine("{0}", a + b+1000);
            }


        public void Sub(int a, int b)
        {
            Console.WriteLine("{0}", a - b);
        }

        public void Mul(int a, int b)
        {
            Console.WriteLine("{0}", a * b);
        }
        public void Div(int a, int b)
        {
            Console.WriteLine("{0}", a / b);
        }



       
    }
}
