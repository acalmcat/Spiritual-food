import java.util.Scanner;

public class Examination_system {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String name;
        String number;
        int sum=0;
        System.out.println("输入姓名：");
        name=scanner.next();
        System.out.println("输入准考证号：");
        number=scanner.next();
        if((!number.contains("!"))&&(!number.contains("@"))){
            System.out.println("***********************************");
            System.out.println("                考试系统");
            System.out.println(" 1-------------java");
            System.out.println(" 2-------------数学");
            System.out.println("***********************************");
            System.out.println("选择考试科目，输入对应的序号：");
            String select_number=scanner.next();
            if(select_number.equals("1")){
                System.out.println("-----java选择题");
                System.out.println("1．Java application中的主类需包含main方法，以下哪项是main方法的正确形参？");
                System.out.println("A、 String args B、String args[] C、Char arg D、StringBuffer args[]");
                String ans1=scanner.next();
                if (ans1.equalsIgnoreCase("b")) {
                    sum=sum+5;
                }
                System.out.println("2．下列哪个选项是合法的标识符？");
                System.out.println("A、 123 B、 _name C、 class D、1first");
                String ans2=scanner.next();
                if (ans2.equalsIgnoreCase("b")) {
                    sum=sum+5;
                }
                System.out.println("3．以下关于继承的叙述正确的是");
                System.out.println("A、在Java中类只允许单一继承\n" +
                        "B、在Java中一个类只能实现一个接口\n" +
                        "C、在Java中一个类不能同时继承一个类和实现一个接口\n" +
                        "D、在Java中接口只允许单一继承");
                String ans3=scanner.next();
                if (ans3.equalsIgnoreCase("a")) {
                    sum=sum+5;
                }
                System.out.println("4．下面语句中，正确的是");
                System.out.println("A、boolean b=”true”;\n" +
                        "B、double x=2.5f;\n" +
                        "C、char c=”A”;\n" +
                        "D、float y=0.8d;");
                String ans4=scanner.next();
                if (ans4.equalsIgnoreCase("b")) {
                    sum=sum+5;
                }
                System.out.println("5、有以下方法的定义，请选择该方法的返回类型\n" +
                        "ReturnType method(byte x, double y)\n" +
                        "{\n" +
                        "return (short)x/y*2;\n" +
                        "}");
                System.out.println("A、byte B、short C、int D、double");
                String ans5=scanner.next();
                if (ans5.equalsIgnoreCase("d")) {
                    sum=sum+5;
                }
                System.out.println("6.void的含义");
                System.out.println("A．方法没有返回值　　　 B． 方法体为空\n" +
                        "  C．没有意义　　　　 D.　定义方法时必须使用");
                String ans6=scanner.next();
                if (ans6.equalsIgnoreCase("a")) {
                    sum=sum+5;
                }
                System.out.println("7. 关于选择结构下列哪个说法正确");
                System.out.println("A．if语句和 else语句必须成对出现\n" +
                        "   B．ifelse语句对应\n" +
                        "   C．switch结构中每个case语句中必须用break语句\n" +
                        "   D．switch结构中必须有default语句");
                String ans7=scanner.next();
                if (ans7.equalsIgnoreCase("b")) {
                    sum=sum+5;
                }
                System.out.println("8. 设 x = 1 , y = 2 , z = 3，则表达式 y＋＝z--/++x的值是");
                System.out.println("A. 3        B. 3. 5 \n" +
                        "C. 4        D. 5");
                String ans8=scanner.next();
                if (ans8.equalsIgnoreCase("a")) {
                    sum=sum+5;
                }
                System.out.println("9. 以下哪个不是Java的原始数据类型");
                System.out.println("A、int  B、Boolean  C、float  D、char");
                String ans9=scanner.next();
                if (ans9.equalsIgnoreCase("b")) {
                    sum=sum+5;
                }
                System.out.println("10. 注释的基本原则不包括：");
                System.out.println("A、注释应该增加代码的清晰度\n" +
                        "B、注释要简洁\n" +
                        "C、在写代码之前写注释\n" +
                        "D、尽量给每一条语句加注释");
                String ans10=scanner.next();
                if (ans10.equalsIgnoreCase("d")) {
                    sum=sum+5;
                }
                System.out.println("11.在创建对象时必须");
                System.out.println("A) 先声明对象，然后才能使用对象\n" +
                        "B 先声明对象，为对象分配内存空间，然后才能使用对象\n" +
                        "C 先声明对象，为对象分配内存空间，对对象初始化，然后才能使用对象");
                String ans11=scanner.next();
                if (ans11.equalsIgnoreCase("c")) {
                    sum=sum+5;
                }
                System.out.println("12．Java源文件和编译后的文件扩展名分别为");
                System.out.println("A).class和 .java (B).java和 .class (C).class和 .class (D) .java和 .java");
                String ans12=scanner.next();
                if (ans12.equalsIgnoreCase("b")) {
                    sum=sum+5;
                }
                System.out.println("13．设有数组的定义int[] a = new int[3]，则下面对数组元素的引用错误的是");
                System.out.println("（A）a[0] （B）a[a.length-1] （C）a[3] （D）int i=1； a[i]");
                String ans13=scanner.next();
                if (ans13.equalsIgnoreCase("c")) {
                    sum=sum+5;
                }
                System.out.println("14.整型数据类型中，需要内存空间最少的是");
                System.out.println("A) short B) long C) intD) byte");
                String ans14=scanner.next();
                if (ans14.equalsIgnoreCase("d")) {
                    sum=sum+5;
                }
                System.out.println("15．Java中基本数据类型不包括");
                System.out.println("(A) int\n" +
                        "(B) float\n" +
                        "(C) boolean               \n" +
                        "(D) string");
                String ans15=scanner.next();
                if (ans15.equalsIgnoreCase("d")) {
                    sum=sum+5;
                }
                System.out.println("16.以下数据类型里不是数值类的是");
                System.out.println("A.int     B.float    C.double   D.char");
                String ans16=scanner.next();
                if (ans16.equalsIgnoreCase("d")) {
                    sum=sum+5;
                }
                System.out.println("17.Math.round()的作用是");
                System.out.println("A.四舍五入   B.随机一个数    C.去除小数  D.保留小数");
                String ans17=scanner.next();
                if (ans17.equalsIgnoreCase("a")) {
                    sum=sum+5;
                }
                System.out.println("18.以下哪些不是循环结构");
                System.out.println("A.for(;;){}     B.while(){}       C.do{}while()    D.switch(){}");
                String ans18=scanner.next();
                if (ans18.equalsIgnoreCase("d")) {
                    sum=sum+5;
                }
                System.out.println("19.下面（  Ｄ  ）赋值语句不会出现编译警告或错误的是。");
                System.out.println("Ａ．float f =1.3;　Ｂ．char c=”a”;　Ｃ．byte b=257;　Ｄ．int i=10;");
                String ans19=scanner.next();
                if (ans19.equalsIgnoreCase("d")) {
                    sum=sum+5;
                }
                System.out.println("看下面一段代码：\n" +
                        "int i=1;\n" +
                        "i++;\n" +
                        "++i;\n" +
                        "i+=i;\n" +
                        "Sytem.out.println(i);输出的i为");
                System.out.println("A.4    B.5    C.6   D.7");
                String ans20=scanner.next();
                if (ans20.equalsIgnoreCase("c")) {
                    sum=sum+5;
                }
                System.out.println("姓名："+name+"，学号："+number+"，成绩："+sum);
            }else if(select_number.equals("2")){
                System.out.println("第1题：1+1=?");
                System.out.println("A.2  B.4  C.6  D.8");
                String ans1=scanner.next();
                if (ans1.equalsIgnoreCase("A")) {
                    sum=sum+10;
                }
                System.out.println("第2题：2+2=?");
                System.out.println("A.4  B.3  C.1  D.6");
                String ans2=scanner.next();
                if (ans2.equalsIgnoreCase("A")) {
                    sum=sum+10;
                }
                System.out.println("第3题：3+3？");
                System.out.println("A.6  B.2  C.1  D.6");
                String ans3=scanner.next();
                if (ans3.equalsIgnoreCase("A")) {
                    sum=sum+10;
                }
                System.out.println("第4题：4+4=");
                System.out.println("A.8  B.4  C.2  D.1");
                String ans4=scanner.next();
                if (ans4.equalsIgnoreCase("A")) {
                    sum=sum+10;
                }
                System.out.println("第5题：5+5=？");
                System.out.println("A.10  B.2  C.4  D.6");
                String ans5=scanner.next();
                if (ans5.equalsIgnoreCase("A")) {
                    sum=sum+10;
                }
                System.out.println("第6题：6+6=？");
                System.out.println("A.12  B.2  C.6  D.7");
                String ans6=scanner.next();
                if (ans6.equalsIgnoreCase("A")) {
                    sum=sum+10;
                }
                System.out.println("第7题：7+7=？");
                System.out.println("A.14  B.46  C.23  D.67");
                String ans7=scanner.next();
                if (ans7.equalsIgnoreCase("A")) {
                    sum=sum+10;
                }
                System.out.println("第8题：8+8=？");
                System.out.println("A.16  B.3  C.54  D.12");
                String ans8=scanner.next();
                if (ans8.equalsIgnoreCase("A")) {
                    sum=sum+10;
                }
                System.out.println("第9题：9+9=？");
                System.out.println("A.18  B.23  C.45  D.12");
                String ans9=scanner.next();
                if (ans9.equalsIgnoreCase("A")) {
                    sum=sum+10;
                }
                System.out.println("第10题：10+10=？");
                System.out.println("A.20  B.34  C.12  D.54");
                String ans10=scanner.next();
                if (ans10.equalsIgnoreCase("A")) {
                    sum=sum+10;
                }
                System.out.println("姓名："+name+"，学号："+number+"，成绩："+sum);
            }
        }else{
            System.out.println("输入的准考证号不对，退出考试系统");
        }
    }
}
