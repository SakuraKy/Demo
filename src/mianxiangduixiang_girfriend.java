public class mianxiangduixiang_girfriend {
    public static void main(String[] args) {
        mianxiangduixiangDemo_girfriend gf1 = new mianxiangduixiangDemo_girfriend();
        //赋值
        gf1.setName("李璐");
        gf1.setAge(18);
        gf1.setGender("女");

        //打印
        String name = gf1.getName();
        int age = gf1.getAge();
        String gender = gf1.getGender();
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);

        gf1.eat();
        gf1.sleep();


    }
}
