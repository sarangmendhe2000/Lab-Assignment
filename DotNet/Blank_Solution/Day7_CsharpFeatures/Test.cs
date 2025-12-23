using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day7_CsharpFeatures
{
    internal class Test
    {
        public object GetSomething(Nullable<int> choice)
        {
            if (choice == 1)
            {
                return choice = 100;
            }
            else if (choice == 2)
            {
                return new Emp() {id=102,name="sangita", isActive=true};
            }
            else
            {
                return null;
            }
        }
    }
}
