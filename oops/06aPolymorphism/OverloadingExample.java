class Calculator{
    int multiply(int a, int b){
        return a*b;
    }

    double multiply(int a, int b, int c){
        return a*b*c;
    }

    int multiply(int a, int b, int c, int d){
        return a*b*c*d;
    }
}
class OverloadingExample{
    public static void main(String[] args) {
        
        Calculator cal = new Calculator();

        System.out.println(cal.multiply(2,3));
        System.out.println(cal.multiply(2,3,4));
        System.out.println(cal.multiply(2,3,4,5));
    }
}