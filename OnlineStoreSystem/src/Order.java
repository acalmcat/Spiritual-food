/*
订单类，订单模块，需要把商品类的所有信息取过来
才能计算订单和找到配送地址
用到java类中继承， extends商品类，找到商品类的各种信息
 */
public class Order extends Goods{
    //定义属性,总价total
    double total;
    //方法，形成订单
    //这个Order类继承Goods类,make_order方法就会继承,只不过Goods类中没有代码
    //Goods类中的make_order需要在本类中实现,直接把这个方法的代码实现就可以,
    //继承之后,把父类中代码实现或重写,这种技术叫重写
    //重写需要在方法上面加上@Override表示这个方法,父类也有,子类重写
    @Override
    protected final void make_order(){
        //在order类中只可以调用小图，调用不了大图big_pic,只能调用small_pic
        //产生定单号，定单号规定8位的整数
        long order_id=(int)(Math.random()*10000000+10000000);
        // double计算时，注意乘法是不准，
        this.total=this.num*this.price;
        //格式化，保留小数位数
        this.total=Double.parseDouble(String.format("%.2f",this.total));
        //离开了订单页面，到支付界面,调用支付,实例化,
        //保证继承链同一个地址,也不需要实例化Pay
//        Pay pay = new Pay();
        //支付的帐户需要实例化赋值,order中的total不需要赋值，是自动算
        //把后面pay改成this,this中没有这个属性username,也没有money属性,这里属性报错,
        //这个属性不属于这个类,这个类属性如果定义在这里,可读性就差,这两个属性放在下一个类中
//        this.username="张三";
//        this.money=100;
        //方法采用父类定义,子类实现
        this.pay_order();
    }
    public void pay_order(){
        //这个方法没有实现
    }
}

