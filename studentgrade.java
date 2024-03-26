import java.util.*;
public class studentgrade {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks obtained in physics");
        int phy=sc.nextInt();
        System.out.println("enter the marks obtained in chemistry");
        int chem=sc.nextInt();
        System.out.println("enter the marks obtained in biology");
        int bio=sc.nextInt();
        System.out.println("enter the marks obtained in maths");
        int maths=sc.nextInt();
        System.out.println("enter the marks obtained in computer");
        int computer=sc.nextInt();
        int total_marks=phy+chem+bio+maths+computer;
        System.out.println("the total marks is"+" "+total_marks);
        double avg=(total_marks/5)*100;
        System.out.println("the average percentage is"+" "+avg+"%");
        String result="";
        if(avg>=90 && avg<100){
        result="A";
        }
       else if(avg>=80 && avg<90){
        result="B";
        }
        else if(avg>=70 && avg<80){
        result="C";
        }
        else if(avg>=60 && avg<70){
        result="D";
        }
        else  if(avg>=50 && avg<60){
        result="E";
        }
        else if( avg<50){
        result="F";
        }
        System.out.println(result);
    }
}
