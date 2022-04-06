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
        }
        System.out.println("Общая сумма затрат на зарплату " + sum + " руб. в месяц");
    }


}
