import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int age;
    private LocalDate birthdate;
    private Scanner sc;

    public Person(String firstName,String lastname, String address, int age){
        this.firstName = firstName;
        this.lastName = lastname;
        this.address = address;
        this.age=age;
        sc = new Scanner(System.in);
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
    public void changeAddress(){
        System.out.println("Please enter new address");
        this.address = sc.nextLine();
        System.out.println("Address has been updated ");
        System.out.println("New Address is :" + address);
    }
    public String getAddress(){
        return address;
    }
    public void setBirthDate(){
        System.out.println("Please enter your Date of Birth in YYYY-MM-DD format");
        String dob = sc.next();


    birthdate = LocalDate.parse(dob);

    }
    public String getBirthdate(){
        return birthdate.toString();
    }
    public int getAge(){
        LocalDate curDate = LocalDate.now();
        return Period.between(birthdate,curDate).getYears();


    }

}
