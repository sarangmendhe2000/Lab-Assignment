using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritence
{
    internal class Second
    {   
        public void show() {

            Console.WriteLine("This is Parent class");
        }
    }

    internal class Third : Second
    {
        public void  display()
        {

            Console.WriteLine("This is child class");
        }
    }




}
