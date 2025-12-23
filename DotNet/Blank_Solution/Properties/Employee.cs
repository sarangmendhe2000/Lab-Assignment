using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day4_Properties
{
    internal class Employee
    {
        private int _id;
        private string? _name;
        private int _age;


        public int id
        {
            set
            {
                _id = value;
                Console.WriteLine(_id);
            }
            get
            { return _id; }
        }

        public string name
        {
            set
            {
                if (value != null)
                {
                    _name = value;
                    Console.WriteLine(_name);
                }
                else
                {

                    _name = "No Name Enter";
                }
            }
            get { return _name; }
        }

        public int age
        {
            set
            {
                _age = value;
                Console.WriteLine(_age);
            }

            get { return _age; }
        }
    }
}
