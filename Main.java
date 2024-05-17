import company.models.Worker;
import company.models.Manager;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Worker work1 = new Worker("Daniel ", 1234,"04-09-2022", "Baker", 1);
        Worker work2 = new Worker("Bob ", 23456, "05-09-2022", "MAin Chef", 1);
        Worker work3 = new Worker("MAt ", 12134,"06-09-2022", "Kitchen Help", 3);
        Worker work4 = new Worker("Mat2 ", 12134,"06-09-2022", "Kitchen Help", 4);
        Worker work5 = new Worker("Bob2 ", 12134,"06-09-2022", "Kitchen Help", 5);

        Manager manager1= new Manager("Hubert", 99999,"04-09-2022", "Boss of all the bosses", 1);
        Manager manager2= new Manager("Amy", 88888,"06-09-2022", "Bmini-boss", 7);
        Manager manager3= new Manager("Bob", 99999,"04-09-2022", "Side Boss", 8);

        List<Employee> employees = new ArrayList<>();
        employees.add(work1);
        employees.add(work2);
        employees.add(work3);
        employees.add(work4);
        employees.add(work5);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees){
            totalSalary += employee.getSalary();
            if (employee instanceof Manager){
                totalManagerSalary += employee.getSalary();
            }
            else if (employee instanceof Worker){
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Total salary for employees" + totalSalary);
        System.out.println("Total salary for MAnagers" + totalManagerSalary);
        System.out.println("Total salary of workers" + totalWorkerSalary);

        Set<Integer> uniqueIds = new HashSet<>();
        Set<Integer> duplicateIds = new HashSet<>();

        for(Employee employee : employees){
            if (!uniqueIds.add(employee.hashCode())) {
                duplicateIds.add(employee.hashCode());
            }
        }

        System.out.println("The same IDs:");
            for (Employee employee : employees){
                if (duplicateIds.contains(employee.hashCode())){
                    System.out.println(employee.getName()+ " ID:" + employee.hashCode() +" " + employee.getPosition() );
                }
            }




    }



}
