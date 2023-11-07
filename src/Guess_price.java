import java.util.Scanner;
//猜商品价格
public class Guess_price {
    public static void main(String[] args) {
        float plan_price;
        System.out.println("这是一个猜价格的游戏");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择你要猜的商品");
        System.out.println("1----篮球（100-1000）");
        System.out.println("2----手机（1000-5000）");
        String user_choice=scanner.next();
        switch (user_choice){
            case "1":
                plan_price=Math.round(Math.random()*900+100);
                break;
            case "2":
                plan_price=Math.round(Math.random()*4000+1000);
                break;
            default:
                System.out.println("选择无效，随机0-10000");
                plan_price=Math.round(Math.random()*10000);
        }
        System.out.println("猜中自动退出，输入-1直接结束");
        System.out.println("请你输入你猜的价格：");
        float user_price=scanner.nextFloat();
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
            user_price=scanner.nextFloat();
        }
        if(flag){
            System.out.println("你放弃了，没有猜中");
        }else{
            System.out.println("你猜中了");
        }
    }
}