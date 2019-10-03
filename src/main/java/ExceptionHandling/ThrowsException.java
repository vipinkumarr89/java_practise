package ExceptionHandling;

// When I want the caller to handle the exception I use throws
// public class ThrowsException throws <ExceptionList>> {
// This is applicable for checked exception

public class ThrowsException {
    static void method1() throws InterruptedException {
        System.out.println("in method1");
    }

    // in method1 we have used throws means if any caller is using method1
    // he has to handle this exception by using a try catch or
    // using a throws Exception so that jvm will handle it

    // One way
//    public static void main(String[] args) throws Exception{
//        method1();
//    }

    // Another way
    public static void main(String[] args) {
        try{
            method1();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

// In real time scenario some legal related things developer won't
// handle but legal team should handle