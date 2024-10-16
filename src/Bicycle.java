public class Bicycle implements Vehicle{
    @Override
    public void start(){
        System.out.println("The bicycle starts...");
    }
    @Override
    public void stop(){
        System.out.println("The bicycle stops...");
    }
}
