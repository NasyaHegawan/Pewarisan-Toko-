package Pewarisan;

public class TesterCD {
    public static void main(String[] args) {
        CD a = new CD();

        a.setNumber(2);
        a.setName("Reborn");
        a.setQuantity(12);
        a.setPrice(2000.0);
        a.setArtist("Lady Gaga");
        a.setNumSong(10);
        a.setLabel("Sony Music");
        
        a.print();

    }
}
