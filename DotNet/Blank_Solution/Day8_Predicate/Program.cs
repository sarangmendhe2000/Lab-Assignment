using Day8_Predicate.DAL;
using System.Net.Http.Headers;

namespace Day8_Predicate
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Predicate
            //Predicate<int> _even = x => x % 2 == 0;
            //Predicate<int> _odd = x => x % 2 == 1;

            //Console.WriteLine("Enter Number ");
            //int n = Convert.ToInt32(Console.ReadLine());

            //var res1 = _even.Invoke(n);
            //var res2 = _odd.Invoke(n);

            //Console.WriteLine(res1);
            //Console.WriteLine(res2); 
            #endregion

            #region Action Predicate
            //Action del1 = new Action(delegate ()
            //{

            //    Console.WriteLine("Jai shree Ram");

            //});
            //del1();

            //Action del2 = delegate ()
            //{
            //    Console.WriteLine("Jai Shree Krishna");
            //};

            //del2();

            //Action del3 = () =>
            //{
            //    Console.WriteLine("Radhe Radhe");

            //};

            //del3();

            //Action del4 = () => Console.WriteLine("SitaRam");
            //del4(); 
            #endregion

            #region Func delegate without out
            //Func<int> func1 = delegate ()
            // {
            //     return 52;
            // };

            //var result =  func1();
            //Console.WriteLine(result);

            // Func<double> func2 = () => { return 23.66 ; };

            // var result2 = func2();  
            // Console.WriteLine(result2);

            // Func<string> func3 = () => { return "Hello from C#"; };

            // var result3 = func3();
            // Console.WriteLine(result3); 

            //Func<int, bool> del = new Func<int, bool>(Check.Checknum);

            //var result = del.Invoke(50);

            //Console.WriteLine(result);
            #endregion


            #region Where() extension method
            //int[] arr = { 1, 2, 3,3, 4, 5 ,3};

            //var result = arr.Sum();
            //Console.WriteLine(result);

            //Func<int , bool> CheckNumber = (x) => x == 3;

            //var result3 = arr.Where(CheckNumber);

            //foreach (var x in result3)
            //{
            //    Console.WriteLine(x);
            //} 
            #endregion

            UserDAL userDAL = new UserDAL();
            userDAL.DB();

        }
    }
}
