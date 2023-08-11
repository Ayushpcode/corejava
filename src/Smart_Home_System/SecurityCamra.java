package Smart_Home_System;

public class SecurityCamra {
    private boolean isRecording;

    public SecurityCamra() {
        this.isRecording = isRecording;
    }
    public void startRecording(){
        isRecording = true;
        System.out.println("Strat recording !");
    }
    public void stopRecording(){
        isRecording = false;
        System.out.println("Stop recording !");
    }
}
