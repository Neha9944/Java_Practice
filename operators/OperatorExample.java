public class OperatorExample {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        //Airthmetic operator
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));


        //Relational operator
        System.out.println("Asignment Operator:");
        System.out.println("a == b = "+(a == b));
        System.out.println("a != b = "+(a != b));
        System.out.println("a > b = "+(a > b));
        System.out.println("a < b = "+(a < b));
        System.out.println("a >= b = "+(a >= b));
        System.out.println("a <= b = "+(a <= b));

        //logical operator
        System.out.println("Logical Operator:");
        System.out.println("(a == 20 && b < 10) " +(a == 20 && b < 10));
        System.out.println("(a == 20 || b < 10) " +(a == 20 || b < 10));
        System.out.println("!(a == 20) = " +( !(a==20) ));
    }
}
