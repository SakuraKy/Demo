public class while1_2 {
    public static void main(String[] args) {
        /*需求:
        世界最高山峰是珠穆朗玛峰(88443米=8844430毫米)，假如我
        有一张足够大的纸，它的厚度是0.1毫米。
        请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
         */
        //分析：每次折叠，纸张的厚度都是原来的两倍

        //1.定义山峰的高度
        double height = 8844430;
        //2.定义纸张的厚度
        double paper = 0.1;
        //3.定义次数的变量
        double count = 0;
        //4.循环折叠纸张，每折叠一次，统计次数就要++
        //选择while的理由，此时不知道循环的次数和循环的范围，只知道循环的结束条件。
        while (paper < height){
            paper = paper * 2;
            count++;
        }
        System.out.println(count);
    }
}
