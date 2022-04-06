import java.util.Scanner;

class Student{
    int rollno;
    String name;
    int mmarks,pmarks,cmarks;

    Student(int rollno,String name,int m,int c,int p){
        this.rollno = rollno;
        this.name = name;
        this.mmarks =m;
        this.cmarks = c;
        this.pmarks =p;
    }

    public int avgMarks(){
        int avg = (this.pmarks + this.cmarks + this.mmarks)/3;
        return avg;
    }

}


public class StudentGradeCalculator {

    public static String studentGrade(Student st){
        if(st.avgMarks()>= 90 && st.avgMarks()<=100){
            return "A";
        }else if(st.avgMarks()>= 80 && st.avgMarks()<=90){
            return "B";
        }else if(st.avgMarks()>= 70 && st.avgMarks()<=80){
            return "C";
        }else {
            return "Fail";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter chemistry marks ");
        int cmarks = sc.nextInt();


        Student st1 = new Student(101,"Rajesh",78,cmarks,77);
        System.out.println("Student " + st1.name+ " scored grade- "+ studentGrade(st1));

    }
}
