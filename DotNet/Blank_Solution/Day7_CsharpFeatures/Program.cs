


namespace Day7_CsharpFeatures
{
    internal class Program
    {
        static void Main(string[] args)
        {


            #region MyRegion  // partial class use multiple files


            //CMath obj =new CMath();

            //int result= obj.Add(2,4);
            //Console.WriteLine(result);
            //int result2 = obj.Sub(2,4);
            //Console.WriteLine(result2);
            #endregion


            #region MyRegion //Nullable types[?= nullable oprator]


            // string name = null;
            // int deptId = null;  //copilation error
            // int? dept_Id = null;
            // int? dept_Id2 = 1234;
            // if(dept_Id.HasValue)
            // {
            //     Console.WriteLine(dept_Id);
            // }
            // else
            // {
            //     Console.WriteLine("dept_id=null");
            // }


            // // DateTime dt = null; // compilation error
            // DateTime? dt = null;
            #endregion

            #region MyRegion //Object Initializer




            //Demo demo = new Demo() { _id=100};
            //Console.WriteLine(demo._id);

            //Demo demo1 = new Demo() { _name = "sangita" ,_id=101 };
            //Console.WriteLine( demo1._name+" ,"+demo1._id);


            //Console.WriteLine("Enter id");
            //int id=Convert.ToInt32(Console.ReadLine());

            //Console.WriteLine("Enter name");
            //string nm=Console.ReadLine();

            //Console.WriteLine("Enter Description");
            //string des=Console.ReadLine();

            //Demo demo2=new Demo() { _id=id, _name=nm, _description=des};
            //Console.WriteLine($"id={demo2._id}, name={demo2._name}, description={demo2._description}");
            #endregion

            #region MyRegion //Collection initializer syntax  combine with object initializer



            //List<Demo> demo = new List<Demo>()
            //{
            //  new Demo(){ _id=101,_name="sangita",_description="from solapur"},
            //  new Demo(){ _id=102,_name="sujata" , _description= "From south solapur"}


            //};
            //foreach (Demo d1 in demo)
            //{
            //    Console.WriteLine($"id={d1._id}, name={d1._name}, description={d1._description}");

            //}
            #endregion

            #region MyRegion // AutoProperties




            //Emp emp = new Emp() {id=101};
            //Console.WriteLine($"{emp.id}");

            //Emp emp2 = new Emp()
            //{

            //    id = 111,
            //    name = "sangita",
            //    isActive = true,
            //    salary = 20000,
            //    dt = DateTime.Now,
            //    project = new List<string>() { "ORM", "Database Integration Api", ".net core mvc"}

            //};

            //Console.WriteLine($" Doj={emp2.dt.ToString()}");

            //foreach (string item in emp2.project)
            //{

            //    Console.WriteLine(item);
            //}
            #endregion

            #region MyRegion //Implicit type


            // Test test = new Test();
            // Emp emp=test.GetSomething(1) as Emp;

            ////Console.WriteLine(emp);
            ////int value =Convert.ToInt32(test.GetSomething(2));
            //// Console.WriteLine(value);

            // var id = 102;
            // var name = "sangita";
            // var obj=new Emp();


            // Console.WriteLine("Enter choice");
            // int num = Convert.ToInt32(Console.ReadLine()) ;
            // object result=test.GetSomething(num);

            // Console.WriteLine(result);
            #endregion

            List<Holder>  dbholders = new List<Holder>() { 
            
            new Holder(){id = db,name = db,address = db}
            
            };
          Emp emp= new Emp() { id=101,name="sangita",};

        }
    }
}
