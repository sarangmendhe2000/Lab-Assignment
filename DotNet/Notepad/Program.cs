namespace Notepad
{
    internal class Program
    {
        static void Main(string[] args)
        {
            SpellCheckFactory factory = new SpellCheckFactory();
            Ispellingchekar somespell = factory.getSpellCheckFactory("en");
        
            Notepad notepad=new Notepad(somespell);
            
            notepad.cut();
            notepad.Paste();
            notepad.copy();
            notepad.SpellCheck();
            HindiSpellingCheck obj = new HindiSpellingCheck();

            obj.DospellingChecker();

        }
    }
}
