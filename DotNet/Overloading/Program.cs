namespace Overloading
{
    internal class Program
    {
        static void Main(string[] args)
        {
           AdvanceMath obj =  new AdvanceMath ();
            obj.Multiply(10, 20);
            obj.Subtract(30, 10);
            obj.Add(10, 50 , 10);
        }
    }
}
