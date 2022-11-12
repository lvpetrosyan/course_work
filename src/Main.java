public class Main {
    Employee[] baseEmployee = new Employee[10];

    public static void main(String[] args) {
        NameWorker oskar = new NameWorker("Иван", "Иванов");
        NameWorker worker2 = new NameWorker("Анна","Александрова");
        NameWorker worker3 = new NameWorker("Татьяна", "Уварова");
        NameWorker worker4 = new NameWorker("Петр", "Овсянников");
        NameWorker worker5 = new NameWorker("Ольга", "Токарева");
        Employee[] baseEmployee = {
                new Employee(oskar, 1, 15000),
                new Employee(worker2, 2, 25000),
                new Employee(worker3, 3, 45000),
                new Employee(worker4, 4, 12000),
                new Employee(worker5, 5, 50000)
        };
        searchBookWorker(baseEmployee);
        System.out.printf("Сумма всех затрат на зарплаты: %d \n", countSumSalary(baseEmployee));
        countSumSalary(baseEmployee);
        countMinSalary(baseEmployee);
        countMaxSalary(baseEmployee);
        System.out.printf("Сумма среднего значения зарплаты: %d \n", countMiddleSalary(baseEmployee));
        outputNameAll(baseEmployee);
    }

    public static int countSumSalary(Employee[] baseEmployee) {
        int sum = 0;
        for (Employee i : baseEmployee) {
            sum += i.getSalary();
        }
        return sum;
    }

    public static void searchBookWorker(Employee[] baseEmployee) {
        for (Employee i : baseEmployee) {
            if (i == null)
                throw new IllegalArgumentException("The argument cannot be null");
            System.out.println(i.toString());
        }
    }

    public static void countMinSalary(Employee[] baseEmployee) {
        int min = 90000000;
        Employee work = null;
        for (Employee i : baseEmployee) {
            if (i == null)
                throw new IllegalArgumentException("The argument cannot be null");
            {
                if (i.getSalary() < min) {
                    min = i.getSalary();
                    work = i;
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + min + " - " + work.getFullName());
    }

    public static void countMaxSalary(Employee[] baseEmployee) {
        int max = 0;
        Employee workk = null;
        for (Employee i : baseEmployee) {
            if (i == null)
                throw new IllegalArgumentException("The argument cannot be null");
            {
                if (max < i.getSalary()) {
                    max = i.getSalary();
                    workk = i;
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой " + max + " - " + workk.getFullName());
    }

    public static int countMiddleSalary(Employee[] baseEmployee) {
        int middle = 0;
        for (Employee i : baseEmployee) {
            if (i == null)
                throw new IllegalArgumentException("The argument cannot be null");
            {
                middle = countSumSalary(baseEmployee) / baseEmployee.length;
            }
        }
        return middle;
    }

    public static void outputNameAll(Employee[] nameWorker) {
        for (Employee i : nameWorker) {
            if (i == null)
                throw new IllegalArgumentException("The argument cannot be null");
            {
                System.out.println(i.getFullName());
            }
        }
    }
}

