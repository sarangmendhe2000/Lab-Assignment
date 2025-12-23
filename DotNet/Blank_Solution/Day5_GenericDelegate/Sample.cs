using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day6_GenericDelegate
{
    public delegate void Delegate1<T>(T value);
    public delegate void Delegate2<T1 , T2>(T1 value1, T2 value2);
    public delegate void Delegate3<T>(T value);
    public delegate bool Delegate4<T>(T value);
     public delegate bool Delegate5<T>(T value);
    public delegate void Delegate6<T1,R>(T1 value1,T1 value2 ,T1 value3, out R result);
    public delegate int Delegate8(int[] num);
    internal class Sample<T>
    {
        public void SayHi (string s )
        {
            Console.WriteLine($" Hello  - {s}");
        }

        public void Greet(string name , string msg)
        {
            Console.WriteLine($"Hey {name} , {msg}");
        }

        public void Display(int num)
        {
            Console.WriteLine($"Number is - {num}");
        }

        public bool CheckEven(int num)
        {
            Console.WriteLine("CheckEven is running.........");
            return num % 2 == 0;
        }

        public bool CheckOdd(int num)
        {
            Console.WriteLine("CheckOdd is running.........");
            return num % 2 == 1;
        }

        public int Add(int[] numbers)
        {
            int sum = 0;

            foreach (var num in numbers)
            {
                sum += num;
            }

            return sum;
        }

        public void Add(int n1 , int n2 , int n3 , out int sum)
        {
            sum = n1 + n2 + n3;
            Console.WriteLine(sum);
        }


    }
}
