/*
裁判类
 */
public class Judge {
    //判断输赢
    public void judgeWinner(Player player,Computer computer){
        //可以用减差来判断胜负
        int subPlayer=player.getChoiceName()-computer.getChoiceName();
        //subPlayer的值可能是 -2 -1 0 1 2
        //当值为   0   平局
        //当值为   1   玩家赢
        //当值为   2   玩家输
        //当值为   -1  电脑赢
        //当值为   -2  电脑输
        //所以建立一个数组采用以下方法输出结果
        String[] arrs= {"平局","赢","输"};
        try{
            System.out.println("玩家"+arrs[subPlayer]);
        }catch(Exception e){
            //电脑应用Math.abs绝对值函数，
            System.out.println("电脑"+arrs[Math.abs(subPlayer)]);
        }
        System.out.println("双方出牌情况");
        String[] playerChoices={"剪刀","石头","布"};
        System.out.println("玩家出拳:"+playerChoices[player.getChoiceName()-1]);
        System.out.println("电脑出拳："+playerChoices[computer.getChoiceName()-1]);

    }
}
