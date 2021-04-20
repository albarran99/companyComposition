package org.iesfm.company;

import java.util.Objects;

public class Employee {

    public static final String PROGRAMER = "Programer";
    public static final String PROJECTMANAGER = "ProjectManager";
    public static final String SCRUMMASTER = "ScrumMaster";

    private String rol;
    private String name;
    private String surname;
    private int id;
    private int workHours;

    public Employee(String rol, String name, String surname, int id, int workHours) {
        this.rol = rol;
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.workHours = workHours;
    }

    public void showInfo() {
        if (rol.equals(PROGRAMER)) {
            System.out.println("Hola me llamo " + name + surname);
            System.out.println("Mi codigo de empleado es " + id);
            System.out.println("eh trabajado " + workHours + " horas");
            System.out.println("Y mi rol es " + rol);

        } else if (rol.equals(PROJECTMANAGER)) {
            System.out.println("Hola me llamo " + name + surname);
            System.out.println("Mi codigo de empleado es " + id);
            System.out.println("eh trabajado " + workHours + " horas");
            System.out.println("Y mi rol es " + rol);

        } else if (rol.equals(SCRUMMASTER)) {
            System.out.println("Hola me llamo " + name + surname);
            System.out.println("Mi codigo de empleado es " + id);
            System.out.println("eh trabajado " + workHours + " horas");
            System.out.println("Y mi rol es " + rol);
        }
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && workHours == employee.workHours && Objects.equals(rol, employee.rol) && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rol, name, surname, id, workHours);
    }
}