import java.util.Scanner;
/*
剪刀石头布游戏
采用java规范，面向对象
功能比较少，所以写到一个类里
 */
public class MyGame {
    public static void main(String[] args) {
        System.out.println("游戏：石头剪刀布");
        Scanner scanner = new Scanner(System.in);
        //四个变量分别是用户名 电脑名字 用户选择 电脑选择
        //通过对应的方法获取变量
        String player_name = getPlayerName();
        String computer_name = getComputerName();
        int player_choice = getPlayerChoice();
        int computer_choice = getComputerChoice();
        //得到玩家出的结果
        String player_choice_name = getChoiceName(player_choice);
        //得到电脑出的结果
        String computer_choice_name = getChoiceName(computer_choice);
        //输出电脑和玩家的选择：
        printChoices(player_name, player_choice_name, computer_name, computer_choice_name);
        //输出结果，确定获胜者
        determineWinner(player_name, player_choice, computer_name, computer_choice);
    }
    //用户输入姓名
    private static String getPlayerName() {
        System.out.println("输入你的名称：");
        Scanner scanner = new Scanner(System.in);
        String player_name = scanner.nextLine();
        if (player_name.trim().isEmpty()) {
            System.out.println("匿名玩家");
        }
        return player_name;
    }
    //选择对战玩家
    private static String getComputerName() {
        System.out.println("选择对战的电脑玩家：");
        System.out.println("1----张飞");
        System.out.println("2----关羽");
        Scanner scanner = new Scanner(System.in);
        String computer_no = scanner.next();
        switch (computer_no) {
            case "1":
                return "张飞";
            case "2":
                return "关羽";
            default:
                return "匿名用户";
        }
    }
    //玩家选择出拳
    private static int getPlayerChoice() {
        System.out.println("请玩家选择出拳数字；");
        System.out.println("1----剪刀，2----石头，3----布");
        Scanner scanner = new Scanner(System.in);
        String tmp_choice = scanner.next();
        switch (tmp_choice) {
            case "1":
            case "2":
            case "3":
                return Integer.parseInt(tmp_choice);
            default:
                return (int)Math.round(Math.random() * 2 + 1);
        }
    }
    //返回电脑随机的数字
    private static int getComputerChoice() {
        return (int)Math.round(Math.random() * 2 + 1);
    }
    //根据选择数字，返回出拳结果
    private static String getChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "剪刀";
            case 2:
                return "石头";
            default:
                return "布";
        }
    }
    //输出双方选择结果
    private static void printChoices(String player_name, String player_choice_name, String computer_name, String computer_choice_name) {
        System.out.println(player_name + "出了" + player_choice_name);
        System.out.println(computer_name + "出了" + computer_choice_name);
    }
    //比较数字，输出获胜者
    private static void determineWinner(String player_name, int player_choice, String computer_name, int computer_choice) {
        if (player_choice - computer_choice == 1 || player_choice - computer_choice == -2) {
            System.out.println(player_name + "赢了");
        } else if (computer_choice - player_choice == 1 || computer_choice - player_choice == -2) {
            System.out.println(computer_name + "赢了");
        } else {
            System.out.println("平局");
        }
    }
}
