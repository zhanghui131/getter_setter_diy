public class App {
    public static void main (String[] args) {
    AtmCard atm = new AtmCard();
    AtmCard atm2 = new AtmCard("John Smith", 1234567890);
    System.out.println("Account holder is:" + atm.getAccountHolder());
    System.out.println("ATM Pin is:" + atm.getAtmPin());
    System.out.println("Account holder is:" + atm2.getAccountHolder());
    System.out.println("Account Pin is:" + atm2.getAtmPin());
    System.out.println("Account Pin is:" + atm2.ATM_CHARGE);
    
}
    
}
