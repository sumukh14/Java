package Class;

import java.util.Scanner;
class StudentDetails{
    String name;
    int rollNo;

    void inputDetails(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }
}


class  Marks extends StudentDetails {
    int Marks1, Marks2, Marks3;
    int total = 0;

    void inputMarks(int Marks1, int Marks2, int Marks3)
    {
        
        Scanner sc = new Scanner(System.in);

        if((Marks1 >= 0 && Marks1 <= 100) &&  (Marks2 >= 0 && Marks2 <= 100) && (Marks3 >= 0 && Marks3 <= 100))
        {
            Marks1 = sc.nextInt();
            Marks2 = sc.nextInt();
            Marks3 = sc.nextInt();

            total = Marks1+Marks2+Marks3;
        }
        else{
            System.out.println("Invalid Marks !");
        }


    }

    void display()
    {

        double per;
        per = (total / 300.0f)*100;

        System.out.println("Student Name: " + name);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Percentage : " + per);
    }
}


public class Student {
    public static void main(String[] args) {
        Marks obj = new Marks();

        obj.display();


    }
}
