public class SystemRezerwacji {

    SystemRezerwacji system = new SystemRezerwacji();

    Wydarzenie koncert = new Wydarzenie("Koncert Symphony", 120.0);
    Wydarzenie teatr = new Wydarzenie("Hamlet", 85.0);

    public void dodajKoncert(Wydarzenie koncert) { SystemRezerwacji.add(koncert);}
    public void dodajTeatr(Wydarzenie teatr) { SystemRezerwacji.add(teatr);}



    Klient klient1 = new Klient("Jan", "Kowalski", "jan@example.com");
    Klient klient2 = new Klient("Anna", "Nowak", "anna@example.com");

    public void dodajKlient(Klient klient1) { system.dodajKlient(klient1);}
    public void dadajKlient(Klient klient2) {system.dodajKlient(klient2);}



    public void dokonajRezerwacji(Wydarzenie koncert, Klient klient1) {system.dokonajRezerwacji(koncert, klient1);}
    public void dokonajRezerwacji(Wydarzenie teatr, Klient klient2){system.dokonajRezerwacji(koncert,klient2);}




}
