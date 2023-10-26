//心理测试
//根据回答的问题计算分数，判断心理压力
import java.util.Scanner;
public class PsychologicalTest {
    public static void main(String[] args){
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
}
