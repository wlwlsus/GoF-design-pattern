package ch5_singleton.speaker;

public class Main {
    public static void main(String[] args) {
        SystemSpeaker systemSpeaker1 = SystemSpeaker.getInstance();
        SystemSpeaker systemSpeaker2 = SystemSpeaker.getInstance();

        systemSpeaker1.getVolume();
        systemSpeaker2.getVolume();

        systemSpeaker1.setVolume(10);
        systemSpeaker1.getVolume();
        systemSpeaker2.getVolume();

        systemSpeaker2.setVolume(20);
        systemSpeaker1.getVolume();
        systemSpeaker2.getVolume();


    }
}
