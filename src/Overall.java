public class Overall extends Commodity{

    public int height;
    public int weight;
    public int width;

    public Overall(int id, int productCode, String name, int wholesalePrice, int retailPrice, int height, int weight, int width) {
        super(id, productCode, name, wholesalePrice, retailPrice);

        this.height = height;
        this.weight = weight;
        this.width = width;
    }

    public int getHeight() { return height;}
    public void setHeight(int height) { this.height = height;}

    public int getWeight() {return weight;}
    public void setWeight(int weight) { this.weight = weight;}

    public int getWidth() {return width;}
    public void setWidth(int width) { this.width = width;}

    public String toString() {
        return super.toString() +
                "\nheight " + height +
                "\nweight " + weight +
                "\nwidth " + width;
    }
}
