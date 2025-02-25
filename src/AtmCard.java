public class AtmCard{
  public final double ATM_CHARGE = 2.50;
  
  private int atmPIN;
  private String accountHolder;

  public AtmCard(){}

  public AtmCard(String holder, int atmPIN){
    this.atmPIN = atmPIN;
    accountHolder = holder;
  }

  public int getAtmPin(){
    return atmPIN;
  }

  public void setAtmPin(int pin){
    atmPIN = pin;
  }
  public void setAccountHolder(String holder){
    accountHolder = holder;
  }
  public String getAccountHolder(){
    return accountHolder;
  }
}
