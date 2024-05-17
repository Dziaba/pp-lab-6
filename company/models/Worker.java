package company.models;
import company.abstracts.Employee;

public final class Worker extends Employee{

    public Worker (String name, double salary,String hireDate, String position, int id){
        super (name, salary, hireDate, position, id);
    }
    @Override
    public void work(){
        System.out.println("Worker " + getName() + "Is working ..." );
    }
}
    

