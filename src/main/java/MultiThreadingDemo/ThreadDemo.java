package MultiThreadingDemo;

// program - set of instruction stored in secondary storage and inteded to carry out a task
// process - An executing instance of a program is called process
// Thread  - a thread is called as light weight process, it is similar to the real
// process but executes within the context of a process ans shares the same resources
// alloted to the process of the kernel

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inside main");
        System.out.println(Thread.currentThread().getPriority());
        Thread t = new Thread();
        System.out.println("ID: "+ t.getId());
        System.out.println("Name: "+ t.getName());
        System.out.println("Priority: "+t.getPriority());
        System.out.println("State: "+t.getState());
        System.out.println("Alive: "+t.isAlive());
        System.out.println("ThreadGroup: "+t.getThreadGroup());
        System.out.println("ClassLoader: "+t.getContextClassLoader());

        System.out.println("======================================================");
        Thread.sleep( 3000 );
        t.setPriority( 9 );
        t.setName( "ThreadTest");
        System.out.println("ID: "+ t.getId());
        System.out.println("Name: "+ t.getName());
        System.out.println("Priority: "+t.getPriority());
        System.out.println("State: "+t.getState());
        System.out.println("Alive: "+t.isAlive());
        System.out.println("ThreadGroup: "+t.getThreadGroup());
        System.out.println("ClassLoader: "+t.getContextClassLoader());
    }
}
