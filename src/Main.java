public class Main {
    Employee[] baseEmployee = new Employee[10];

    public static void main(String[] args) {
        nameWorker oskar = new nameWorker("Иван", "Иванов");
        nameWorker worker2 = new nameWorker("Анна", "Александрова");
        nameWorker worker3 = new nameWorker("Татьяна", "Уварова");
        nameWorker worker4 = new nameWorker("Петр", "Овсянников");
        nameWorker worker5 = new nameWorker("Ольга", "Токарева");
        Employee[] baseEmployee = {
                new Employee(oskar, 1, 15000),
                new Employee(worker2, 2, 25000),
                new Employee(worker3, 3, 45000),
                new Employee(worker4, 4, 12000),
                new Employee(worker5, 5, 50000)
        };
        searchBookWorker(baseEmployee);
        countSumSalary(baseEmployee);
        countMinSalary(baseEmployee);
        countMaxSalary(baseEmployee);
        countMiddleSalary(baseEmployee);
        outputNameAll(baseEmployee);
    }

    public static void countSumSalary(Employee[] baseEmployee) {
        int sum = 0;
        for (Employee i : baseEmployee) {
            sum += i.getSalary();
        }
        System.out.println("Сумма всех затрат на зарплаты " + sum);
    }

    public static void searchBookWorker(Employee[] baseEmployee) {
        for (Employee i : baseEmployee) {
            System.out.println(i.toString());
        }
    }

    public static void countMinSalary(Employee[] baseEmployee) {
        int min = 90000000;
        Employee work = null;
        for (Employee i : baseEmployee) {
            if (i.getSalary() < min) {
                min = i.getSalary();
                work = i;
            }
        }
        System.out.println("сотрудник с минимальной зарплатой " + min + " - " + work.getFullName());
    }

    public static void countMaxSalary(Employee[] baseEmployee) {
        int max = 0;
        Employee workk = null;
        for (Employee i : baseEmployee) {
            if (max < i.getSalary()) {
                max = i.getSalary();
                workk = i;
            }
        }
        System.out.println("сотрудник с максимальной зарплатой " + max + " - " + workk.getFullName());
    }

    public static void countMiddleSalary(Employee[] baseEmployee) {
        int middle = 0;
        for (Employee i : baseEmployee) {
            middle = (middle + i.getSalary()) / baseEmployee.length;
        }
        System.out.println("Средняя зарплата " + middle);
    }

    public static void outputNameAll(Employee[] nameWorker) {
        for (Employee i : nameWorker) {
            System.out.println(i.getFullName());
        }
    }
}

