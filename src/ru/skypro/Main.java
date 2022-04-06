package ru.skypro;


import java.lang.reflect.Array;

public class Main {


    public static void main(String[] args) {


        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Isakova Olga Aleksandrovna", "dep1", 100000);
        employees[1] = new Employee("Satusev Aleksandr Anatolevich", "dep2", 13200);
        employees[2] = new Employee("Kostyrin Aleksandr Aleksandrovich", "dep3", 47000);
        employees[3] = new Employee("Vaintrub Anna Sergeevna", "dep4", 52000);
        employees[4] = new Employee("Misiuk Elena Aleksandrovna", "dep5", 49000);

        System.out.println(employees);
        System.out.println();
        Employee.printListOfEmployee(employees);
        System.out.println();
        Employee.printSumSalary(employees);
        System.out.println();
        Employee.printAverageSalary(employees);
        System.out.println();
        Employee.printMinSalary(employees);
        System.out.println();
        Employee.printMaxSalary(employees);

    }

}
