public class Day22 {
    public static void main(String[] args) {

        String s1="JAVA";
        String s2="Java";

        if( s1==s2) //comparing reference/hashcode/address
        {
            System.out.println("Referrence are equal");
        }
        else
        {
            System.out.println("Reference are unequl");
        }

        //if we want to compare the values than 
        if( s1.equals(s2)) 
        {
            System.out.println("values are equal");
        }
        else
        {
            System.out.println("values are unequl");
        }
        
        if( s1.equalsIgnoreCase(s2)) 
        {
            System.out.println("values are equal");
        }
        else
        {
            System.out.println("values are unequl");
        }
    }
}