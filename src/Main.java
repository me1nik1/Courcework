public class Main {
    private static Employee[] employees = new Employee[4];

    public static void main(String[] args) {
        employees[0] = new Employee("Василий", "Пупкин", 1000, 1);
        employees[1] = new Employee("Петр", "Первый", 2000, 2);
        employees[2] = new Employee("Витя", "Правый", 3000, 3);
        employees[3] = new Employee("Гена", "Левый", 4000, 4);

        printEmployee();
        System.out.println("==============");
        System.out.println(salariesSum());
        System.out.println("=============");
        System.out.println(findMinSalary());
        System.out.println("=============");
        System.out.println(findMaxSalary());
        System.out.println("=============");
        System.out.println(averageSalary());
        System.out.println("=============");
        printFIO();
    }

    public static void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int salariesSum() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public static Employee findMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public static double averageSalary() {
        return (double) salariesSum() / employees.length;
    }

    public static void printFIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
    }
}