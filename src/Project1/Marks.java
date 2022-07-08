package Project1;
//We have to calculate the average of marks obtained in three subjects by student A
       // and in 4 subjects by student B. Create class ‘Marks’ with an abstract method
       // ‘getAverage’ that will be returning the average of marks. Provide implementat
       // ion of abstract method in classes ‘A’ and ‘B’. The constructor of student A
       // takes the marks in three subjects as its parameters and the marks in four
       // subjects as its parameters for student B. Test your code
abstract public class Marks {

    Marks(){
    }

    void getAverage(){

    }

}
class  StudentA extends Marks{
    int sub1;
    int sub2;
    int sub3;

    StudentA(int sub1,int sub2,int sub3) {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;

    }

    @Override
    void getAverage() {
        System.out.println("the average of student class 1="+(sub3+sub1+sub2)/3);

    }
}
class StudentB extends Marks{
    int sub1;
    int sub2;
    int sub3;

    int sub4;



    public StudentB(int sub1,int sub2, int sub3,int sub4) {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }

    @Override
    void getAverage() {
        System.out.println("the average of student B IS ="+(sub3+sub1+sub2+sub4)/4 );
    }

    public static void main(String[] args) {
        Marks marks=new StudentA(12,56,90);
        marks.getAverage();
        Marks marks1=new StudentB(12,56,35,56);
        marks1.getAverage();
    }
}
