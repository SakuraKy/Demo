public class tiaozhuanxunhuanDemo1 {
    public static void main(String[] args) {
        //1-100只要是含7或者是7的倍数，就要显示“过”
        for (int i = 1; i <= 100; i++) {
            if(i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
