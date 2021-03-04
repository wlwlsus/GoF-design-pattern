package ch5_singleton.speaker;

public class SystemSpeaker {
    static private SystemSpeaker instance;

    private int volume;

    private SystemSpeaker(){
        volume = 5;
    }

    public static SystemSpeaker getInstance(){
        if(instance == null){
            instance = new SystemSpeaker();
        }
        return instance;
    }

    public int getVolume() {
        System.out.println(volume);
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

