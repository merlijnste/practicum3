public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int totaalPunten;
    private int aantalGespeeld;

    public Voetbalclub(String nm) {
        if (nm == "" || nm == null){
            naam = "Fc";
        }else {
            naam = nm;
        }
        aantalGewonnen = 0;
        aantalGelijk = 0;
        aantalVerloren = 0;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen = aantalGewonnen + 1;
            totaalPunten = totaalPunten + 3;
            aantalGespeeld++;
        }
        if (ch == 'g') {
            aantalGelijk = aantalGelijk + 1;
            totaalPunten = totaalPunten +1;
            aantalGespeeld++;
        }

        if (ch == 'v') {
            aantalVerloren = aantalVerloren + 1;
            aantalGespeeld++;
        }
    }

    public int aantalPunten() {
        return totaalPunten;
    }

    public int aantalGespeeld() {
        return aantalGespeeld;
    }

    public String getNaam(){
        return naam;
    }

    public String toString() {
        String string = naam + " " + aantalGespeeld + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + totaalPunten;
        return string;
    }
}
