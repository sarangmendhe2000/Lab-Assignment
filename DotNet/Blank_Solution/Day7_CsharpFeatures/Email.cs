using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day7_CsharpFeatures
{
    internal static class Email
    {
        public static bool CheckEmail(this string email)
        {
            if (email.Contains("@gmail.com")) 
            { 
                return true; 
            }
            else 
            {
                return false;
            }
            
        }
    }
}
