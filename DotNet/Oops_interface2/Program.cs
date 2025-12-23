namespace Oops_interface2
{
    internal class Program
    {
        static void Main(string[] args)
        {
          Operation obj=new Operation();

            Ix refx = obj;
            refx.Add(2, 3);
        }
    }
}
