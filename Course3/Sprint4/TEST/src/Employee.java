public class Employee {
    private static String name;
    private static int id;
    private static int age;
    private static String department;

    public String getName() {
        return name;
    }

    public static int getId() {
        return id;
    }

    public static int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    private Employee(String name, int id, int age, String department) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.department = department;
    }
    public static void cons(String name, int id, int age, String department){
       new Employee(name,id,age,department);
    }

    @Override
    public  String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
