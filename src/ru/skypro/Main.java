package ru.skypro;


public class Main {
    public static void printListOfEmployees(int employees[]) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                break;
            }
            System.out.println((i + 1) + ". " + employees[i].getName());
        }
    }


        public static void main (String[]args){

            Employee[] employees = new Employee[10];
            employees[0] = new Employee("Isakova Olga Aleksandrovna", "dep1", 50000);
            employees[1] = new Employee("Satusev Aleksandr Anatolevich", "dep2", 45000);
            employees[2] = new Employee("Kostyrin Aleksandr Aleksandrovich", "dep3", 47000);
            employees[3] = new Employee("Vaintrub Anna Sergeevna", "dep4", 52000);
            employees[4] = new Employee("Misiuk Elena Aleksandrovna", "dep5", 49000);

            printListOfEmployees(employees);
        }

}
