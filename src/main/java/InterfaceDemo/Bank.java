package InterfaceDemo;

public interface Bank {
    int initial_amount = 1000;
    String atype = "Saving";

    void withdraw(int accountno, String name);
    void deposit (int accountno, String name);
}
