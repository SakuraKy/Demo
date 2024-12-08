public class Outer {
    private int x = 10;

    class Inner {
    private int x = 20;

    public void show() {
        int x = 30;
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(Outer.this.x);
    }
        
    }
}
