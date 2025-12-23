namespace ObserverPattern
{
    internal class Program
    {
        static void Main(string[] args)
        {
           Publisher publisher = new Publisher();
           Subscriber subscriber = new Subscriber();

            //Coupling
            publisher.Notify += subscriber.SMS;
            publisher.Notify += subscriber.Email;

            publisher.show("Sale Begin 90% OFF ! ");

            //Decoupling
            publisher.Notify -= subscriber.Email;
            publisher.show("Sale Begin 10% OFF ! ");
        }
    }
}
