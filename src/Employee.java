import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    private NameWorker fullName;
    private int salary;
    private int workDepartmen;
    private static int counter = 1;
    private int id;

    public Employee(NameWorker fullName, int workDepartmen, int salary) {
        this.fullName = fullName;
        this.workDepartmen = workDepartmen;
        id = counter++;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public int getWorkDepartmen() {
        return workDepartmen;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWorkDepartmen(int workDepartmen) {
        this.workDepartmen = workDepartmen;
    }

    public NameWorker getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return fullName.toString() +
                ": отдел " + workDepartmen + ", доход " + salary + " руб., номер id " + id;
    }

}
