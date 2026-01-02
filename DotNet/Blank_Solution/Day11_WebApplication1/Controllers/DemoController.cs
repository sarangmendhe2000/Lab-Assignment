using Microsoft.AspNetCore.Mvc;

namespace Day_11_WebApplication1.Controllers
{
    public class DemoController : Controller
    {


        
        public IActionResult  Index(string uname,string pass)
        {
                
            ViewBag.UserName = uname;
            ViewBag.Password = pass;

            return View();

        }
    }
}
