public class Walker implements Walk, Breath{

    @Override
    public void breath() {
        System.out.println("A walker can breath.");
    }

    @Override
    public void walk() {
        System.out.println("A walker can walk.");

    }
}
