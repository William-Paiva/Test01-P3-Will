package br.edu.univas.vo;

import java.util.Objects;

public class Student {

    private int cpf;
    private  String name;
    private String email;


    public Student(int cpf, String name, String email ){
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }


    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return cpf == student.cpf;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Student{" +
                "cpf=" + cpf +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
