using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Notepad
{
    public interface Ispellingchekar
    {
        public void DospellingChecker();
    }
    internal class SpellCheckFactory
    {
        public Ispellingchekar getSpellCheckFactory(string lang)
        {

            Ispellingchekar spellingchekar = null;

            switch (lang)
            {
                case "en":
                    spellingchekar = new EnglishSpellingChecker();
                    break;

                case "sp":
                    spellingchekar = new SpanishSpellingChecker();
                    //spellingchekar.DospellingChecker();
                    break;
                case "gr":
                    spellingchekar = new GermanSpellingChecker();
                    break;
                default:
                    spellingchekar = new EnglishSpellingChecker();
                    break;
            }

            return spellingchekar;



        }
    }


    public class EnglishSpellingChecker : Ispellingchekar
    {
        public void DospellingChecker()
        {
            Console.WriteLine("English Spelling Checker ");

        }
    }

    public class SpanishSpellingChecker : Ispellingchekar
    {
        public void DospellingChecker()
        {
            Console.WriteLine("Spanish Spelling Checker ");

        }
    }

    public class GermanSpellingChecker : Ispellingchekar
    {
        public void DospellingChecker()
        {
            Console.WriteLine("German Spelling Checker ");
        }
    }


    public class HindiSpellingCheck : Ispellingchekar
    {

        public void DospellingChecker()
        {
            Console.WriteLine("Hindi Spelling Checker");
        }
    }
}
