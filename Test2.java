import java.util.Scanner;
//我在这里改了
public class Test2 {
    public static void main(String[] args) {
        System.out.println("********************趣味测试***************************");
        System.out.println("            1------心理测试");
        System.out.println("            2------冷血程度测试");
        System.out.println("            0------退出");
        System.out.println("******************************************************");
        System.out.println("请选择你要测试的项目序号：");
        Scanner input = new Scanner(System.in);
        int selectNum = input.nextInt();
        if (selectNum == 1){
            PsychologicalTest();
        } else if (selectNum == 2) {
            ColdMan();
        }else {
            System.exit(0);
        }

    }
    public static void PsychologicalTest(){
        System.out.println("这是一个心理测试，请给出你的分数\n根据问题输入0-10，输入数值越大表示越符合自身情况");
        //总分数
        int sum=0;
        //输入
        Scanner input=new Scanner(System.in);
        System.out.println("1.我独自不舒服");
        int score_q1=input.nextInt(); //输入第一个问题，下同
        sum += score_q1;                 //将分数加到总分里，下同
        System.out.println("2.我的睡眠不定，且睡不安稳");
        int score_q2=input.nextInt();
        sum += score_q2;
        System.out.println("3.我有头痛");
        int score_q3=input.nextInt();
        sum += score_q3;
        System.out.println("4.我比少数人更神经紧张");
        int score_q4=input.nextInt();
        sum += score_q4;
        System.out.println("5.我对自己说话");
        int score_q5=input.nextInt();
        sum += score_q5;
        System.out.println("6.我忧虑财务问题");
        int score_q6=input.nextInt();
        sum += score_q6;
        System.out.println("7.与人见面时，我会窘迫");
        int score_q7=input.nextInt();
        sum += score_q7;
        System.out.println("8.下午我感到喉咙痛，但并非忧郁得上感冒");
        int score_q8=input.nextInt();
        sum += score_q8;
        System.out.println("9.我心情不安，无法静坐");
        int score_q9=input.nextInt();
        sum += score_q9;
        System.out.println("10.我心情不安，无法静坐");
        int score_q10=input.nextInt();
        sum += score_q10;
        System.out.println("最终得分："+sum);
        if(sum<43){
            System.out.println("压力过小，可以适当加大压力");
        }else if(sum>=43&&sum<=65){
            System.out.println("压力适中");
        }else{
            System.out.println("压力较大，需要适当降低压力");
        }
    }

    public static void ColdMan() {
        System.out.println("你最爱穿的衣服颜色是什么颜色呢?");
        System.out.println("1.灰黑色");
        System.out.println("2.乳白色");
        System.out.println("3.鲜红色");
        System.out.println("4.深蓝色");
        Scanner input = new Scanner(System.in);
        int res = input.nextInt();

        switch (res) {
            case 1:
                System.out.println("表明你内心的冷血程度是百分之九十。你是一个较为冷血的人，即使是应对自身非常喜欢的事情，也难以体现自身兴奋的情绪，置身噪杂的条件中，你较为艰难逐渐一段会话，你也非常少可以快速的在生疏的条件中得到别人的好感度。");
                break;
            case 2:
                System.out.println("表明你内心的冷血程度是百分之七十。你的内心绝大多数全是较为冷血发麻的念头，尽管心里也是有一些开朗的心态，可是总的来讲或是较为含蓄的，你的性格更好像外刚内柔的种类，可是你同样是一个十分腼腆的性格，非常少发生起伏的感情转变。");
                break;
            case 3:
                System.out.println("表明你内心的冷血程度是百分之五十。在你的内心，冷血与温暖的心情是分别占一半的，应对大部分人的情况下，你全是以一副冰冷的心态应对大伙儿，非常少会体现自已对某一个人或是是某事的高度重视，但实际上你不过是腼腆的性格种类，只需给别人充足的时间段去知晓你，她们会发觉你性格的活泼可爱之处。");
                break;
            case 4:
                System.out.println("表明你内心的冷血程度是百分之三十。你内心的感情是以激情占多数的，可是在大部分不了解你的人来看，你是一个冰冷的人，那样的你对大伙儿来说是较为难接近的，可是这也就是一种外表的主要表现，真心实意对你有感觉的人依然会一直喜欢你的");
                break;
        }
    }
}
