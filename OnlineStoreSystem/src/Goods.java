import java.util.Scanner;

/*
商品模块中的商品类
 */
public class Goods {
    //把变量定义完成,peisong 配送的变量  num 数量的变量 price 价格的变量  name商品名称
    String name;
    String peison;
    int num;
    double price;
    //大图，big_pic商品大图,small_pic是商品的小图,在订单中只需要大图，不需要小图，不要把big_pic给订单用
    //继承后，不允许子类使用，使用关键字是private
    private String big_pic;
    String small_pic;
    //有两个方法  buy是立即购买 addcar加入购物车,这个方法中不用加static
    public  void buy(){
        //最终用户触发buy方法,信息方法知道商品名称,商品数量,价格,配送
        //把Goods类中的变量输出,直接输出name变成红色,会报错, class类中帮助定义一个关键字,可以使用关键字引用变量,关键字this
        //this作用指明当前的类this的实例,这里this报错, this报错的
        System.out.println("你购买了这个商品");
        //调用订单模块,订单需要实例化，先实例化订单类，然后调用方法,这里实例化一个Order
        //实例化Pay类，这里不能再实例化Order,实例化Order会产生地址，需要在整个链中只有一个地址

//        Order order = new Order();
        //order实例化不用，下面order会报错，调用这个方法，只能改成当前实例，this
        //改成this后，make_order报错，因为当前类中没有make_order()
        //再写make_order违背了模块定义，
        this.make_order();
    }
    //显示商品相关信息方法，提供给主页调用
    public void show(){
        //首先显示商品
        System.out.println(this.name);
        System.out.println(this.num);
        System.out.println(this.price);
        System.out.println(this.peison);
        //用户调整数量
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入购买商品的数量");
        //数量只允许整形，如果防止用户输入错误，这里 try-----catch
        //这里的商品数量，如果出错，要继续输入
        while(true){
            try{
                //输入的数量直接给this.num,this指示的当前对象
                this.num=scanner.nextInt();
                //成功后退出循环
                break;
            }catch(Exception e){
                System.out.println("需要重新输入商品数量，你输入的有问题，请输入整数");
            }
        }
        System.out.println("*********************");
        System.out.println("1------立即购买");
        System.out.println("2-------加入购物车");
        System.out.println("*********************");
        System.out.println("请选择你的购买意向，输入序号");
        try{
            //scanner是本类中本函数的全局变量，可以在这里使用
            int no=scanner.nextInt();
            switch(no){
                case 1:
                    this.buy();
                    break;
                case 2:
                    this.addcar();
                    break;
            }
        }catch(Exception e) {
            //如果用户输入错误，默认选择立即购买的方法
            this.buy();
        }




    }
    //下面方法为了引用全局的变量,这里不加static
    public  void addcar(){
        System.out.println("你已经把商品加入购物车");
    }
    //扩展方法，不写这个内容报错make_order方法是写在Goods中没有实现，关键字是public
    protected void make_order(){
        //代码是由订单类做的,不是由Goods模块做的,它只能由Order的开发人员实现
    }
}
