public class Savings extends Account {
    private String clientID;
    public static final double interest = 0.05;

    public Savings(String number, double funds, String clientID){
    super(number, funds);
    this.clientID = clientID;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        clientID = this.getClientID();
    }

    public double calculateInterest() {
        return interest * this.getFunds();
    }

    public boolean equals(Savings second) {
        return this.getFunds() == second.getFunds();
    }

    public String toString() {
        return super.toString();
    }
}
