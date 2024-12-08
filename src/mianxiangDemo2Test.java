import java.util.Scanner;

public class mianxiangDemo2Test {
    public static void main(String[] args) {
        //1.创建一个数组用来存三个汽车对象
        mianxiangDemo2[] arr = new mianxiangDemo2[3];

        //2.创建汽车对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            mianxiangDemo2 car = new mianxiangDemo2();
            //录入品牌
            System.out.println("请输入汽车品牌：");
            String brand = sc.next();
            car.setBrand(brand);
            //录入价格
            System.out.println("请输入汽车价格：");
            int price = sc.nextInt();
            car.setPrice(price);
            //录入汽车颜色
            System.out.println("请输入汽车的颜色：");
            String color = sc.next();
            car.setColor(color);

            //把汽车对象放入数组中
            arr[i] = car;
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            mianxiangDemo2 mianxiangDemo2 = arr[i];
            System.out.println(mianxiangDemo2.getBrand() + "，" + mianxiangDemo2.getPrice() + "，" + mianxiangDemo2.getColor());
        }
    }
}
