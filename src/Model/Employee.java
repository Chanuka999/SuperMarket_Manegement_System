package Model;

public class Employee {
    private  int id;
    private String firstName;
    private String lastName;
    private  String email;
    private String phoneNumber;
    private String address;
    private double salary;

    public Employee(){

    }

    public Employee(int id,String fistName,String lastName,String email,String phoneNumber,String address,double salary){
        this.id=id;
        this.firstName=fistName;
        this.lastName=lastName;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getEmail(){
        return email;
    }
    public  void setEmail(String email){
        this.email=email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

}
