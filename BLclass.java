package Application2;

import GrommingSession.Customer;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class BLclass {
    private static List<Student>data=new ArrayList<>() ;
    private static List<Subject>data1=new ArrayList<>();
    {
        data.add(new Student(1,"mayu",80));
        data.add(new Student(2,"asmi",90));
        data.add(new Student(3,"vantaa",70));
        data.add(new Student(4,"aishu",75));
    }
    {
        data1.add(new Subject(101,"java",500));
        data1.add(new Subject(102,"j2ee",600));
        data1.add(new Subject(103,"SQL",700));
        data1.add(new Subject(104,"wt",800));
    }
    public void addData(Student s){
        data.add(s);
    }
    public void remove(int rollno){
        for(int i=0;i< data.size();i++){
            if(rollno==data.get(i).getRollno()){
                data.remove(i);
            }
        }
    }

    public void update(int sid,String sname,double sfees){
        for(int i=0;i<data.size();i++){
            if(sid==data1.get(i).getSid()){
                data1.get(i).setSname(sname);
                data1.get(i).setSfees(sfees);

            }
        }
    }
    public void search(int id){
        for(int i=0;i<data.size();i++){
            boolean status=true;
            if(id==data.get(i).getRollno()){
                data.contains(i);
                for(Student c:data){
                    System.out.println(c.getName());
                    System.out.println(id==c.getRollno());
                    System.out.println(c.getMarks());
                }
            }
        }
    }

    public  void displayStudent() {
        for (Student c : data) {
            System.out.println(c.getRollno());
            System.out.println(c.getName());
            System.out.println(c.getMarks());
        }
        for(Subject c:data1){
            System.out.println(c.getSid());
            System.out.println(c.getSname());
            System.out.println(c.getSfees());
        }



    }

}
