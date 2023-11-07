import java.util.Locale;
import java.util.Scanner;
//猜24游戏
public class Calculate24 {
    public static void main(String[] args) {
        //带括号（括号在前面）
        //不带括号
        //双括号
        //不带括号，先算乘除，再算加减
        //带括号（括号是中间，括号是最后）
        String username;
        int num1=0;
        int num2=0;
        char flag='|';
        Scanner scanner=new Scanner(System.in);
        System.out.println("游戏名：算24");
        System.out.println("游戏规则：系统生成4个随机数，范围是扑克牌A—K\nJQK分别为11、12、13");
        username=scanner.nextLine();
        if(username.trim().equals("")){
            username="匿名";
        }
         while(true){
             //系统生成4个随机数
             int i;
             for(i=0;i<4;i++){
                 //生成1-14的随机数字
                 int num=(int)(Math.random()*13+1);
                 switch (num){
                     case 1:
                         System.out.print("A\t");
                         break;
                     case 11:
                         System.out.print("J\t");
                         break;
                     case 12:
                         System.out.print("Q\t");
                         break;
                     case 13:
                         System.out.print("K\t");
                         break;
                     default:
                         System.out.print(num+"\t");
                 }
             }

             //用户输入表达式
             System.out.println("请玩家输入表达式：");
             String expression="(3+4)+3+4";
             //expression=scanner.next();
             int index_first=expression.indexOf("(");
             int index_last=expression.indexOf(")");
             int index_second=expression.lastIndexOf(")");
             int index_second_last=expression.lastIndexOf("(");
             //判断左括号
             if(index_last==-1){
                 index_last=expression.length();
             }else{
                 if(index_second==-1){

                 }else{
                     num2=function1(index_second+1,index_second_last,num1,expression,flag);
                     if(index_last<expression.length()){
                         num2=function1(index_second_last+1,expression.length(),num1,expression,flag);
                     }
                 }
             }


             num1=function1(index_first+1,index_last,num1,expression,flag);
             if(index_last<expression.length()){
                 num1=function1(index_last+1,expression.length(),num1,expression,flag);
             }
             //第二个括号计算

             System.out.println(num1);
             System.out.println();
             System.out.println("继续还是退出(y/n)");
             //退出
             String ch=scanner.next();
             if (ch.toLowerCase().equals("n")){
                 break;
             }
         }
    }
    public static int function2(char flag,int num1,int num2) {
        switch (flag){
            case '|':
                if(num2==0){
                    num1+=9;
                }else{
                    num1=num2;
                }
                break;
            case '+':
                if (num2==0){
                    num1+=9;
                }else{
                    num1+=num2;
                }
                break;
            case '-':
                if (num2==0){
                    num1-=9;
                }else{
                    num1-=num2;
                }
                break;
            case '*':
                if(num2!=0){
                    num1*=num2;
                }else{
                    num1*=10;
                }
                break;
            case '/':
                if(num2!=0){
                    num1/=num2;
                }else{
                    num1/=10;
                }
        }
        return num1;

    }
    public static int function1(int start,int end,int num1,String expression,char flag) {
        for (int i = start; i < end; i++) {
            char num1_mid = expression.charAt(i);
            switch (num1_mid) {
                case 'A':
                    num1 = function2(flag, num1, 1);
                    break;
                case 'J':
                    num1 = function2(flag, num1, 11);
                    break;
                case 'Q':
                    num1 = function2(flag, num1, 12);
                    break;
                case 'K':
                    num1 = function2(flag, num1, 13);
                    break;
                case '+':
                    flag = '+';
                    break;
                case '-':
                    flag = '-';
                    break;
                case '*':
                    flag = '*';
                    break;
                case '/':
                    flag = '/';
                    break;
                case '(':

                    break;
                default:
                    num1 = function2(flag, num1, Integer.parseInt(num1_mid + ""));
            }
        }
        return num1;

    }
}
