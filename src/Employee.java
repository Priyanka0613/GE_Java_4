import java.util.Random;

public class Employee {
    
    String name;
    int employee_id;

    public Employee(String name ,int id){
        this.name=name ;
        this.employee_id=id ;
    }

    int employeepreabs(){
        Random random = new Random();
        return random.nextInt(2);
    }

    int fulltimeORparttime(){
        Random random = new Random();
        return random.nextInt(2);
        //0 -> part
        //1 -> full
    }

    int dailyWage() {
        int presentAbsent = employeepreabs();
        if(presentAbsent==1){
            System.out.println("you worked 8 hours");
            return 8*20;
        }else{
            System.out.println("you were absent so 0 hours worked");
            return 0;
        }
    }
    
    // int partTimeWage() {
    //     int x = fulltimeORparttime();
    //     int presentAbsent = employeepreabs();
    //     if(x==0 && presentAbsent==1){
    //         System.out.println("your part time wage is: "+80);
    //         return 4 * 20;
    //     }else{
    //         return 0;
    //     }
    // }

    int wagesForMonth() {
        // return 20 * 8 * 20; //salary/hr * hours * no.ofdays
        int day=0;
        int hours=0;

        while (day <= 20) {
            int presentabsent = employeepreabs();
            day += presentabsent;
            int forp = fulltimeORparttime();
            if(presentabsent==1){
                if(forp==0){
                    hours += 4;
                }else{
                    hours += 8;
                }
            }
        }

        int wage=hours*20;
        return wage;
    }

    int totalconditionedwage() {
        int day = 0;
        int hours= 0;

        while (day <= 20 && (hours) < 100) {
            int presentabsent = employeepreabs();
            day += presentabsent;
            int forp = fulltimeORparttime();
            if(presentabsent==1){
                if(forp==0){
                    hours += 4;
                }else{
                    hours += 8;
                }
            }

        }
        int salary = (hours)*20;
        return salary;
    }
}
