import company.models.Manager;
import company.models.Worker;

public class Main{
    public static void main(String[] args){
        Worker work1 = new Worker("Daniel ", 1234, 1);
        Worker work2 = new Worker("Bob ", 23456, 2);
        Worker work3 = new Worker("MAt ", 12134, 3);
        Worker work4 = new Worker("Tomasz ", 7897, 4);

        Manager manager = new Manager("Hubert ", 99999, 5);

        System.out.println(work1.getName() + "wynagrodzenie to: " + work1.getSalary());
        work1.work();
        System.out.println(work2.getName() + "wynagrodzenie to: " + work2.getSalary());
        work2.work();
        System.out.println(work3.getName() + "wynagrodzenie to: " + work3.getSalary());
        work3.work();
        System.out.println(work4.getName() + "wynagrodzenie to: " + work4.getSalary());
        work4.work();

        System.out.println(manager.getName() + " wynagrodzenie to" + manager.getSalary());
        manager.work();
    }

}
