package study.day4;

import java.util.Arrays;

public class Example4 {

    public static void main(String[] args){
        String state;
        ChickenMaster master = new ChickenMaster();
        master.Add(new Chicken(1, "小鸡1", "黑色"));
        master.Add(new Chicken(2, "小鸡2", "白色"));
        master.Add(new Chicken(3, "小鸡3", "黄色"));
        master.Show();
        state = master.Find(2);
        System.out.println(state);
        state = master.Delete(2);
        System.out.println(state);
        master.Show();
        state = master.Update(new Chicken(1,"小鸡4", "灰色"));
        System.out.println(state);
        master.Show();
    }


}

/**
 * 小鸡类
 */
class Chicken{
    private int id;
    private String name;
    private String color;

    public Chicken(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public Chicken() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

/**
 * 管理小鸡类
 */
class ChickenMaster{
    public Chicken[] chickens = new Chicken[5];
    private static int count=0;

    public void Add(Chicken c){//添加小鸡
        if(count == chickens.length){
            chickens = Arrays.copyOf(chickens , (chickens.length + count / 2 + 1));
            if(chickens.length == count)
                System.out.println("添加失败！");
        }
        chickens[count++] = c;
        System.out.println("添加成功！");
    }

    public String Delete(int id){
        int mark = 0;
        for (int i = 0; i < count; i++) {
            if(chickens[i].getId() == id){
                mark = 1;
                for (int j = i + 1; j < count; j++) {
                    chickens[j - 1] = chickens[j];
                }
            }
        }
        if(mark == 1){
            chickens[--count] = null;
            return "删除成功！";
        } else
            return "删除失败！";
    }

    /**
     * 查询小鸡
     */
    public String Find(int id){
        int mark = 0;
        for (Chicken c:chickens) {
            if (c != null && c.getId() == id){
                mark = 1;
                System.out.println(c.toString());
            }
        }
        if (mark == 1)
            return "查找到了";
        else
            return "没有查找到";
    }

    /**
     * 更新小鸡的信息
     */
    public String Update(Chicken c){
        int mark = 0;
        for (Chicken cc:chickens) {
            if (cc != null && cc.getId() == c.getId()){
                mark = 1;
                cc.setColor(c.getColor());
                cc.setName(c.getName());
            }
        }
        if (mark == 1)
            return "更新成功！";
        else
            return "更新失败！";
    }

    /**
     * 显示所有小鸡
     */
    public void Show(){
        for (Chicken c:chickens) {
            if (c != null)
                System.out.println(c.toString());
        }
    }

}
