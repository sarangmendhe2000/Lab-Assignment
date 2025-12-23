using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace Day2
{

    public interface Iopration

    {
        void Add();
    }

    internal class Interface : Iopration
    {
       
    public void Add ()
        {
            Console.WriteLine("This is addition method of interface method");
        }
    }
 

}
