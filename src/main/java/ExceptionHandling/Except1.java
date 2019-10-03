package ExceptionHandling;

public class Except1 {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = num1 / num2;
            System.out.println(num3);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArithmeticException e) {
            System.out.println( e );
        }
    }
}


// To execute it from command line
///Users/vipkmar/Documents/java_practise/src/ExceptionHandling
//        (base) 8c859042f681:ExceptionHandling vipkmar$ java -cp ../../src/ ExceptionHandling/Except1 4 2
//        2
