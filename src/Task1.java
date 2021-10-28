public class Task1 {
    public static void main(String[] args) {
        Commodity lab31=new Commodity( 1, 111, "potato", 10, 15);
        lab31.setDescription("good");

    Fragile fragile = new Fragile(1, 111, "potato", 10, 15, 1);

    Scrapboarding scrapboarding = new Scrapboarding(1, 111, "potato", 10, 15, "21.10.2022");

    Overall overall = new Overall(1, 111, "potato", 10, 15, 10, 20, 30);




/*lab3 lab32=new lab3( cod: 2; lastname: "Sidorov"; namep: "Star"; number: 1; vid: "Studio");
lab32.setKol(3);
lab32.setPrice(5000);*/
//System.out.println(lab31.toString());
//System.out.println("description "+ lab31.getDescription());
//System.out.println("Date of departure"+ lab31.getDatav());
//System.out.println("Kol-vo "+ lab31.getKol());
//System.out.println("Price "+ lab31.getPrice());
//System.out.println(lab31.toString());
//System.out.println("Kol-vo "+ lab31.getKol());
//System.out.println("Price "+ lab31.getPrice());

    System.out.println("\n" + fragile.toString());
    System.out.println("\n" + scrapboarding.toString());
    System.out.println("\n" + overall.toString());
    }
}