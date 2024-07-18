public class Day21_2 {
    public static void main(String[] args) {

        String s1="JAVA";
        String s2=new String("jAVA"); //give value jAVA JAVA and check output as java is case sensitive

        if( s1==s2) //comparing reference/hashcode/address
        {
            System.out.println("Referrence are equal");
        }
        else
        {
            System.out.println("Reference are unequl");
        }

        if( s1.equals(s2)) //if we want to compare the values than
        {
            System.out.println(" equal");
        }
        else
        {
            System.out.println(" unequl");
        }

        if( s1.equalsIgnoreCase(s2)) //if comapre case
        {
            System.out.println(" equal");
        }
        else
        {
            System.out.println(" unequl");
        }
    }
}