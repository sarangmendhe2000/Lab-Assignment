using Microsoft.Data.SqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day8_Predicate.DAL
{
    internal class UserDAL
    {
        public void DB()
        {

            string str = @"Data Source = (LocalDB)\MSSQLLocalDB;
                        Initial Catalog = sarang ;
                        Integrated Security = True;";

            // Established Connection
            SqlConnection conn = new SqlConnection(str);

            conn.Open();


            // SQl Command  (just like prepared statement in Java) 

            string query = "Select * from userauth";
            SqlCommand cmd = new SqlCommand(query, conn);

            //SQL DataReader

            SqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                int id = Convert.ToInt32(reader["ID"]);
                string name = Convert.ToString(reader["Name"]);
                string email = Convert.ToString(reader["email"]);

                Console.WriteLine($" ID = {id} Name  = {name} Email = {email}");
            }

            reader.Close();
            conn.Close();

        }
    }
}
