public class Threading {
    public static void main(String[] args) {
        /*test1 a=new test1();
        test2 b=new test2();
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
        test3 c=new test3();
        test4 d=new test4();
        c.start();
        d.start();
        Thread t5=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                    try{Thread.sleep(1000);}catch (InterruptedException e){
                        System.out.println(e.getMessage());}
                    System.out.println("i=" + i + " " + Thread.currentThread().getName());
                }
            }
        },"Meri");
        Thread t6=new Thread(new Runnable() {
            @Override
            public void run() {

                for(int j=0;j<10;j++){
                    try{Thread.sleep(1500);}catch (InterruptedException e){
                        System.out.println(e.getMessage());}
                    System.out.println("j="+j+" "+Thread.currentThread().getName());
                }
            }
        },"Teri");
        t5.start();
        t6.start();
        System.out.println(Thread.currentThread().getName());;*/
        Tree t=new Tree();
        Producer p=new Producer(t);
        Consumer c=new Consumer(t);
        Thread t7=new Thread(p);
        Thread t8=new Thread(c);
        t7.start();
        t8.start();

    }
}
class Tree{
    private int fruitNo;
    private boolean flag=false;
    public synchronized int getFruitNo() {
        while (!flag){try{wait();}catch (Exception e){}}
        flag=false;
        System.out.println("Get Fruit Number : "+fruitNo);
        notify();
        return fruitNo;
    }

    public synchronized void setFruitNo(int fruitNo) {
        while (flag){try{wait();}catch (Exception e){}}
        this.fruitNo = fruitNo;
        flag=true;
        System.out.println("Set Fruit Number : "+getFruitNo());
        notify();
    }
}
class Producer implements Runnable{
    private Tree fruit;
    Producer(Tree f){
        fruit=f;
    }

    @Override
    public void run() {
        int i=1;
        while (true) {
            try{Thread.sleep(1000);}catch (Exception e){}
            fruit.setFruitNo(i++);
        }

    }
}
class Consumer implements Runnable{
    private Tree fruit;
    Consumer(Tree f){
        fruit=f;
    }

    @Override
    public void run() {
        while (true) {
            try{Thread.sleep(1000);}catch (Exception e){}
            fruit.getFruitNo();
        }
    }
}
class test1 implements Runnable{
    void f1(){
        for(int i=0;i<10;i++)
            System.out.println("i="+i);
    }

    @Override
    public void run() {
        f1();
    }
}
class test2 implements Runnable{
    void f2(){
        for(int j=0;j<10;j++)
            System.out.println("j="+j);
    }

    @Override
    public void run() {
        f2();
    }
}
class test3 extends Thread{
    void f1(){
        for(int i=0;i<10;i++)
            System.out.println("i="+i);
    }
    public void run(){
        f1();
    }
}
class test4 extends Thread{
    void f2(){
        for(int j=0;j<10;j++)
            System.out.println("j="+j);
    }
    public void run(){
        f2();
    }
}
