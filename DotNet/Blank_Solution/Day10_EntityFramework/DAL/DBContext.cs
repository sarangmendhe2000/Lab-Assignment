using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day10_EntityFramework.DAL
{
    internal class DBContext:DbContext

        public DbSet<Emp> emps {  get; set; }
    
    {


    }
}
