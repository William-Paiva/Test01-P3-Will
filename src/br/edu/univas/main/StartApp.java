package br.edu.univas.main;

import br.edu.univas.vo.Masters;
import br.edu.univas.vo.Postgraduate;
import br.edu.univas.vo.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StartApp {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();

    public void Start(){

        int option;

        do{

            option = menu();

            switch(option){
                case(1): registration(); break;
                case(2): postGraduateList();break;
                case(3): mastersList(); break;
            }

        }while (option!=9);
        System.out.println("Thanks for all!");
    }


    public void registration(){
        Student student = null;

        System.out.println("Ok! Let's make a student's registration!\n");
        System.out.println("Enter the student's CPF: ");
        int cpf = scanner.nextInt(); scanner.nextLine();

        int check = checkCpf(cpf);

        if(check == 1){
            System.out.println("Error! This student is already on the list!");
        }else{
            System.out.println("Enter the student's name: ");
            String name =  scanner.nextLine();
            System.out.println("Enter the student's email: ");
            String email = scanner.nextLine();
            int category = studentsCategory();
            if(category == 1){
                student = new Masters(cpf, name, email);
            }else if(category == 2){
                student = new Postgraduate(cpf, name, email);
            }
            students.add(student);
        }
    }

    public void mastersList(){
        for (int i=0; i< students.size(); i++){
            System.out.println(students.get(i).toString());
        }
    }

    public void postGraduateList(){
        for (int i=0; i< students.size(); i++){
            System.out.println(students.get(i).toString());
        }
    }

    public int checkCpf(int cpf){
        int count = 0;
        for (int i=0; i< students.size(); i++){
            int cpfList = students.get(i).getCpf();
            if(cpf == cpfList){
                count++;
            }
        }
        return count;
    }

    public int studentsCategory(){
        System.out.println("\nNow, choose the student's category!\n");
        System.out.println("1. Masters\n2. Postgraduate\n");
        int option = scanner.nextInt(); scanner.nextLine();
        return option;
    }

    public int menu(){
        System.out.println("\n==== Students Registration ====\n");
        System.out.println("Choose one option below:\n ");
        System.out.println("1. Student's Registration");
        System.out.println("2. List Student's Postgraduate");
        System.out.println("3. List Student's Masters");
        System.out.println("9. Exit");

        int option = scanner.nextInt(); scanner.nextLine();
        return option;
    }
}
