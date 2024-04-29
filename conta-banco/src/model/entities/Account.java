package model.entities;

public class Account {
    private String holder;
    private int accountNumber;
    private String agency;
    private double balance;
    
    public Account(String holder, int accountNumber, String agency) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        this.agency = agency;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String toString() {
        StringBuilder be = new StringBuilder();
        be.append("Olá " + getHolder() + ", obrigado por criar uma conta em nosso banco, abaixo está algumas informações importantes sobre a sua conta:\n");
        be.append("\n- Agência: " + getAgency() + "\n");
        be.append("- Conta: " + getAccountNumber() + "\n");
        be.append("- Saldo: " + String.format("R$ %.2f\n", getBalance()));
        return be.toString();
    }

}
