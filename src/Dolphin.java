public class Dolphin extends Aquatic{
    protected float swimmingSpeed;
    public Dolphin(String name, int age, String habitat, float swimmingSpeed) {
        super(name, age, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat + ", Swimming speed: " + swimmingSpeed;
    }
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

}
