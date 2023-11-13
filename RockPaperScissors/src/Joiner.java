/*
参与者类
 */
public class Joiner {
    private String name;
    private int choiceName;

    public Joiner() {
    }

    public Joiner(String name, int choiceName) {
        this.name = name;
        this.choiceName = choiceName;
    }

    //选择方法，待子类重写
    public void choice(){

    }

    //设置名称的方法，子类重写
    public void nameSetting(){
        this.setName("匿名用户");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChoiceName() {
        return choiceName;
    }

    public void setChoiceName(int choiceName) {
        this.choiceName = choiceName;
    }

    @Override
    public String toString() {
        return "Joiner{" +
                "name='" + name + '\'' +
                ", choice_name=" + choiceName +
                '}';
    }
}
