class test {
    public static void main(String[] args) 
    {
        int a=5;
        int b;
        int score =60;
        b=++a + a++;
        System.out.println(a);
        System.out.println(b);
        String grade = (score >=70) ? "pass" : "fail";
        System.out.println("Result: " + grade);
    }
}