import company.models.Worker;


public class Main{
    public static void main(String[] args){
        Worker work1 = new Worker("Daniel ", 1234,"04-09-2022", "Baker", 1);
        Worker work2 = new Worker("Bob ", 23456, "05-09-2022", "MAin Chef", 1);
        Worker work3 = new Worker("MAt ", 12134,"06-09-2022", "Kitchen Help", 3);

        System.out.println(work1.getName() + " has code: " + work1.hashCode());
        System.out.println(work2.getName() + " has code: " + work2.hashCode());
        System.out.println(work3.getName() + " has code: " + work3.hashCode());

        System.out.println(" work 1 comp work2 " + work1.equals(work2));
        System.out.println(" work 1 comp work3 " + work1.equals(work3));
        System.out.println(" work 2 comp work3 " + work2.equals(work3));
}


}
