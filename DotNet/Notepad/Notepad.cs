using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Notepad
{
    internal class Notepad
    {
        private Ispellingchekar checker;
        public Notepad(Ispellingchekar s) {

            SpellCheckFactory factory = new SpellCheckFactory();

            if (s == null)
            {
                checker= factory.getSpellCheckFactory("en");
            }
            else
            {
                checker = s;
            }
        
        }


        public void cut()
        {
            Console.WriteLine(" For Cut - Control+x");
        }
        public void copy() 
        {
            Console.WriteLine(" For Copy - Control+c"); 
        }

        public void Paste()
        {
            Console.WriteLine("For paste - Control+v");
        }
        
        public void SpellCheck()
        {
            checker.DospellingChecker();
        }

    }
}
