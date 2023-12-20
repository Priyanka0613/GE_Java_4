import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to Employee Wage Computation");
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Please enter below option:");
            System.out.println("Option 1 Check present");
            System.out.println("Option 2 Calculating Today Salary");
            System.out.println("Option 3 Calculating monthly salary 20 days");
            System.out.println("Option 4 Calculating monthly salary 100 hours 20 days");
            System.out.println("Option 5 Exit ");
            
            int op = sc.nextInt();
            sc.nextLine(); 
            Employee Emp = new Employee("xyz",123) ;

            switch (op) {
                case 1:
                    // check attendance
                    int hour = Emp.employeepreabs();
                    if (hour != 0) {
                        System.out.println("Present");
                    } else {
                        System.out.println("Absent");
                    }
                    break;

                case 2:
                    // for Daily wage Computation
                    int wage = Emp.dailyWage();
                    System.out.println("your today's full time daily wage is: " + wage);
                    break;

                case 3:
                    // for calculating Monthly Wages for a month
                    int totalWage = Emp.wagesForMonth();
                    System.out.println("Total wages for a month is " + totalWage);
                    break;

                case 4:
                    // for calculating Monthly Wages for 100 hours and 20days
                    int Salary = Emp.totalconditionedwage();
                    System.out.println("Total wages for a month is " + Salary);
                    break; 

                case 5:
                    System.out.println("Thank you");
                    return;

                default:
                    System.out.println("Please Enter valid option");
                    break;
            }
        }
    }
}
