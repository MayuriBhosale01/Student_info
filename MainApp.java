package Application2;

import java.util.Scanner;

public class MainApp {
    static Scanner sc= new Scanner(System.in);
    static BLclass bl=new BLclass();

    public static void main(String[] args) {

        boolean status =true;
        do {
            System.out.println("1.Add the student");
            System.out.println("2.Add the subject");
            System.out.println("3.Remove the student");
            System.out.println("4.Display student");
            System.out.println("5.update students subjects");
            System.out.println("6.search student by id");
            System.out.println("7.Display student by subject");
            System.out.println("8.exit");
        //    System.out.println("3.");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    displayStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    searchStudent();
                    break;

                case 6:
                    searchBySubject();
                    break;
                    

                case 7:
                    status=false;
                default:
                    System.out.println("invalid choice");
            }
        }while (status);
    }

    private static void searchBySubject() {
    }

    private static void searchStudent() {
        System.out.println("enter rollno");
        int rollno=sc.nextInt();
        bl.search(rollno);
        System.out.println("search student successfully");
    }
    private static void updateStudent() {
        System.out.println("enter rollno");
        int rollno=sc.nextInt();
        System.out.println("enter student name");
        String name=sc.next();
        System.out.println("enter student marks");
        int marks=sc.nextInt();
        bl.update(rollno,name,marks);
        System.out.println("updated");

    }
    private static Subject updateSubject(){
        System.out.println("enter updated sid");
        int sid=sc.nextInt();
        System.out.println("enter updated sname");
        String sname=sc.next();
        System.out.println("enter updated sfees");
        double sfees=sc.nextDouble();
        Subject s=new Subject(sid,sname,sfees);
        return s;
    }
    private static void removeStudent() {
        System.out.println("Enter roll no");
        int rollno=sc.nextInt();
        bl.remove(rollno);
    }
    private static Student addStudent() {
        System.out.println("Enter student rollno");
        int rollno = sc.nextInt();
        System.out.println("Enter student name");
        String name = sc.next();
        System.out.println("Enter student marks");
        double marks = sc.nextDouble();

       // Subject s=addSubject();
        Student s= new Student(rollno, name, marks);
        bl.addData(s);
        System.out.println("Add successfully");
        return s;
    }
    private static Subject addSubject(){
        System.out.println("Enter subject id");
        int id=sc.nextInt();
        System.out.println("enter subject name");
        String name=sc.next();
        System.out.println("Enter subject fees");
        double sfees=sc.nextDouble();

        return new Subject(id,name,sfees);
    }
    private static void displayStudent(){
        bl.displayStudent();
    }
}
