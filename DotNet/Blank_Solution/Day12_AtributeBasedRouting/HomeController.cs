using Microsoft.AspNetCore.Mvc;
using Day7_Boostrap.Models;
namespace _12_AtributeBasedRouting
{
    public class HomeController : Controller
    {

       List<Emp> emps= new List<Emp>(){

        new Emp(){ Id= 11, Name= "Tony Stark", Address="LA"},
            new Emp(){ Id= 12, Name= "Walter Bishop", Address="New Jersey"},
            new Emp(){ Id= 13, Name= "Thor", Address="Asgard"},
            new Emp(){ Id= 14, Name= "Peter Bishop", Address="Parallel Universe"},




       };   
        public IActionResult Index()
        {
            return View(emps);
        }
    }
}
