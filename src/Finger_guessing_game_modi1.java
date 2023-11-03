import java.util.Scanner;
//将if改为switch
public class Finger_guessing_game_modi1 {
    public static void main(String[] args) {
        //猜拳游戏
        //以下变量分别为 玩家名 电脑名 玩家选择 电脑选择
        String player_name;
        String computer_name;
        int player_choice;
        int computer_choice;
        //玩家出拳名字 电脑出拳名字
        String player_choice_name;
        String computer_choice_name;
        System.out.println("游戏：石头剪刀布");
        System.out.println("输入你的名称：");
        //获取输入设备
        Scanner scanner=new Scanner(System.in);
        //输入玩家名字
        player_name=scanner.nextLine();
        //判断用户输入的是否全是空格，trim()去掉首尾的空格
        if(player_name.trim().equals("")){
            System.out.println("匿名玩家");
        }
        //选择电脑玩家
        System.out.println("选择对战的电脑玩家：");
        System.out.println("1----张飞");
        System.out.println("2----关羽");
        //玩家选择用户
        String computer_no=scanner.next();
        /*
        if(computer_no.equals("1")){
            computer_name="张飞";
        }else if(computer_no.equals("2")){
            computer_name="关羽";
        }else{
            computer_name="匿名用户";
        }

         */
        switch (computer_no){
            case "1":
                computer_name="张飞";
                break;
            case "2":
                computer_name="关羽";
                break;
            default:
                computer_name="匿名用户";
        }
        //玩家出拳
        System.out.println("请玩家选择出拳数字；");
        System.out.println("1----剪刀，2----石头，3----布");
        String tmp_choice=scanner.next();
        /*
        if(tmp_choice.equals("1")||tmp_choice.equals("2")||tmp_choice.equals("3")){
            //不同类型转换
            player_choice= Integer.parseInt(tmp_choice);
        }else{
            //用户选择在123之外，随机给一个
            player_choice=(int) Math.round(Math.random()*2+1);
        }

         */
        switch(tmp_choice){
            case "1":
                player_choice=Integer.parseInt(tmp_choice);
                break;
            case "2":
                player_choice=Integer.parseInt(tmp_choice);
                break;
            case "3":
                player_choice=Integer.parseInt(tmp_choice);
                break;
            default:
                player_choice=(int)Math.round(Math.random()*2+1);

        }
        //根据player_choice决定player_choice_name;
        /*
        if(player_choice==1){
            player_choice_name="剪刀";
        }else if(player_choice==2){
            player_choice_name="石头";
        }else{
            player_choice_name="布";
        }
         */
        switch (player_choice){
            case 1:
                player_choice_name="剪刀";
                break;
            case 2:
                player_choice_name="石头";
                break;
            default:
                player_choice_name="布";
        }
        //电脑出拳
        computer_choice= (int) Math.round(Math.random()*2+1);
        /*
        if(computer_choice==1){
            computer_choice_name="剪刀";
        }else if(computer_choice==2){
            computer_choice_name="石头";
        }else{
            computer_choice_name="布";
        }

         */
        switch (computer_choice){
            case 1:
                computer_choice_name="剪刀";
                break;
            case 2:
                computer_choice_name="石头";
                break;
            default:
                computer_choice_name="布";

        }
        //输出双方出拳
        System.out.println(player_name+"出了"+player_choice_name);
        System.out.println(computer_name+"出了"+computer_choice_name);
        //判断输赢
        if (player_choice-computer_choice==1||player_choice-computer_choice==-2){
            System.out.println(player_name+"赢了");
        }else if(computer_choice-player_choice==1||computer_choice-player_choice==-2){
            System.out.println(computer_name+"赢了");
        }else{
            System.out.println("平局");
        }
    }
}
