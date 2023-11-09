import java.util.Scanner;

/*
修改Goods类，变成Java开发的规范
 */
public class Goods {
    //第一，满足封装特性，所有变量全部私有private
    private String name;
    private String peison;
    private int num;
    private double price;
    //    private String big_pic;
    private String small_pic;
    //自动产生一个无参构造
    public Goods() {
    }

    //自动产生全参构造函数，主类main函数调用这个类直接传入参数，不需要在主类main中产生init方法
    public Goods(String name, double price,String peison, int num) {
        this.name = name;
        this.peison = peison;
        this.num = num;
        this.price = price;
    }
    //正常逻辑中的方法
    //显示所有的商品的方法show
    public void show(){
        //首先显示商品
        System.out.println(this.name);
        System.out.println(this.num);
        System.out.println(this.price);
        System.out.println(this.peison);
        //用户调整数量
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入购买商品的数量");
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
    //立即购买的方法
    public  void buy(){
        System.out.println("你购买了这个商品");
        //这里调用Order订单类的make_order()方法,在这里产生一个空方法,在Order类中重写
        this.make_order();
    }
    //加入购物车的方法
    public  void addcar(){

        System.out.println("你已经把商品加入购物车");
    }
    //protected修饰,需要了类继承后进行重写
    protected void make_order(){
        //代码是由订单类做的,不是由Goods模块做的,它只能由Order的开发人员实现
    }

    //便于阅读，这些getter或者Setter方法放在代码的尾部
    //第二，封装私有变量后，需要取值的变量用get方法，需要赋值的方法用set,即需要取值也需要赋值就是两个方法都有
    //比如对name,get加上属性的首字母大写,get方法的目的是需要用户获取这个值，这里有返回值
    public String getName(){
        return this.name;
    }
    //set方法只起到一个赋值的作用，不需要返回值，因为需要赋值，必须有参数，参数name是局部变量
    //一般set方法局部变量和类中属性名重名
    public void setName(String name) {
        this.name=name;
    }

    public String getPeison() {
        return peison;
    }

    public void setPeison(String peison) {
        this.peison = peison;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSmall_pic() {
        return small_pic;
    }

    public void setSmall_pic(String small_pic) {
        this.small_pic = small_pic;
    }
}
