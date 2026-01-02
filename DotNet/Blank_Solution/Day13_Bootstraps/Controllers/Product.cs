using Microsoft.AspNetCore.Mvc;

namespace Day13_Bootstraps.Controllers
{
    public class Product : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
