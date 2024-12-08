public class fangfa3_2 {
    public static void main(String[] args) {
        //需求：定义方法，比较两个长方形的面积



        //调用方法获取长方形的面积，再比较
        double area1 = getArea(5.3,1.7);
        double area2 = getArea(2.4,2.7);

        if (area1 > area2){
            System.out.println("第一个长方形的面积更大");
        }else if (area1 < area2){
            System.out.println("第二个长方形的面积更大");
        }else {
            System.out.println("两个长方形的面积一样大");
        }
    }
    //1.干什么？求长方形面积
    //2.需要什么？长和宽
    public static double getArea(double len,double width){
        double area = len * width;
        return area;
    }
}
