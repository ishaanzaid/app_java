class Car {
    String name;
    float cost;
}
public class arrey_object {

    public static void main(String[] args) 
    {
        Car c1 = new Car();
        c1.name = "Maruti";
        c1.cost = 4.5f;
    
        Car c2 = new Car();
        c2.name = "kia";
        c2.cost = 4.5f;
    
        Car c3 = new Car();
        c3.name = "mahindra";
        c3.cost = 4.5f;

        Car[] a = new Car[3]; // Arrey of cars 
    
        System.out.println(c3.name);

        a[0] = new Car();
        a[0].name = "Maruti";
        a[0].cost = 4.5f;

        a[1] = new Car();
        a[1].name = "kia";
        a[1].cost = 4.5f;
    
        a[2] = new Car();
        a[2].name = "mahindra";
        a[2].cost = 4.5f;

        System.out.println(a[0].name);

        for (int i=0;i<3;i++)
        {
            System.out.println(a[i].name);
            System.out.println(a[i].cost);
        }

    }

}
