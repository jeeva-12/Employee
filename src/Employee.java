import java.util.Scanner;

public class Employee
{
    public static void main(String[] args)
    {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for Add Employees");
        System.out.println("Press 2 for View all Employees");
        System.out.println("Press 3 for Search Employee");
        System.out.println("Press 4 for Delete Employee");
        System.out.println("Press 5 to Exit \n ");

        System.out.println("Make your choice");
        choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                AddEmp();
                break;
            case 2:
                ViewAll();
                break;
            case 3:
                SearchAnEmp();
                break;
            case 4:
                DeleteAnEmp();
                break;
            default:
                System.out.println("Invalid option");
        }



    }

}
