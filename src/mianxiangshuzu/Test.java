package mianxiangshuzu;

public class Test {
    public static void main(String[] args) {


    /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
    学生的属性:学号，姓名，年
    要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
    要求2:添加完毕之后，遍历所有学生信息。
    要求3:通过id删除学生信息
    如果存在，则删除，如果不存在，则提示删除失败。
    要求4:删除完毕之后，遍历所有学生信息。
    要求5:查询数组id为2的学生，如果存在，则将他的年龄+1岁*/

       /* //1.创建数组储存学生对象
        Student[] arr = new Student[3];
        //2.创建学生对象，并添加数组中
        Student stu1 = new Student(1,"zhangsan",23);
        Student stu2 = new Student(2,"lisi",24);
        Student stu3 = new Student(3,"wangwu",25);
        //3.把对象添加到数组
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;


        //要求1：再次添加一个学生对象，并添加的时候进行学号的唯一性判断
        //读题拆解法
        Student stu4 = new Student(4,"zhaoliu",26);

        //唯一性判断
        //存在---不用添加
        //不存在---把学生对象添加进数组
        boolean flag = contains(arr,stu4.getId());
        if (flag){
            //存在
            System.out.println("当前id重复，请修改id后，再进行添加");
        }else {
            //不存在--添加学生对象进数组
            //1.数组已经存满---创建一个新的数组，新数组长度 = 老数组长度+1
            //2.数组没存满---直接添加
            int count = getCount(arr);


            //把stu4添加到数组当中
            //两种结果：
            // 1.数组已经存满。---只能创建新的数组，新数组的长度= 老数组长度+1
            //2.数组没有存满---直接添加
            if (count == arr.length){
                //已经存满
                //创建一个新的数组
                Student[] newArr = creatNewArr(arr);
                //新数组：[stu1,stu2,stu3,null]
                newArr[count] = stu4;
                //要求2:遍历所有学生信息
                printArr(newArr);



            }else {
                //没有存满
                //[stu1,stu2,null]
                //getcuont获取到的是2，表示数组当中已经又2个元素了
                //另一层意思：如果下次要添加数据，就是添加到2索引的位置
                arr[count] = stu4;
                //要求2:遍历所有学生信息
                printArr(arr);

            }

        }
        //要求3:通过id删除学生信息
        //如果存在，则删除，如果不存在，则提示删除失败。
        int index = getIndex(arr,7);

        //找到id在数组中所对应的索引
        //要求4:删除完毕之后，遍历所有学生信息。
        if (index >= 0){
            //存在
            arr[index] = null;
            //遍历数组
            printArr(arr);
        }else {
            //不存在
            System.out.println("当前id不存在，删除失败。");
        }

        //要求5:查询数组id为2的学生，如果存在，则将他的年龄+1岁
        //先找到id为2的学生多对应的索引
        int index2 = getIndex(arr,1);

        //判断索引
        if (index2 >= 0){
            //存在,年龄+1
            Student stud = arr[index2];
            //把原来的年龄拿出来
            int newage = stud.getAge() + 1;
            //把新年龄塞回去
            stud.setAge(newage);
            //遍历数组
            printArr(arr);

        }else {
            //不存在
            System.out.println("当前id不存在，修改失败");
        }





    }
    //打印数组
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null){
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }


    //创建新数组
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];

        //循环遍历，得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }



    //定义一个方法判断数组中存有几个元素
    public static int getCount(Student[] arr){
        //定义一个计数器，用来统计
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                count++;
            }
        }
        return count;
    }

    //唯一性判断
    //1.我要干嘛---唯一性判断
    //2.需要什么---数组、id
    //3.调用处是否需要继续使用方法的结果---必须返回
    public static boolean contains(Student[] arr,int id){

        for (int i = 0; i < arr.length; i++) {
            //依次获取学生对象
            Student stu = arr[i];
            //获取数组中学生对象的id
            int sid = stu.getId();
            //比较
            if (sid == id){
                return true;
            }

        }
        return false;
    }

    //1.我要干什么? 找到id在数组中所对应的索引
    //2.我需要什么？ 数组、id
    //3.调用处是否需要继续使用方法的结果？ 要


    //找到id在数组中的索引
    public static int getIndex(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            //依次得到每一个学生对象
            Student stu = arr[i];
            //对stu进行非空判断
            if (stu != null){
                int sid = stu.getId();
                if (sid == id){
                    return i;
                }
            }
        }
        //当循环结束之后，还没有找到就表示不存在
        return -1;

        */
    }
}
