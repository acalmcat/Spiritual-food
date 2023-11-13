import java.util.Scanner;

/*
玩家类
 */
public class Player extends Joiner{
    //用户选择出拳
    @Override
    public void choice() {
        System.out.println("----------------");
        System.out.println("1-----剪刀");
        System.out.println("2-----石头");
        System.out.println("3-----布");
        System.out.println("----------------");
        System.out.println("请选择出拳名称代表数字:");
        Scanner scanner = new Scanner(System.in);
        try{
            int tmp=scanner.nextInt();
            this.setChoiceName(tmp);
        }catch(Exception e){
            //如果用户输入错误，随机选一个，并给用户提示
            this.setChoiceName((int)(Math.random()*3+1));
            System.out.println("你的输入有问题，将随机生成");
        }
    }

    //用户输入名称
    @Override
    public void nameSetting() {
        System.out.println("请输入玩家名称:");
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        if (!line.trim().equals("")) {
            this.setName(line);
        }else{
            //父类中提取的公共代码
            super.nameSetting();
        }

    }
}
