package Pewarisan;

public class TesterDVD {
    public static void main(String[] args) {
        DVD a = new DVD();

        a.setNumber(2);
        a.setName("Reborn");
        a.setQuantity(12);
        a.setPrice(2000.0);
        a.setLength(300);
        a.setRating("PG");
        a.setStudio("NewLine Cinema");
        
        a.print();

    }
}
