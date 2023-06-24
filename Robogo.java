public abstract class Robogo extends Jarmu implements KisGepjarmu{
    private int maxSebesseg;

    public Robogo(int aktualisSebesseg, String rendszam, int maxSebesseg) {
        super(aktualisSebesseg, rendszam);
        this.maxSebesseg = maxSebesseg;
    }

    @Override
    public boolean haladhatItt(int haladhat) {
        return maxSebesseg < haladhat;
    }

    @Override
    public String toString() {
        return "Robogo{" +
                super.toString() +
                '}';
    }
}
