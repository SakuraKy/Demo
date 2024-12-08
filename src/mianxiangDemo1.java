public class mianxiangDemo1 {
    //文字版格斗游戏
    //格斗游戏，每个游戏角色的姓名，血量，都不相同，在选定人物的时候(new对象的时候)，这些信息
    //就应该被确定下来。
    public static void main(String[] args) {
        //创建角色1
        Role r1 = new Role("乔峰",100);
        //创建角色2
        Role r2 = new Role("猪",100);

        //开始格斗（回合制）
        while (true){
            //1攻击2
            r1.attack(r2);
            //判断2的血量
            if (r2.getBlood() == 0){
                System.out.println(r1.getName() + "ko了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName() + "ko了" + r1.getName());
                break;
            }
        }
        }
    }
