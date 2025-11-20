package Object;
import java.lang.*;
class InvalidMarksException extends Exception{
    public  InvalidMarksException(String message) {
        super(message);
    }
}
public class StudentResultProcessing{
    public static void calculateGrade(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100){
            throw new InvalidMarksException("invalid Marks! Marks should be between in 0 and 100");
        }
        else if (marks >= 90){
            System.out.println("grade A");
        } else if (marks >= 75) {
            System.out.println("grade B");
        }else if (marks >= 50){
            System.out.println("grade C");
        }else{
            System.out.println("grade D");
        }
    }

    public static void main(String[] args) {
        try{
            calculateGrade(88);
            calculateGrade(105);
        }catch (InvalidMarksException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
