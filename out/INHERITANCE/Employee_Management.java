public class Employee_Management {
public static void main(String[] args) {
    manager m = new manager();
    developer d = new developer();
    intern i = new intern();
    m.team();
    m.id=1256.256;
    m.name="Rahul";
    m.salary=25006;
     m.dis();
     
    d.id=659564.45;
    d.name="ravi";
    d.salary=48012;
    d.dis();
     
    i.name="shivam";
    i.salary=800000000;
    i.id=15428.485;
    i.dis();
    
}

}
class employees{
    String name;
    double id;
    int salary;
    void dis(){
        System.out.println("Name of the employee  : " +name);
        System.out.println("user ID of the em  : " +id);
        System.out.println("Salary of the employee  :  " +salary);
    }
}
class manager extends employees{
    void team(){
        System.out.println("team size 50");
    }
}
class developer extends employees{
    void lang(){
        System.out.println("he is used java");
    }
}
class intern extends employees{
    void take(){
        System.out.println("to check yhe problems");
    }
}
