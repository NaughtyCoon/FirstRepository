public class Boat implements Vehicle{
    @Override
    public void start(){
        System.out.println("The boat starts...");
    }
    @Override
    public void stop(){
        System.out.println("The boat stops...");
    }
}
