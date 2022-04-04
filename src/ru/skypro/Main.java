package ru.skypro;


import static ru.skypro.Employee.getCount;

public class Main {

    public static void main(String[] args) {

        Employee worker1 = new Employee("Isakova Olga Aleksandrovna", "dep1", 50000);
        Employee worker2 = new Employee("Satusev Aleksandr Anatolevich", "dep2", 45000);
        Employee worker3 = new Employee("Kostyrin Aleksandr Aleksandrovich", "dep3", 47000);
        Employee worker4 = new Employee("Vaintrub Anna Sergeevna", "dep4", 52000);
        Employee worker5 = new Employee("Misiuk Elena Aleksandrovna", "dep5", 49000);


        System.out.println(worker3.getDepartament());
    }
}
