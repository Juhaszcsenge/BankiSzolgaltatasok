package hu.petrik.bankiszolgaltatasok;

public  class Szamla  extends BankiSzolgaltatas {

    protected int AktualisEgyenleg;
    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg() {
        return AktualisEgyenleg;
    }

  public void befizet(int osszeg){
        AktualisEgyenleg += osszeg;
  }

  public boolean kivesz(int osszeg){
        return  true;

  }


}

