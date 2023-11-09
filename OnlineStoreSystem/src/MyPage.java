import java.util.Scanner;

/*
商品构买逻辑模块的首页
      开发者:XXXX
      版本:v1.1
 */
public class MyPage{
    public static void main(String[] args) {
        //整个程序中,mypay1实例化,mypay1,mypay2,mypay3,mypay4,mypay5都需要实例化，赋值，最后调用
        //mypay1,mypay2,mypay3,mypay4,mypay5在整个main函数中全局有效
        //在整个程序中，只要与数值有关系的，一、输入数值选择，二、变量名差不多，多一个数值
        //数组初始化，只有5个元素，只有5个商品
        Pay[] mypays=new Pay[5];
        //由于MyPay初始化时输入不同的参数，把参数做成数组
        String[] names= {"伤寒论张仲景正版原著中医书籍大全白话彩图典藏版",
                "鬼谷子狼道墨菲定律断舍离说话技巧",
                "红岩书正版",
                "镜花缘 李汝珍著 ",
                "读心术正版心理学书"
        };
        //价格数组
        Double[] prices= {9.8,178.0,21.6,18.9,8.8};
        //配送数组
        String[] peisongs= {"江苏南京至北京市昌平区",
                "河北廊坊至北京市昌平区",
                "河北廊坊至北京市昌平区",
                "天猫优仓天津1仓至北京市昌平区",
                "北京至北京市昌平区"
        };
        //显示商品列表的菜单
        System.out.println("*********************");
        System.out.println("  欢迎光临幸运购买系统");
        System.out.println("          版本：v1.2");
        System.out.println("修改内容：分类后的优化代码");
        System.out.println("--------------------");

        //定义数组，把这些对象都放在数组中，数组中的每一个相当于一个商品对象，这里是MyPay的对象

        //数量都是1,不做数组处理
        //实例化所有的商品，对数组进行遍历
        //第一层遍历五个MyPay对象，后遍历names,遍历prices，遍历peisons.但是names,prices,peisons都是一层的关系
        //第一层循环是五个对象，每个对象赋值一次，把各个数组中的元素取出赋值即可
        for(int i=0;i<5;i++){
            mypays[i]=new Pay();
            mypays[i].setName(names[i]);
            mypays[i].setPrice(prices[i]);
            mypays[i].setPeison(peisongs[i]);
            mypays[i].setNum(1);
            print_goods(i+1,mypays[i].getName(),mypays[i].getPrice());
        }

        System.out.println("*********************");
        //上面代码允许用户看首页,看完首页进入订单页，必有用户名
        Scanner scanner = new Scanner(System.in);
        //必须敲回车,或者用户敲任意字符不接收,这里不接收没有登录用户
        scanner.nextLine();
        //需要用户登录，才能选择商品，记住细节，之前执行过init，就执行过new Pay，之前的内容不允许输入用户名
        System.out.println("请进行用户登录");
        //执行mypays数组中的0元素进行用户登陆
        mypays[0].myinput();
        //mypays数组中第2到第5个元素所有username和money都等于第一个元素,从第二个元素开始赋值,这里j=1
        for(int j=1;j<5;j++){
            mypays[j].setUsername(mypays[0].getUsername());
            mypays[j].setMoney(mypays[0].getMoney());
        }
        //这里只接收商品编号，使用nextInt会报错，直接用try -----catch
        System.out.println("请输入购买商品的编号:");
        try{
            int no=scanner.nextInt();
            //当选择对应的商品后，进行商品模块，商品模块中显示商品详情，立即购买，加入购物车两个按钮
            //调用商品模块中的显示。
            //首页中调用商品1的显示方法,这里想引用数组脚标用i-1
            mypays[no-1].show();

        }catch(Exception e){
            System.out.println("谢谢使用，你输入错误，请输入商品对应的编号");
        }

    }
    //用函数解决代码中重复代码问题，参数不一致，在循环中用多个数组来解决，这里用函数传参的方式
    //后期改变打印样式，只需要改变函数即可
    public static void print_goods(int i,String name,double price){
        System.out.println( i+"-"+name+"\t"+price);
    }

}
