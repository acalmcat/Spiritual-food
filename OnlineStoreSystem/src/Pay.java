import java.util.Scanner;

/*
在生成订单以后，把上一个订单的总价传送给Pay
这个流程操作的是一个订单
支付帐户：可以用户输入支付帐户，也可以传参
 */
public class Pay extends Order{
    //不建议直接给username和money赋值
    String username;
    double money;
    //系统可以自动产生构造函数
    //如果给username和money赋值,提出构造函数
    //构造函数相当于把类初始化时使用的函数,构造涵数可以完成变量的初始化
    //构造函数名称就是类名,只不过这里初始化,需要参数
    public Pay(String myname,double mymoney){
        this.username=myname;
        this.money=mymoney;
    }
    //因为构造器每实例化一次就执行一次，把输入放在构造器中，在这个逻辑中不合适
    public void myinput(){
        //传进来的参数myname,mymoney就是局部变量,只在这个函数有效
        //整个类中的全局变量username money
        //把username和money改成用户输入帐户和钱
        //这里再new一个输入设备，相当于执行另外的输入设备，跟主类的不是一个，主类中还有一个输入，等待接收
        //这里需要主类和辅类中都用一个控制台，把主类的控制台传入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入付款帐户名称");
        this.username=scanner.next();
        System.out.println("请输入付款帐户余额:");
        try{
            this.money=scanner.nextDouble();
        }catch(Exception e){
            this.money=100;
        }
        //因为username和money都是用户输入，不需要传参，后面代码就没有
//        this.username=myname;
//        this.money=mymoney;
    }

    //用户输入的参数，这里不需要传参
    public  Pay(){

    }
    //    @Override
//    protected void make_order(){
//
//    }
    //实现方法
    //实现重写Order中的pay_order方法
    @Override
    public void pay_order(){
        System.out.println(this.money);
        System.out.println(this.total);
        //实现支付的逻辑，判断当前的余额比订单大还是小
        if(this.money>this.total){
            this.money=this.money-this.total;
            System.out.println("恭喜你，成功买得商品");
            System.out.println(this.name);
            System.out.println(this.peison);
            System.out.println(this.price);
            System.out.println(this.num);
            System.out.println(this.total);
        }else{
            System.out.println("大哥，钱不够");
        }
    }
}
