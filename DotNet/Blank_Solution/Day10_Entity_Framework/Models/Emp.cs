using Microsoft.EntityFrameworkCore.Metadata.Internal;
using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Net.Mime;

namespace Day10_Entity_Framework.Models
{
    [Table("emp")]
    internal class Emp
    {
        //[Key]
        //Column("Id" , [TypeNames= "int"]);
        public int id { get; set; }


        public string name { get; set; }
        public string address { get; set; }
    }
}
