package Pewarisan;

public class DVD extends Product {
    private int length;
    private String rating;
    private String studio;

    public DVD() {
        length = 0;
        rating = "";
        studio = "";
    }

    public DVD(int number, String name, int quantity, double price, String rating, int length, String studio) {
        super(number, name, quantity, price);
        this.rating = rating;
        this.length = length;
        this.studio = studio;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    // Override
    public void print() {
        super.print();
        System.out.println("Length\t\t: " + length);
        System.out.println("Rating\t\t: " + rating);
        System.out.println("Studio\t\t: " + studio);
    }
}
