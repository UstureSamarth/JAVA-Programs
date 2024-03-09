public class A9 {
    public static void main(String[] args) {
        Circle1 c=new Circle1();
        c.setRadius(7);
        System.out.println("Circle with radius "+c.getRadius()+" Area="+c.getArea()+" Circumference="+c.getCircumference());
        MarkSheet m=new MarkSheet();
        m.setMarkPhysics(100);
        m.setMarkChemistry(97);
        m.setMarkMathematics(38);
        m.setMarkEnglish(35);
        m.setMarkHindi(89);
        System.out.println("Maximum marks:"+m.maxMarks());
        System.out.println("Average of marks:"+m.averageOfMarks());
        if(m.result(35))
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
class Circle1{
    Integer radius;
    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }
    Float getArea(){
        return 3.14f*radius*radius;
    }
    Float getCircumference(){
        return 2*3.14f*radius;
    }
}
class MarkSheet{
    Integer markPhysics,markChemistry,markMathematics,markEnglish,markHindi;

    public Integer getMarkPhysics() {
        return markPhysics;
    }

    public void setMarkPhysics(Integer markPhysics) {
        this.markPhysics = markPhysics;
    }

    public Integer getMarkChemistry() {
        return markChemistry;
    }

    public void setMarkChemistry(Integer markChemistry) {
        this.markChemistry = markChemistry;
    }

    public Integer getMarkMathematics() {
        return markMathematics;
    }

    public void setMarkMathematics(Integer markMathematics) {
        this.markMathematics = markMathematics;
    }

    public Integer getMarkEnglish() {
        return markEnglish;
    }

    public void setMarkEnglish(Integer markEnglish) {
        this.markEnglish = markEnglish;
    }

    public Integer getMarkHindi() {
        return markHindi;
    }

    public void setMarkHindi(Integer markHindi) {
        this.markHindi = markHindi;
    }
    Integer maxMarks(){
        Integer max=markPhysics;
        if(markChemistry>max)
            max=markChemistry;
        if(markMathematics>max)
            max=markMathematics;
        if(markEnglish>max)
            max=markEnglish;
        if(markHindi>max)
            max=markHindi;
        return max;
    }
    Float averageOfMarks(){
        return (markPhysics+markChemistry+markMathematics+markEnglish+markHindi)/5.0f;
    }
    Boolean result(Integer passingMarks){
        Boolean max=true;
        if(markChemistry<passingMarks)
            max=false;
        else if(markMathematics<passingMarks)
            max=false;
        else if(markEnglish<passingMarks)
            max=false;
        else if(markHindi<passingMarks)
            max=false;
        return max;
    }
}
