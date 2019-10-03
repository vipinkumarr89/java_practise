package ExceptionHandling;

import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int Age = scanner.nextInt();

        try{
        if(Age < 18)
            throw new AgeException("Invalidd Exception");
//            System.out.println();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
