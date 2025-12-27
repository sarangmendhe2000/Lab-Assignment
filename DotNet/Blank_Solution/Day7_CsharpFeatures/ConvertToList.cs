using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day7_CsharpFeatures
{
    internal static class ConvertToList
    {
        public static List<T> ConvertList<T>(this IEnumerable<T> src , int nonsence )
        {
            List<T> list = new List<T>();

            Console.WriteLine("Data print in List - ");
            foreach ( var item in src )
            {
                list.Add( item );
            }

            Console.WriteLine($"Nonsense value is {nonsence}");
            return list;    
        }
    }
}
