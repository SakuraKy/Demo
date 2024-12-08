public class mianxiangduixiang_user {
    //属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;


    //空参
    public mianxiangduixiang_user(){}
    //带有参数的
    public mianxiangduixiang_user(String username,String password,String email,String gender,int age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    //get,set方法;快捷键：alt + insert
    //插件：PTG，1s生成标准JavaBean
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }


    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }


    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
