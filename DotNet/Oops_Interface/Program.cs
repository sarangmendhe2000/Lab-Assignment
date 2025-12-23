using System.Security.Cryptography.X509Certificates;

namespace Oops_Interface
{
    public interface IDrink
    {
        public void GetCold();
        public void GetHot();

    }

    public class ColdDrink : IDrink
    {
        public void GetCold()
        {
            Console.WriteLine("Get your ColdDrink");
        }
        public void GetHot()
        {
            Console.WriteLine("Hot Drink not available ! ");
        }
    }

    public class HotDrink : IDrink
    {
        public void GetHot()
        {
            Console.WriteLine("Get your  Hot Drink");
        }

        public void GetCold()
        {
            Console.WriteLine("Cold Drink is not available");
        }
    }



    internal class Program
    {
        static void Main(string[] args)
        {

            IDrink drink = new ColdDrink();
            drink.GetHot();
            drink.GetCold();

            IDrink drink2 = new HotDrink();
            drink2.GetHot();
            drink2.GetCold();
    }    


        }


    
}
