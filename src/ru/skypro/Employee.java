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

    public static int getCount() { return count; }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void setSalari(int salari) {
        this.salari = salari;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ФИО '" + name + '\'' +
                ", Отдел'" + departament + '\'' +
                ", Зарплата " + salari +
                ", id=" + id +
                '}';
    }
}
