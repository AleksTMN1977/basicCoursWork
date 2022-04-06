package ru.skypro;

public class Employee {

    private String name;
    private String departament;
    private int salari;
    static int count;
    private int id;

    public Employee(String name, String departament, int salari) {
        this.id = getCount();
        count++;
        this.name = name;
        this.departament = departament;
        this.salari = salari;

    }


    public String getName() {
        return name;
    }

    public String getDepartament() {
        return departament;
    }

    public int getSalari() {
        return salari;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void setSalari(int salari) {
        this.salari = salari;
    }

    @Override
    public String toString() {
        return "{" +
                "ФИО '" + name + '\'' +
                ", Отдел'" + departament + '\'' +
                ", Зарплата " + salari +
                ", id=" + id +
                '}';
    }

    public static void printListOfEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                break;
            }
            System.out.println((i + 1) + ". " + employees[i].getName());
        }
    }

    public static void printSumSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].salari;
            if (employees[i] == null) {
                break;
            }
        }
        System.out.println("Общая сумма затрат на зарплату " + sum + " руб. в месяц");
    }

    public static void printAverageSalary(Employee[] employees) {
        int sum = 0;
        int averageSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].salari;
            if (i == employees.length - 1) {
                averageSalary = sum / employees.length;
            }
        }
        System.out.println("Средняя месячная зарплата " + averageSalary + " RUR");
    }

    public static void printMinSalary(Employee[] employees) {
        int min = employees[0].getSalari();
        for (int i = 0; i < employees.length; i++) {
            if (min > employees[i].getSalari()) {
                min = employees[i].getSalari();
            }
        }
        System.out.println("Минимальная зарплата " + min + " RUR");
    }
    public static void printMaxSalary(Employee[] employees) {
        int max = employees[0].getSalari();
        for (int i = 0; i < employees.length; i++) {
            if (max < employees[i].getSalari()) {
                max = employees[i].getSalari();
            }
        }
        System.out.println("Максимальная зарплата " + max + " RUR");
    }
}

