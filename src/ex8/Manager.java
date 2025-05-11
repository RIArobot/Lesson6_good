package ex8;

class Manager extends Employee {
    public Manager(int id, String name, int age, double salary, String email) {
        super(id, name, age, salary, email);
    }

    @Override
    protected void validate() {
        super.validate();
        if (salary < 5000) {
            throw new IllegalArgumentException("Manager salary too low");
        }
    }
}
