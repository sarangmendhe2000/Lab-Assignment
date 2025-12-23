using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Singleton
{
     public abstract class  Database
    {
      public Logger logger = null;
        protected abstract void Insert();
        protected abstract void Update();
        protected abstract void Delete();

        protected abstract string getDBName();


        public void Insert()
        {
            logger.Log("Data Insert succesfully ");
        }
}

    internal class DatabaseFactory
    {
        public Database getDatabaseName(int num)
        {
             Database db = null;
            
        switch(num)
            {
            case 1 :

            db = new SqlServer();
            break;

        case 2 :

            db = new MySqlServee();
            break;

        case 3 :

            db = new OracleServer();
            break;

        default :
                    db = null;
                    break;
                }
    return db ;

        }
    }


    public class SqlServer : Database
    {

    }



    public class Logger
    {
        public void Log(string msg)
        {

            Console.WriteLine("-- Logged at {0} , message  : {1}", DateTime.Now.ToString(), msg);

        }
    }
}
