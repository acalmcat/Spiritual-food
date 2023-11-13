import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        //所有类实例化
        Player player = new Player();
        Computer computer = new Computer();
        Judge judge = new Judge();
        System.out.println("----------------");
        System.out.println("　游戏：剪刀石头布");
        System.out.println("----------------");
        //输入回车后，游戏开始
        System.out.println("输入回车后，游戏开始");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("游戏开始.......");
        //定义玩家名称
        player.nameSetting();
        //选择电脑参与作战者
        computer.nameSetting();
        //调用player的出拳
        player.choice();
        //调用电脑computer的出拳
        computer.choice();
        //调用对应的裁判类，进行裁决。
        judge.judgeWinner(player,computer);
    }
}
