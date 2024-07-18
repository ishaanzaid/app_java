public class Day21_3 {
    public static void main(String[] args) {

        String s1=new String("JAVA");
        String s2=new String("JAVA");

        if( s1==s2)
        {
            System.out.println("Referrence are equal");
        }
        else
        {
            System.out.println("Reference are unequl");
        }
        //////////////
        if( s1.equals(s2))
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("unequl");
        }
    }
}