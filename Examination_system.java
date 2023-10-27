import javax.lang.model.element.NestingKind;
import java.util.Locale;
import java.util.Scanner;

public class Examination_system {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String name="";
        String number="";
        int sum=0;
        System.out.println("输入姓名：");
        name=scanner.next();
        System.out.println("输入准考证号：");
        number=scanner.next();
        if((number.indexOf("!")==-1)&&(number.indexOf("@")==-1)){
            System.out.println("***********************************");
            System.out.println("                考试系统");
            System.out.println(" 1-------------java");
            System.out.println(" 2-------------数学");
            System.out.println("***********************************");
            System.out.println("选择考试科目，输入对应的序号：");
            String select_number=scanner.next();
            if(select_number.equals("1")){
                System.out.println("第1题：int是什么数据类型？");
                System.out.println("A.整型  B.字符型  C.浮点型  D.布尔型");
                String ans1=scanner.next();
                if (ans1.toUpperCase().equals("A")) {
                    sum=sum+10;
                }
                System.out.println("第2题：short是什么数据类型？");
                System.out.println("A.整型  B.字符型  C.浮点型  D.布尔型");
                String ans2=scanner.next();
                if (ans2.toUpperCase().equals("A")) {
                    sum=sum+10;
                }
                System.out.println("第3题：byte是什么数据类型？");
                System.out.println("A.整型  B.字符型  C.浮点型  D.布尔型");
                String ans3=scanner.next();
                if (ans3.toUpperCase().equals("A")) {
                    sum=sum+10;
                }
                System.out.println("第4题：long是什么数据类型？");
                System.out.println("A.整型  B.字符型  C.浮点型  D.布尔型");
                String ans4=scanner.next();
                if (ans4.toUpperCase().equals("A")) {
                    sum=sum+10;
                }
                System.out.println("第5题：char是什么数据类型？");
                System.out.println("A.整型  B.字符型  C.浮点型  D.布尔型");
                String ans5=scanner.next();
                if (ans5.toUpperCase().equals("B")) {
                    sum=sum+10;
                }
                System.out.println("第6题：float是什么数据类型？");
                System.out.println("A.整型  B.字符型  C.浮点型  D.布尔型");
                String ans6=scanner.next();
                if (ans6.toUpperCase().equals("C")) {
                    sum=sum+10;
                }
                System.out.println("第7题：double是什么数据类型？");
                System.out.println("A.整型  B.字符型  C.浮点型  D.布尔型");
                String ans7=scanner.next();
                if (ans7.toUpperCase().equals("C")) {
                    sum=sum+10;
                }
                System.out.println("第8题：boolean是什么数据类型？");
                System.out.println("A.整型  B.字符型  C.浮点型  D.布尔型");
                String ans8=scanner.next();
                if (ans8.toUpperCase().equals("D")) {
                    sum=sum+10;
                }
                System.out.println("第9题：if语句是什么结构？");
                System.out.println("A.顺序  B.循环  C.选择  D.不知道");
                String ans9=scanner.next();
                if (ans9.toUpperCase().equals("C")) {
                    sum=sum+10;
                }
                System.out.println("第10题：while语句是什么结构？");
                System.out.println("A.顺序  B.循环  C.选择  D.不知道");
                String ans10=scanner.next();
                if (ans10.toUpperCase().equals("B")) {
                    sum=sum+10;
                }
                System.out.println("姓名："+name+"，学号："+number+"，成绩："+sum);
            }else if(select_number.equals("2")){
                System.out.println("第1题：1+1=?");
                System.out.println("A.2  B.4  C.6  D.8");
                String ans1=scanner.next();
                if (ans1.toUpperCase().equals("A")) {
                    sum=sum+10;
                }
                System.out.println("第2题：2+2=?");
                System.out.println("A.4  B.3  C.1  D.6");
                String ans2=scanner.next();
                if (ans2.toUpperCase().equals("A")) {
                    sum=sum+10;
                }
                System.out.println("第3题：3+3？");
                System.out.println("A.6  B.2  C.1  D.6");
                String ans3=scanner.next();
                if (ans3.toUpperCase().equals("A")) {
                    sum=sum+10;
                }
                System.out.println("第4题：4+4=");
                System.out.println("A.8  B.4  C.2  D.1");
                String ans4=scanner.next();
                if (ans4.toUpperCase().equals("A")) {
                    sum=sum+10;
                }
                System.out.println("第5题：5+5=？");
                System.out.println("A.10  B.2  C.4  D.6");
                String ans5=scanner.next();
                if (ans5.toUpperCase().equals("A")) {
                    sum=sum+10;
                }
                System.out.println("第6题：6+6=？");
                System.out.println("A.12  B.2  C.6  D.7");
                String ans6=scanner.next();
                if (ans6.toUpperCase().equals("A")) {
                    sum=sum+10;
                }
                System.out.println("第7题：7+7=？");
                System.out.println("A.14  B.46  C.23  D.67");
                String ans7=scanner.next();
                if (ans7.toUpperCase().equals("A")) {
                    sum=sum+10;
                }
                System.out.println("第8题：8+8=？");
                System.out.println("A.16  B.3  C.54  D.12");
                String ans8=scanner.next();
                if (ans8.toUpperCase().equals("A")) {
                    sum=sum+10;
                }
                System.out.println("第9题：9+9=？");
                System.out.println("A.18  B.23  C.45  D.12");
                String ans9=scanner.next();
                if (ans9.toUpperCase().equals("A")) {
                    sum=sum+10;
                }
                System.out.println("第10题：10+10=？");
                System.out.println("A.20  B.34  C.12  D.54");
                String ans10=scanner.next();
                if (ans10.toUpperCase().equals("A")) {
                    sum=sum+10;
                }
                System.out.println("姓名："+name+"，学号："+number+"，成绩："+sum);
            }
        }else{
            System.out.println("输入的准考证号不对，退出考试系统");
        }
    }
}
