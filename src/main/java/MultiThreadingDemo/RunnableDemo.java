package MultiThreadingDemo;

class Natural implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<= 10;i++) {
            System.out.println( Thread.currentThread() +"|" +i );
            try {
                Thread.sleep( 500 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Even extends Thread{
    @Override
    public void run() {
        for(int j = 0; j<= 10; ){
            System.out.println(Thread.currentThread() +"|" +j );
            j=j+2;
            try {
                Thread.sleep( 500 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {


        Even even = new Even();
        even.setName( "Even" );
        even.start();

        Natural natural = new Natural();
        Thread t = new Thread(natural);
        t.setName( "Nat" );
        t.start();

    }
}
