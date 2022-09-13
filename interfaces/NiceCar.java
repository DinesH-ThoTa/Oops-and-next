package interfaces;

public class NiceCar {
    private Engine engine;
    private Media player=new MediaPlayer();

    public NiceCar(){
        engine=new ElectricEngine();
    }

    public NiceCar(Engine engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void acc(){
        engine.acc();
    }

    public void startMusic(){
        player.start();
    }
}
