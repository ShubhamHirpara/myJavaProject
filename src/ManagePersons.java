import java.util.Date;

public class ManagePersons {
    public static void main(String[] args) {
        Person p1 = new Person("Shubham","Hirpara","Hamilton",25);
        System.out.println("Your fullname is :"+p1.getFullName());
        System.out.println("Your current address is : " + p1.getAddress());
        p1.changeAddress();
        p1.setBirthDate();
        System.out.println("Your Birthdate is "+p1.getBirthdate());
        System.out.println("Your age is " + p1.getAge());
        System.out.println("Hello");

    }
}
