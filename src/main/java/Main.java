public class Main {
    public static void main(String[] args) {
        //Burger classicBurger = new Burger(BreadType.BRIOCHE, MeatType.MEAT, Sauce.CLASSIC, true, true, false, false, false, true, true, false);
        //Burger vegeBurger = new Burger(BreadType.BRIOCHE, MeatType.VEGE, Sauce.HONEY_MUSTARD, true, true, true, true, false, false, true, true);

        //System.out.println(classicBurger);
        //System.out.println(vegeBurger);

        Burger classicBurger2 = Burger.builder(BreadType.BRIOCHE, MeatType.MEAT, Sauce.CLASSIC)
                .withCheese(true)
                .withJalapeno(true)
                .withBacon(true)
                .withOnion(true)
                .build();
        Burger vegeBurger2 = Burger.builder(BreadType.BRIOCHE, MeatType.VEGE, Sauce.HONEY_MUSTARD)
                .withCheese(true)
                .withJalapeno(true)
                .withToamto(true)
                .withLettuce(true)
                .withOnion(true)
                .withPineapple(true)
                .build();
        System.out.println(classicBurger2);
        System.out.println(vegeBurger2);
    }
}
