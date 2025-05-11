package ex8;

// Соблюдение SRP
interface IEmployeeRepository {
    void save(Employee employee);

    boolean existsById(int id);
}
