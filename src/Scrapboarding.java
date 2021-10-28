public class Scrapboarding extends Commodity{

    private String time;
    public Scrapboarding(int id, int productCode, String name, int wholesalePrice, int retailPrice, String time) {
        super(id, productCode, name, wholesalePrice, retailPrice);
        this.time = time;
    }

    public String getTime() { return time;}
    public void setTime(String time) { this.time= time;}

@Override
    public String toString() {
        return super.toString() +
                "\ntime " + time;
}
}
