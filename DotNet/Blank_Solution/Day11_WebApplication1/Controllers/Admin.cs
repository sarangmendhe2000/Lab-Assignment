using Microsoft.AspNetCore.Mvc;

namespace Day_11_WebApplication1.Controllers
{
    public class Admin : Controller
    {
        public string Index(string nm)
        {
            return nm;
        }
    }
}
