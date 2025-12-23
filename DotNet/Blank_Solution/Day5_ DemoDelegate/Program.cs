namespace Day5__DemoDelegate
{

    public delegate void MyDelegate1();
    public delegate void MyDelegate2();
    public delegate void MulticastDelegate(string s);


    internal class Program
    {
        static void Main(string[] args)
        {
            MyDelegate1 del = new MyDelegate1 (MyDelegate.sayHello);
            MyDelegate2 del2 = new MyDelegate2 (MyDelegate.sayHi);
            del.Invoke();
            del2.Invoke();

            Console.WriteLine("Enter y to run this method or n for not want to run   multicast2");
            string run = Console.ReadLine();

            MyDelegate myDelegate = new MyDelegate();


            MulticastDelegate multicastDelegate = myDelegate.Multicast;

            if(run == "y")
            {
                multicastDelegate += myDelegate.Multicas2;
            }
            else
            {
                multicastDelegate -= myDelegate.Multicas2;
            }


            //calling the delegate 
            multicastDelegate("Calling Multicast Delegate");
        }
    }
}
