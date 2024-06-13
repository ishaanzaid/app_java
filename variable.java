class Car
{
    String name;
    int noOfSeats;
    float cost;
}
//This is for pass by refference 
class variable 
{
    public static void main(String[] arg)
    {
       Car a = new Car();
       a.name = "suzuki";
       a.noOfSeats = 5;
       a.cost = 8.5f;

       System.out.println(a.name);
       System.out.println(a.noOfSeats);
       System.out.println(a.cost);
       
    }

}