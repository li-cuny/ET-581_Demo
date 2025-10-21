interface Drawable{
    void draw();
    default void msg(){System.out.println("default method");}  
    static int cube(int x){return x*x*x;}  
}
