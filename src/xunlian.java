import java.util.Random;

public class xunlian {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0;i < chs.length;i++){
            if (i <= 25){
                chs[i] = (char) (97 + i);
            }else {
                chs[i] = (char) (65 + i - 26);
            }
        }

        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int a = r.nextInt(chs.length);
            result = result + chs[a];
        }
        int number = r.nextInt(10);
        result = result + number;
        System.out.println(result);
    }
}
//1.建立数组
//2.把小写字母和大写字母导入数组中
//3.建立一个变量，用来储存随即出来的字母和数字
//4.导入随机数包，利用包随机出来大小写字母存入变量中
//5.利用包随机出来数字，随后存入变量