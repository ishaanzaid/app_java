public class CountOvels {
    public static void main(String[] args) {

        String s="RajaRamMohanRoy";
        System.out.println(s.toUpperCase()); //RAJARAMMOHANROY
        System.out.println(s.toLowerCase()); //rajarammohanroy

        System.out.println(s.charAt(6));  //m  //0 1 2 4 5 6 . .
                                                     //R a j a R a . .
        System.out.println(s.codePointAt(6)); //109 unicode of m
        System.out.println(s.startsWith("Raja"));  //true
        System.out.println(s.startsWith("Roja"));  //false
        
        System.out.println(s.endsWith("Roja"));
        System.out.println(s.indexOf('R'));   // 0
        System.out.println(s.lastIndexOf('R')); //12
        System.out.println(s.contains("Mohan")); // true
        System.out.println(s.length()); //15   (in arrey the lenth is variable but in string it is a method)
        System.out.println(s.substring(7)); //(sub string) MohanRoy 
        System.out.println(s.substring(7,12)); //Mohan (inclusive and exclusive)
        
        char [] arr=s.toCharArray(); //convert ot arrey
        System.out.println(arr[0]);


        String s1="Raja,Ram,Mohan,Roy";
        String []arr1 =s1.split(",");   //  0     1    2     3
                                              // raja  ram  moham roy
        for (String s2:arr1)
        {
            System.out.println(s2); //Raja
                                    //Ram
                                    //Mohan
                                    //Roy
        }








        
    }
}