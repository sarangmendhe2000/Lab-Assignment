using Day6_GenericDelegate;

namespace Day6_GenericDelegate
{

    
    internal class Program
    {
        static void Main(string[] args)
        {
            Sample<int> sample = new Sample<int>();

            Delegate1<string> del1 = sample.SayHi;
            Delegate2<string, string> del2 = sample.Greet;
            Delegate3<int> del3 = sample.Display;
            Delegate4<int> del4 = sample.CheckEven;
            Delegate5<int> del5 = sample.CheckOdd;
            Delegate6<int, int> del6 = sample.Add;
            Delegate8 del8 = sample.Add;

            del1.Invoke("Sarang");
            del2.Invoke("Sangita ", "Good Evening");
            del3.Invoke(5);


            //bool result = del4.Invoke(6);
            // Console.WriteLine(result);
            // bool result2 = del5.Invoke(6);
            // Console.WriteLine(result2);
             int result1;

            Delegate4<int> del7 = sample.CheckEven;
            del7 += sample.CheckOdd;

           bool result = del7.Invoke(6);
            Console.WriteLine(result);
           

            del6.Invoke(1, 2, 3 , out result1);


           int addResult = del8.Invoke(new int[] {1,5,4,9,2 });
            Console.WriteLine(addResult);


        }
    }
}
