package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasSzamla  extends  Szamla{

    private double Kamat;
    private double alapKamat;

    public MegtakaritasSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public double getKamat() {
        return Kamat;
    }

    public void setKamat(double kamat) {
        Kamat = kamat;
    }

    public boolean kivesz(int osszeg){

    }

    public void kamatJovariras(){

    }
}
