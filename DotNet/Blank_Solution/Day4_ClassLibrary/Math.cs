using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day4_ClassLibrary
{
    public class Mymath
    {
        public void Add(int a , int b)
        {
            Console.WriteLine($"Addition is {a+b}");
        }

        private void Sub(int a, int b)
        {
            Console.WriteLine($"Substraction is {a - b}");
        }

        protected void Mult(int a, int b)
        {
            Console.WriteLine($"Multiplication is {a * b}");
        }

        internal void Div(int a, int b)
        {
            Console.WriteLine($"Division is {a / b}");
        }

        protected internal void Area_of_rect(int a, int b)
        {
            Console.WriteLine($"Area  of Rectangle is {a * b}");
        }

    }

    class AdvanceMath : Mymath
    {
        public void Wrapper()
        {
            base.Add(2, 3);
            base.Mult(5,2);
            base.Div(50, 2);
            base.Area_of_rect(2, 3);
            }


      
        
    }

     

        

    }
