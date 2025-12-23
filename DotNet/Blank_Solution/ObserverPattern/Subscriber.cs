using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ObserverPattern
{
    public delegate void EventHandler(string s);
    internal class Subscriber
    {
        public void SMS(string s)
        {
            Console.WriteLine($"Message from SMS - {s}");
        }
        public void Email(string s)
        {
            Console.WriteLine($"Message from Email - {s}");
        }
    }

    class Publisher
    {
        public event EventHandler Notify;

        public void show(string s ) {

            Notify?.Invoke(s);
        
        }
    }
}
