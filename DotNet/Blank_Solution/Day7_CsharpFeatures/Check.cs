using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day7_CsharpFeatures
{
    public delegate bool Mydelegate(int num);

    internal class Check
    {
        public static bool CheckNum(int num)
        {
            return num > 10;
        }
    }
}
