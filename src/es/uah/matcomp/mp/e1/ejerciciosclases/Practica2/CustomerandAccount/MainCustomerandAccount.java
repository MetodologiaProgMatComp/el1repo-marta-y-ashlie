package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.CustomerandAccount;

public class MainCustomerandAccount {
    public static void main(String[] args) {
        //Test Customer Class
        CustomerB a1 = new CustomerB(321,"Clara", 'f');
        System.out.println(a1);

        System.out.println("Costumer Id = "+ a1.getId());
        System.out.println("Costumer Name = "+ a1.getName());
        System.out.println("Costumer Gender = "+ a1.getGender());
        System.out.println("Costumer = "+ a1.toString());

        //Test Account Class

        Account account1 = new Account(2345,a1,100.50);
        Account account2 = new Account (4321,a1);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println("id = "+ account1.getId());
        System.out.println("Customer = "+account1.getCustomer());
        System.out.println( "Balance = "+account1.getBalance());
        System.out.println("Name of the customer = "+account1.getCustomerName());
        System.out.println("Se realiza un deposito de 245.5 euros:"+ account1.deposit(245.5));
        account1.withdraw(400);


    }




}
