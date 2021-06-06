package Lesson5;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String numberPhone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String numberPhone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 16) {
            this.age = age;
        } else System.out.println("Возраст для заключения трудового договора должен быть больше 16 лет, ст. 63 ТК РФ");
    }

    @Override
    public String toString() {
        return "Employee [" +
                "fullName = '" + fullName + '\'' +
                ", position = '" + position + '\'' +
                ", email = '" + email + '\'' +
                ", numberPhone = '" + numberPhone + '\'' +
                ", salary = " + salary +
                ", age = " + age +
                ']';
    }
}
