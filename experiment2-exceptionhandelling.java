import java.util.InputMismatchException;
import java.util.Scanner;
class Students
{
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    String name=" ";
    int marks=0;
    String grade=" ";
    try
    {
        System.out.println("Enter student name");
        name=sc.nextLine();
        System.out.println("Enter marks");
        marks=sc.nextInt();
        if(marks<0||marks>100)
        {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        if(marks>=90)
        {
            grade="Grade A";
        }
        else if(marks>=75)
        {
            grade="Grade B";
        }
        else if(marks>=60)
        {
            grade="Grade C";
        }
        else if(marks>=40)
        {
            grade="Grade D";
        }
        else
        {
            grade="Fail";
        }
        System.out.println("Students Result");
        System.out.println("Student name:"+name);
        System.out.println("Marks:"+marks);
        System.out.println("Grade:"+grade);
    }
    catch(InputMismatchException e)
    {
        System.out.println("Invalid input.Enter numeric input only");
    }
    catch(IllegalArgumentException e)
    {
        System.out.println(e.getMessage());
    }
    finally
    {
        System.out.println("Marks evaluation completes");
    }
}

}