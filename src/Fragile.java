public class Fragile extends Commodity{

private int coefficient;
    public Fragile(int id, int productCode, String name, int wholesalePrice, int retailPrice, int coefficient) {
        super(id, productCode, name, wholesalePrice, retailPrice);

        this.coefficient = coefficient;
    }

public int getCoefficient(){ return coefficient;}
public void setCoefficient(int coefficient) { this.coefficient = coefficient;}

@Override
    public String toString() {
        return super.toString() +
                "\ncoefficient " +coefficient;
}
}
