using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DatabaseConnection
{
    internal class DataBaseFactory
    {
        public IDatabase GetSomeDatabase(int opchoice)
        {
            IDatabase db = null;
            switch (opchoice)
            {

                case 1:
                    db = new SqlServer();
                    break;
                case 2:
                    db = new MySqlServer();
                    break;
                case 3:
                    db = new OracleServer();
                    break;
                default:
                    db = null;
                    break;

            }
            return db;
        }
    }
}
