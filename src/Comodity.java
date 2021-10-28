class Commodity {
    private int id;
    private int productCode;
    private String name;
    private int wholesalePrice;
    private int retailPrice;
    private String description;

    public Commodity (int id, int productCode, String name, int wholesalePrice, int retailPrice) {
        this.id=id;
        this.productCode=productCode;
        this.name=name;
        this.wholesalePrice=wholesalePrice;
        this.retailPrice=retailPrice;
    }

    public int getId(){return id;}
    public void setId(int id){this.id=id;}

    public int getProductCode(){return productCode;}
    public void setproductCode(int productCode){this.productCode=productCode;}

    public String getName(){return name;}
    public void setId(String name){this.name=name;}

    public int getWholesalePrice(){return wholesalePrice;}
    public void setWholesalePrice(int wholesalePrice){this.wholesalePrice=wholesalePrice;}

    public int getRetailPrice(){return retailPrice;}
    public void setRetailPrice(int retailPrice){this.retailPrice=retailPrice;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}

    public String toString(){return "\nId: "+id+"\nproductCode: "+productCode+"\nName:  "+name+"\nwholesalePrice: " + retailPrice + "\nretailPrice: "+ retailPrice;}
}
