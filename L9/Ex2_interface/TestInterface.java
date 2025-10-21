class TestInterface{
    public static void main(String args[]){
        Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()
        d.draw();
        d = new Rectangle();
        d.draw();
    }
}