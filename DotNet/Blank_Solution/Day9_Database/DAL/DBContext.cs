using Day9_Database.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Runtime.InteropServices.JavaScript.JSType;
using System.Data.SqlClient;
using Microsoft.Data.SqlClient;

namespace Day9_Database.DAL
{
    internal class DBContext
    {
        string connectionstring = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog = sarang; Integrated Security = True; Encrypt=True";

        public void LoginUser(string username, string password)
        {            
          SqlConnection conn = new SqlConnection(connectionstring);
          SqlCommand cmd =  new SqlCommand ("Select * from [User]" , conn);
            
          conn.Open();
            
          SqlDataReader reader = cmd.ExecuteReader();

            bool isValidUser = false;

            while (reader.Read())
            {
                string? dbUsername = reader["username"].ToString();
                string? dbPassword = reader["password"].ToString();

                if(username == dbUsername && password == dbPassword)
                {
                    
                    isValidUser = true;
                    break;
                }
               
            }

            if(isValidUser == false)
            {
                Console.WriteLine("Invalid Credentials ! ");
            }

            else
            {
                Console.WriteLine($"Welcome {username} ");
            }


                conn.Close();
           

        }

        public void RegisterUser(User user)
        {
            SqlConnection conn = new SqlConnection( connectionstring );
            SqlCommand cmd = new SqlCommand($" Insert into [User](username , password) values ('{user.username}' , '{user.password}')" , conn);
            conn.Open();
            
            int rowAffected = cmd.ExecuteNonQuery();

            if(rowAffected > 0)
            {
                Console.WriteLine("Registration successfully !");
            }
            else
            {
                Console.WriteLine("Failed to Register ! ");
            }

            conn.Close();
          
        }
    }
}

