package myownautoshop;
public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan malibu = new Sedan(120, 35000, "Blue", 18);
        Ford focus = new Ford(110, 32000, "Red", 2005, 2000);
        Ford fusion = new Ford(130, 38000, "White", 2008, 2500);
        Car camry = new Car(100, 33000, "Black");

        System.out.println("Sale price of Malibu: " + malibu.getSalePrice());
        System.out.println("Sale price of Focus: " + focus.getSalePrice());
        System.out.println("Sale price of Fusion: " + fusion.getSalePrice());
        System.out.println("Sale price of Camry: " + camry.getSalePrice());
    }
}
