package ex8;

// Реализации для DI
class JdbcEmployeeRepository implements IEmployeeRepository {
    public void save(Employee employee) { /* реализация */ }

    public boolean existsById(int id) { /* реализация */
        return false;
    }
}
