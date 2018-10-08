public class WaterBottle {
    private String name;
    private int volume;

    public WaterBottle(String name){
        this.name = name;
        this.volume = 100;
    }

    public String getName(){
        return this.name;
    }

    public int getVolume(){
        return this.volume;
    }

    public void drink(){
        this.volume = this.volume - 10;
    }
}
