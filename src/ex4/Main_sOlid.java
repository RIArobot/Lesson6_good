package ex4;

import java.util.List;

// Абстракция сотрудника
interface Employee {
    double calculateBonus();
    void save();
    String getName();
}

// Базовый класс с общей логикой
abstract class BaseEmployee implements Employee {
    protected double salary;
    protected String name;

    public BaseEmployee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void save() {
        // Общая логика сохранения
        System.out.println("Сохранено в БД: " + name);
    }
}

// Конкретные реализации
class RegularEmployee extends BaseEmployee {
    public RegularEmployee(double salary, String name) {
        super(salary, name);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.1;
    }
}

class Manager extends BaseEmployee {
    public Manager(double salary, String name) {
        super(salary, name);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }

    @Override
    public void save() {
        // Специфичная логика для менеджера
        System.out.println("Сохранено менеджера в отдельную таблицу: " + name);
    }
}

class Director extends BaseEmployee {
    public Director(double salary, String name) {
        super(salary, name);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.3 + 1000; // Фиксированный бонус для директора
    }
}

// Новый тип сотрудника - можно добавить БЕЗ изменения существующего кода
class Intern extends BaseEmployee {
    public Intern(double salary, String name) {
        super(salary, name);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.05;
    }
}

// Обработчик отчетов (дополнительная функциональность)
class ReportGenerator {
    public void generateReport(Employee employee) {
        System.out.println("Генерация отчета для: " + employee.getName());
    }
}

// Использование
public class Main_sOlid {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new RegularEmployee(1000, "Иван"),
                new Manager(2000, "Ольга"),
                new Director(3000, "Петр"),
                new Intern(500, "Анна")  // Новый тип без изменений существующего кода
        );

        ReportGenerator reportGenerator = new ReportGenerator();

        for (Employee emp : employees) {
            System.out.println("Бонус " + emp.getName() + ": " + emp.calculateBonus());
            emp.save();
            reportGenerator.generateReport(emp);
            System.out.println("------");
        }
    }
}