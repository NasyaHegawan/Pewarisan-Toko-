package Pewarisan;

public class TesterDVD {
    public static void main(String[] args) {
        DVD b = new DVD();

        b.setNumber(2);
        b.setName("Reborn");
        b.setQuantity(12);
        b.setPrice(2000.0);
        b.setLength(300);
        b.setRating("PG");
        b.setStudio("NewLine Cinema");
        
        b.print();

    }
}
