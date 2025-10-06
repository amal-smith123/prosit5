public class Penguin extends Aquatic {
    protected float swimmingDepth;
    public Penguin(String name, int age, String habitat, float swimmingDepth) {
        super(name, age, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
