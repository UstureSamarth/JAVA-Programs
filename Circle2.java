public class Circle2 {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public float getArea(){
        return 3.14f*radius*radius;
    }
    public float getCircumference(){
        return 2*3.14f*radius;
    }

}
