package InterfaceDemo;

public class SbiBank implements Bank{

    @Override
    public void withdraw(int accountno, String name) {
        System.out.println(name + " withdraw from " + accountno + " | Account Type " + SbiBank.atype );
    }

    @Override
    public void deposit(int accountno, String name) {
        System.out.println(name + " deposit into " + accountno + "| Account Type ß" + SbiBank.atype );
    }

    public static void main(String[] args) {
        Bank bank = new SbiBank();
        System.out.println(SbiBank.atype);
        // variable in interface is static that is why we are able to fetch it with child class
        System.out.println(Bank.atype);
        // variable in interface is static that is why we are able to fetch it with Interface
        System.out.println(bank.atype);
        // variable in interface is static that is why we are able to fetch it object_ref

        bank.deposit( 10001,"Vipin Kumar" );
        bank.withdraw( 10002,"Varun Kumar" );
    }

}
