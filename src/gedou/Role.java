package gedou;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    //空参
    public Role() {

    }

    //有参
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于攻击别人
    /*思考：
    谁攻击谁？
    Role r1 = new Role();
    Role r2 = new Role();
    r1.攻击(r2);
    方法的调用者攻击参数
     */
    public void attack(Role role){
        //计算造成的伤害1~20
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        //剩余血量
        int remainBoold = role.getBlood() - hurt;

        //判断血量,如果为负数，就修改为0
        remainBoold = remainBoold < 0 ? 0 : remainBoold;

        //修改血量
        role.setBlood(remainBoold);
        //this：方法调用者
        System.out.println(this.getName() + "举起拳头，打了"+ role.getName()+
                "造成了"+ hurt +"伤害"+role.getName()+"还剩"+remainBoold+"血");
    }
}
