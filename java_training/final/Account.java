    public class Account {
        private int id = 0;
        private double balance = 0.0;
        private double annualInterestRate = 0.0;
        private String dateCreated;

        Account() {
        }
        Account(int id, double balance, double annualInterestRate, String dateCreated) {
            this.id = id;
            this.balance = balance;
            this.annualInterestRate = annualInterestRate;
            this.dateCreated = dateCreated;
        }

        double getAnnualInterestRate() {
            return annualInterestRate;
        }

        double getMonthlyInterest () {
            double monthlyInterest = balance * (annualInterestRate/1200);
            return monthlyInterest;
        }

        double withdraw (double withdrawAmount) {
            balance = balance - withdrawAmount;
            return balance;
        }

        double deposit (double depositAmount) {
            balance = balance + depositAmount;
            return balance;
        }

        double getBalance() {
            return balance;
        }

        String dateCreated () {
            return dateCreated;
        }
    public static void main(String[] args) {
        Account a1 = new Account(1122, 20000, 4.5, "05.02.2019");

        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println("Balance: " + a1.getBalance() + "\nMonthly Interest: " + a1.getMonthlyInterest() + 
        "\nAccount creation date: " + a1.dateCreated());
    }
}