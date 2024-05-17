import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Worker work1 = new Worker("Daniel ", 1234,"04-09-2022", "Baker", 1);
        Worker work2 = new Worker("Bob ", 23456, "05-09-2022", "MAin Chef", 2);
        Worker work3 = new Worker("MAt ", 12134,"06-09-2022", "Kitchen Help", 3);
        Worker work4 = new Worker("Tomasz ", 7897, "07-09-2022", "Waiter", 4);

        Manager manager = new Manager("Hubert ", 99999, "03-09-2022", "Boss of the bosses", 5);

        List<Employee> employees = new ArrayList<>();
        employees.add(work1);
        employees.add(work2);
        employees.add(work3);
        employees.add(work4);
        employees.add(manager);
    
        for (Employee employee: employees){
            employee.work();
            System.out.println(
                employee.getName() + " ID: " 
                + employee.hashCode()+ 
                " Position: " + employee.getPosition() + 
                " ,Hire date: " + employee.getHireDate() + 
                " Salary: " + employee.getSalary() );
        }
}


}
