/*
java规范修改的Order类
 */
public class Order extends Goods{
    //只有私有成员变量total
    private double total;
    //产生无参构造,方便实例化,因为父类有无参,这里默认是有无参构造
    //正常逻辑的方法
    //重写需要在方法上面加上@Override表示这个方法,父类也有,子类重写
    @Override
    protected final void make_order(){
        //产生定单号，定单号规定8位的整数
        long order_id=(int)(Math.random()*10000000+10000000);
        // double计算时，注意乘法是不准，改成私有化后，不能直接.num,.private,这里需要用get方法取值
        //下面的this.num。调用this.getNum,this.price改成this.getPrice
        this.total=this.getNum()*this.getPrice();
        //格式化，保留小数位数
        this.total=Double.parseDouble(String.format("%.2f",this.total));
        //离开了订单页面，到支付界面,调用支付,实例化,
        //这里的pay_order()方法由Pay支付类进行重写。
        this.pay_order();
    }
    //此方法需要Pay类重写，不需要访问，改成protected
    protected void pay_order(){
        //这个方法没有实现
    }
    //是否需要产生有参,有参只有一个total的构造函数,这里的total是计算出来的,不是用户赋值改变的,不需要做有参构造
    //total一定是这个Order类自动计算,不需要外界用户参与,把这个值改变,这里的total只有getter方法
    public double getTotal() {
        return total;
    }
}
