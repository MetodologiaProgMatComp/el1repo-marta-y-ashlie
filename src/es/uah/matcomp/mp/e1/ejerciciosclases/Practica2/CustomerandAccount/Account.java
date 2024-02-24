package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.CustomerandAccount;
import java.text.DecimalFormat;
public class Account {
    int id;
    CustomerB customerB;
    double balance = 0.0;

    public Account(int id, CustomerB customerB, double balance) {
        this.id = id;
        this.customerB = customerB;
        this.balance = balance;
    }

    public Account(int id, CustomerB customerB) {
        this.id = id;
        this.customerB = customerB;
    }

    public int getId() {
        return id;
    }

    public CustomerB getCustomer() {
        return customerB;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static final DecimalFormat df = new DecimalFormat ("0.00");
    public String toString(){
        return customerB.toString() + "balance = " + df.format(balance);
    }
    public String getCustomerName(){
        return customerB.getName();
    }
    public Account deposit(double amount){
        double nuevoAmount = balance + amount;
        this.setBalance(nuevoAmount);
        return this;
    }

    public Account withdraw(double amount){
        if (balance >= amount){
            double nuevoBalance;
            nuevoBalance=balance-amount;
            this.setBalance(nuevoBalance);
        }else{
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;

    }

}
