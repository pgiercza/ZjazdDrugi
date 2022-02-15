public class Employee
{
    String name;
    int age;
    int salsry;

    public Employee(String name, int age, int salsry) {
        this.name = name;
        this.age = age;
        this.salsry = salsry;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salsry=" + salsry +
                '}';
    }
}
