package Smart_Home_System;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeSystem {
    private List<Light> light;
    private Thermostat thermostat;
    private SecurityCamra securityCamra;
    private Doorlock doorlock;

    public SmartHomeSystem(Thermostat thermostat, SecurityCamra securityCamra, Doorlock doorlock) {
        this.light = new ArrayList<>();
        this.thermostat = thermostat;
        this.securityCamra = securityCamra;
        this.doorlock = doorlock;
    }

    public  void set_thermostat_temperature(float temperature){
        thermostat.setTemperature(temperature);
    }
    public void start_security_camera_recording(){
        securityCamra.startRecording();
    }
    public void stop_security_camera_recording(){
        securityCamra.stopRecording();
    }
    public void lock_all_doors(){
        doorlock.lock();
    }
    public void unlock_all_doors(){
        doorlock.unlock();
    }
}
