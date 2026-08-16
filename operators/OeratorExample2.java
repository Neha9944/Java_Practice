public class OeratorExample2 {
    public static void main(String[] args){

        int a = 10;
        System.out.println("Assignment Operators");

       System.out.println("a += 5 : " + (a += 5));
       System.out.println("a -= 3 : " + (a -= 3));

       System.out.println("a *= 5 : " + (a *= 5));
       System.out.println("a /= 2 : " + (a /= 2));

       System.out.println("a %= 5 : " + (a %= 5));


       System.out.println("Unary Operators");

       int n = 5;

       System.out.println("n = " + n);

       System.out.println("++n = " + (++n));
       System.out.println("n++ = " + (n++));

       System.out.println("n-- = " + (n--));
       System.out.println("--n = " + (--n));

       System.out.println("Ternary Operators");
       int age = 25;

       String res = (age >= 18) ? "Eligible" : "Not Eligible";

       System.out.println(res);

    }
}
