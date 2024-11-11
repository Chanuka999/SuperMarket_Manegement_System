package Model;

public class admin extends Employee{
    public admin(){
     this.options = new Option[]{};
    }

    public admin(int id,String fistName,String lastName,String email,String phoneNumber,String address,double salary,String password){
        this.id=id;
        this.firstName=fistName;
        this.lastName=lastName;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.salary=salary;
        this.password=password;
        this.options = new Option[]{};
    }
}
