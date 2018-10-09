import javax.swing.*;

public class BankAccountDriver {

    public static void main(String[] args) {

        BankAccount BA1 = new BankAccount();
        BankAccount BA2 = new BankAccount();

        JOptionPane.showMessageDialog(null,BA1.toString());

        BA2.lodgeMoney();
        System.out.println(BA2.getBalance());

        double amount =Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the amount you wish to withdraw:" ));




        BA2.withdrawMoney(amount);
        System.out.println(BA2.getBalance());

        JOptionPane.showMessageDialog(null,BA2.toString());




    }
}
