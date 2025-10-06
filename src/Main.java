public class Main {
    public static void main(String[] args) {
        Aquatic a = new Aquatic("Fish", 3, "Ocean");
        Terrestrial t = new Terrestrial("Lion", 5, 4);
        Dolphin d = new Dolphin("Dolly", 8, "Sea", 40.5f);
        Penguin p = new Penguin("Pingu", 4, "Arctic", 20.0f);

        System.out.println("Objects created with parameters!");
        System.out.println(d);
        System.out.println(p);
        a.swim();
        d.swim();
        p.swim();


    }

}

