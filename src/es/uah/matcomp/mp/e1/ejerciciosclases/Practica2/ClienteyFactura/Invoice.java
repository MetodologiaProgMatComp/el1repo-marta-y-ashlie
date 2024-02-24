package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.ClienteyFactura;

public class Invoice {
    int id;
    Customer customer;
    double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId(){
        return this.getCustomer().getId();
    }
    public String getCustomerName(){
        return this.getCustomer().getName();
    }
    public int getCustomerDiscount(){
        return this.getCustomer().getDiscount();
    }
    public double getAmountAfterDiscount(){
        return this.getAmount()-((this.getAmount()*this.getCustomerDiscount())/100);
    }
    public String toString(){
        return "Invoice [id= "+ id + ", customer = " + this.getCustomer().toString()+", amount = " + amount +"]";
    }
}
