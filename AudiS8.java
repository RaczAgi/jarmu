public class AudiS8 extends Jarmu{
    private boolean lezerblokkolo;
    public AudiS8(int aktualisSebesseg, String rendszam, boolean lezerblokkolo) {
        super(aktualisSebesseg, rendszam);
        this.lezerblokkolo = lezerblokkolo;
    }


    @Override
    public boolean gyorshajtottE(int sebessegKorlat) {

        return(getAktualisSebesseg() > sebessegKorlat);

    }

    public boolean isLezerblokkolo() {
        return lezerblokkolo;
    }

    public void setLezerblokkolo(boolean lezerblokkolo) {
        this.lezerblokkolo = lezerblokkolo;
    }

    @Override
    public String toString() {
        return "AudiS8{" +
                super.toString() +
                '}';
    }
}
