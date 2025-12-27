using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day7_CsharpFeatures
{
    internal class Sum
    {

        public static T MySum<T>(IEnumerable<T> arr)
        {
            dynamic sum = 0;
            foreach (T item in arr)
            {
                sum += item;
            }
            return sum;
        }
    }
}
