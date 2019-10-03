package MultiThreadingDemo;

class Table {

//    public synchronized void printTable(int n){
    // without synchornized this method is not thread safe
    public void printTable(int n){
    for(int i = 1; i<= 10; i++) {
            int p = i*n;
            try {
                System.out.println(n +" X " + i + " = " +p);
                Thread.sleep( 500 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("===========================");
        try {
            Thread.sleep( 5000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Table1 extends Thread{
    Table t;
    Table1(Table table){
        this.t = table;
    }
    @Override
    public void run() {
        t.printTable( 5 );

    }
}

class Table2 extends Thread{
    Table t;
    Table2(Table table){
        this.t = table;
    }
    @Override
    public void run() {
        t.printTable( 6 );

    }
}

public class SynchronizedDemo{
    public static void main(String[] args) {
        Table table = new Table();
        Table1 t1 = new Table1( table );
        Table2 t2 = new Table2( table );
        t1.run();
        t2.run();
    }
}