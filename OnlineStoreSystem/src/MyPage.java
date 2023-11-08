import java.util.Scanner;

/*
商品构买逻辑模块的首页
      开发者:XXXX
      版本:v1.1
 */
public class MyPage {
    public static void main(String[] args) {
        //显示商品列表的菜单
        System.out.println("*********************");
        System.out.println("  欢迎光临幸运购买系统");
        System.out.println("          版本：v1.1");
        System.out.println("修改内容：整个继承链上只有一个地址指向");
        System.out.println("--------------------");
        //实例化所有的商品，后面显示 new一个 Goods类，就是实例化一个商品，数量初始化为1
        Pay goods1=init("伤寒论张仲景正版原著中医书籍大全白话彩图典藏版",9.8,"江苏南京至北京市昌平区",1);
        Pay goods2=init("鬼谷子狼道墨菲定律断舍离说话技巧",178,"河北廊坊至北京市昌平区",1);
        Pay goods3=init("红岩书正版",21.6,"河北廊坊至北京市昌平区",1);
        Pay goods4=init("镜花缘 李汝珍著 ",18.9,"天猫优仓天津1仓至北京市昌平区",1);
        Pay goods5=init("读心术正版心理学书",8.8,"北京至北京市昌平区",1);
        //初始化五个商品，显示到首页上，重复显示五个数
        print_goods(1,goods1.name,goods1.price);
        print_goods(2,goods2.name,goods2.price);
        print_goods(3,goods3.name,goods3.price);
        print_goods(4,goods4.name,goods4.price);
        print_goods(5,goods5.name,goods5.price);
        System.out.println("*********************");
        //上面代码允许用户看首页,看完首页进入订单页，必有用户名
        Scanner scanner = new Scanner(System.in);
        //必须敲回车,或者用户敲任意字符不接收,这里不接收没有登录用户
        scanner.nextLine();
        //需要用户登录，才能选择商品，记住细节，之前执行过init，就执行过new Pay，之前的内容不允许输入用户名
        System.out.println("请进行用户登录");
        //执行用户登陆

        //这里只重新调用初始化函数，不需要再显示，因为前面的代码已经显示过了，这段代码的目的是每个商品输入用户名
        goods1=init("伤寒论张仲景正版原著中医书籍大全白话彩图典藏版",9.8,"江苏南京至北京市昌平区");
        goods1.myinput();
        goods2=init("鬼谷子狼道墨菲定律断舍离说话技巧",178,"河北廊坊至北京市昌平区");
        goods2.username=goods1.username;
        goods2.money=goods1.money;
        goods3=init("红岩书正版",21.6,"河北廊坊至北京市昌平区");
        goods3.username=goods1.username;
        goods3.money=goods1.money;
        goods4=init("镜花缘 李汝珍著 ",18.9,"天猫优仓天津1仓至北京市昌平区");
        goods4.username=goods1.username;
        goods4.money=goods1.money;
        goods5=init("读心术正版心理学书",8.8,"北京至北京市昌平区");
        goods5.username=goods1.username;
        goods5.money=goods1.money;
        //这里只接收商品编号，使用nextInt会报错，直接用try -----catch
        System.out.println("请输入购买商品的编号:");
        try{
            int no=scanner.nextInt();
            //当选择对应的商品后，进行商品模块，商品模块中显示商品详情，立即购买，加入购物车两个按钮
            //调用商品模块中的显示。
            switch(no){
                case 1:
                    //首页中调用商品1的显示方法
                    goods1.show();
                    break;
                case 2:
                    goods2.show();
                    break;
                case 3:
                    goods3.show();
                    break;
                case 4:
                    goods4.show();
                    break;
                case 5:
                    goods5.show();
                    break;

            }

        }catch(Exception e){
            System.out.println("谢谢使用，你输入错误，请输入商品对应的编号");
        }




    }
    //用函数解决代码中重复代码问题，参数不一致，在循环中用多个数组来解决，这里用函数传参的方式
    //后期改变打印样式，只需要改变函数即可
    public static void print_goods(int i,String name,double price){
        System.out.println( i+"-"+name+"\t"+price);
    }
    //不停地new Goods,然后把参数去赋值,把不同的参数传入到方法中，构成实例化不同的商品数据
    //这个方法需要实例化把商品返回主类，因为在main函数中用这个商品
    //函数注意修改类后的返回类型
    public static Pay init(String name,double price,String peison,int num){
        //需要一条继承链中的最底端，应该用实例化的Pay
        //因为Pay类中有构造函数,构造函数中提供初始化的参数
        //在实例化执行了构造函数,直接把username和money传入即可
        //这里引用传参。目的是第一次显示商品有一个默认用户
        Pay pay1=new Pay("张三",100);
        pay1.name=name;
        pay1.price=price;
        pay1.peison=peison;
        pay1.num=num;
        return pay1;
    }
    //采用重构的方法再次产生一个init方法
    public static Pay init(String name,double price,String peison){
        //需要一条继承链中的最底端，应该用实例化的Pay
        //因为Pay类中有构造函数,构造函数中提供初始化的参数
        //在实例化执行了构造函数,直接把username和money传入即可
        //这里引用传参。目的是第一次显示商品有一个默认用户
        Pay pay1=new Pay();
        pay1.name=name;
        pay1.price=price;
        pay1.peison=peison;
        pay1.num=1;
        return pay1;
    }
}
