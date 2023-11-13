import java.util.Scanner;

/*
电脑类
 */
public class Computer extends Joiner{
    //电脑出拳
    @Override
    public void choice() {
        //电脑随机1,2,3
        this.setChoiceName((int)(Math.random()*3+1));
    }

    //选择电脑玩家
    @Override
    public void nameSetting() {
        super.nameSetting();
        String[] computer_names={"钟离","烟绯"};
        System.out.println("----------------");
        System.out.println("1----钟离");
        System.out.println("2----烟绯");
        System.out.println("----------------");
        System.out.println("请选择对阵的角色编号");
        Scanner scanner = new Scanner(System.in);
        try{
            int tmp=scanner.nextInt();
            this.setName(computer_names[tmp-1]);
        }catch(Exception e ){
        }
    }
}
