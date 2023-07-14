public class Cow extends Animal{
    private String paroda;
    private int baasy;

    public Cow(String name, int weight, String color, String paroda, int baasy) {
        super(name, weight, color);
        this.paroda = paroda;
        this.baasy = baasy;
    }

    public Cow(String name, int weight, String color) {
        super(name, weight, color);
    }



    @Override
    public String toString() {
        return "Cow{" +
                " name "+getName()+
                " weight: "+getWeight()+
                " color "+getColor()+
                " paroda='" + paroda + '\'' +
                ", baasy=" + baasy +
                '}';
    }
}
