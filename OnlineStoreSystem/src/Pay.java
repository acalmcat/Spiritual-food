import java.util.Scanner;

/*
以Java开发规范来修改的Pay类
 */
public class Pay extends Order{
    //私有化所有的属性
    private String username;
    private double money;

    //无参,自动可以产生一个无参
    public Pay() {
    }
    //有参,因为可以为 username和money赋值
    public Pay(String username, double money) {
        this.username = username;
        this.money = money;
    }
    //正常的逻辑代码区
    //由用户输入用户名和密码，没有放在构造器原因，只需要用户输入一次即可
    public void myinput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入付款帐户名称");
        this.username=scanner.next();
        System.out.println("请输入付款帐户余额:");
        try{
            this.money=scanner.nextDouble();
        }catch(Exception e){
            this.money=100;
        }
    }
    //实现重写Order中的pay_order方法
    @Override
    public void pay_order(){
        //实现支付的逻辑，判断当前的余额比订单大还是小
        if(this.money>this.getTotal()){
            this.money=this.money-this.getTotal();
            System.out.println("恭喜你，成功买得商品");
            System.out.println(this.getName());
            System.out.println(this.getPeison());
            System.out.println(this.getPrice());
            System.out.println(this.getNum());
            System.out.println(this.getTotal());
        }else{
            System.out.println("大哥，钱不够");
        }
    }
    //简化流程,帐户和余额是可以设置的,username和money都有getter和setter方法
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
