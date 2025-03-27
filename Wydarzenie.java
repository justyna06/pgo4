public class Wydarzenie {

    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc;
    private int dostepneMiejsca;
    private double cena;

    public Wydarzenie(String nazwa,double cena, String data, String miejsce) {
        this.nazwa = nazwa;
        this.data = data;
        this.miejsce = miejsce;
        this.maxLiczbaMiejsc = 100;
        this.dostepneMiejsca = 0;
        this.cena = cena;
    }
    public Wydarzenie(String nazwa, String data, double cena) {
        this.nazwa = nazwa;
        this.data = data;
        this.cena = cena;
    }

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.maxLiczbaMiejsc = 100;
        this.dostepneMiejsca = 0;
    }

    public String toString() {
        return "Nazwa" + nazwa + "Data" + miejsce + "Cema" + cena + "Maksymalna ilosc miejsc" + maxLiczbaMiejsc +" Dostepne ilosc miejsc " + dostepneMiejsca;
    }


    public int zarezerwojMiejsc(int maxLiczbaMiejsc) {

        maxLiczbaMiejsc = 100;
        for (int i = 0; i < maxLiczbaMiejsc; i--) {
            maxLiczbaMiejsc--;
        }
        return  maxLiczbaMiejsc;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }

    public void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = dostepneMiejsca;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
}
