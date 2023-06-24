public abstract class Jarmu {
    protected int aktualisSebesseg;
    private String rendszam;

    public Jarmu(int aktualisSebesseg, String rendszam) {
        this.aktualisSebesseg = aktualisSebesseg;
        this.rendszam = rendszam;
    }
    public boolean gyorshajtottE(int sebessegKorlat){
        return aktualisSebesseg > sebessegKorlat;
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                rendszam + " - " +
                aktualisSebesseg +
                " km/h" +
                '}';
    }

    public int getAktualisSebesseg() {
        return aktualisSebesseg;
    }
}
