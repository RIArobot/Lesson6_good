package ex8;

// Соблюдение OCP и LSP
abstract class Employee {
    protected int id;
    protected String name;
    protected int age;
    protected double salary;
    protected String email;

    public Employee(int id, String name, int age, double salary, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.email = email;
        validate();
    }

    protected void validate() {
        if (age < 18 || age > 65) {
            throw new IllegalArgumentException("Invalid age");
        }
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be positive");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }
}
