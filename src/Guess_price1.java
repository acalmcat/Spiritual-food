import java.util.Scanner;
//猜商品价格
public class Guess_price1 {
    public static void main(String[] args) {
        /*
        修改内容：
        1.价格要产生两位的小数
        2.用户输入数据的匹配，用户输入不能有字母符号，采用正则表达式
         */
        float plan_price;
        System.out.println("这是一个猜价格的游戏");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择你要猜的商品");
        System.out.println("1----篮球（100-1000）");
        System.out.println("2----手机（1000-5000）");
        String user_choice=scanner.next();
        switch (user_choice){
            case "1":
                //plan_price=Math.round(Math.random()*900+100);
                String tmp_price=String.format("%.2f",Math.random()*900+100);
                plan_price=Float.parseFloat(tmp_price);
                break;
            case "2":
                //plan_price=Math.round(Math.random()*4000+1000);
                tmp_price=String.format("%.2f",Math.random()*4000+1000);
                plan_price=Float.parseFloat(tmp_price);
                break;
            default:
                System.out.println("选择无效，随机0-10000");
                //plan_price=Math.round(Math.random()*10000);
                tmp_price=String.format("%.2f",Math.random()*10000);
                plan_price=Float.parseFloat(tmp_price);
        }
        System.out.println("猜中自动退出，输入-1直接结束");
        System.out.println("请你输入你猜的价格，带2位小数：");
        //采用正则表达式判断用户输入格式是否正确
        String tmp_user_price=scanner.next();
        while(!tmp_user_price.matches("^[0-9]+(.[0-9]{1,2})?$")){
            System.out.println("你输入的价格格式不对，请重新输入：");
            tmp_user_price=scanner.next();
        }
        float user_price=Float.parseFloat(tmp_user_price);
        boolean flag=false;
        while(!(user_price==plan_price)){
            if(user_price==-1){
                flag=true;
                break;
            }
            if(user_price>plan_price){
                System.out.println("猜大了");
            }else{
                System.out.println("猜小了");
            }
            //若没猜中继续循环
            tmp_user_price=scanner.next();
            while(!tmp_user_price.matches("^[0-9]+(.[0-9]{1,2})?$")) {
                System.out.println("你输入的价格有问题，请检查输入价格：");
                tmp_user_price = scanner.next();
            }
            user_price=Float.parseFloat(tmp_user_price);
        }
        if(flag){
            System.out.println("你放弃了，没有猜中");
        }else{
            System.out.println("你猜中了");
        }
        System.out.println("商品价格为："+plan_price);
    }
}