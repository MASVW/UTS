package model;

import java.util.ArrayList;

import org.w3c.dom.Text;

public class Employee 
{
    private char kodePegawai, namaPegawai;
    private Text alamat;


    public Employee() {
    }

    public Employee(char kodePegawai, char namaPegawai, Text alamat) {
        this.kodePegawai = kodePegawai;
        this.namaPegawai = namaPegawai;
        this.alamat = alamat;
    }

    public char getKodePegawai() {
        return this.kodePegawai;
    }

    public void setKodePegawai(char kodePegawai) {
        this.kodePegawai = kodePegawai;
    }

    public char getNamaPegawai() {
        return this.namaPegawai;
    }

    public void setNamaPegawai(char namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public Text getAlamat() {
        return this.alamat;
    }

    public void setAlamat(Text alamat) {
        this.alamat = alamat;
    }

    public static ArrayList <Employee> init(ArrayList <Employee> employees)
    {   
        Employee emp1 = new Employee("01M0001", "Abed Abed", "Jalan Halat");
        employees.add(emp1);
        Employee emp2 = new Employee("02M0002", "Beta Beta", "Jalan Walikota");
        employees.add(emp2);
        Employee emp3 = new Employee("01M0001", "Abed Abed", "Jalan Halat");
        employees.add(emp4);
        Employee emp4 = new Employee("02M0002", "Beta Beta", "Jalan Walikota");
        employees.add(emp4);
        Employee emp5 = new Employee("01M0001", "Abed Abed", "Jalan Halat");
        employees.add(emp5);
        Employee emp6 = new Employee("02M0002", "Beta Beta", "Jalan Walikota");
        employees.add(emp6);
        Employee emp7 = new Employee("01M0001", "Abed Abed", "Jalan Halat");
        employees.add(emp7);
        Employee emp8 = new Employee("02M0002", "Beta Beta", "Jalan Walikota");
        employees.add(emp8);
    }
    @Override
    public String toString() {
        return "{" +
            " kodePegawai='" + getKodePegawai() + "'" +
            ", namaPegawai='" + getNamaPegawai() + "'" +
            ", alamat='" + getAlamat() + "'" +
            "}";
    }

}
