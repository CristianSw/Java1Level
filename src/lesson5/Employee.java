package lesson5;

public class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String firstName, String lastName, String position, String email, String phone, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void displayEmployee(){
        System.out.printf("First Name: %s%nLastName: %s%nPosition: %s%nEmail: %s%nPhone: %s%nSalary: %d%nAge: %d%n%n"
                , firstName, lastName,position,email,phone,salary,age );
    }
}
