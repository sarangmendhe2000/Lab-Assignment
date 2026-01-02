namespace Day_11_WebApplication1
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            builder.Services.AddControllersWithViews();
            var app = builder.Build();

            // app.MapGet("/", () => "Hii");
            // app.MapDefaultControllerRoute();

           
            app.MapControllerRoute(
                name: "abc",
                pattern: "{controller=Admin}/{action=Index}/{nm?}"
                );
            app.MapControllerRoute(
               name: "abc1",
               pattern: "{controller=Demo}/{action=Index}/{uname}/{pass}"
               );

            app.Run();
        }
    }
}
