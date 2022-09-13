package interfaces;

public class Car implements Brake,Engine{
    @Override
    public void brake() {
        System.out.println("Brake");
    }
    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void acc() {
        System.out.println("acc");
    }
}
