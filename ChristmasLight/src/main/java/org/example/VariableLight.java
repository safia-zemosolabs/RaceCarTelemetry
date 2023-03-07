package org.example;

public class VariableLight implements ILights {

    int light[][];
    LightSwitch onOffSwitch;
    LightToggle toggleSwitch;

    VariableLight() {
        light = new int[1000][1000];
        onOffSwitch = new VariableLightSwitch(light);
        toggleSwitch = new VariableLightToggle(light);
    }

    public void glowLights() {
        onOffSwitch.on(887, 9, 959, 629);
        onOffSwitch.on(454, 398, 844, 448);

        onOffSwitch.off(539, 243, 559, 965);
        onOffSwitch.off(370, 819, 676, 868);
        onOffSwitch.off(145, 40, 370, 997);
        onOffSwitch.off(301, 3, 808, 453);

        onOffSwitch.on(351, 678, 951, 908);

        toggleSwitch.toggle(720, 196, 897, 994);
        toggleSwitch.toggle(831, 394, 904, 860);
    }

    public int getTotalOnLights() {
        int _count = 0;
        for(int i=0;i<this.light.length;i++) {
            for (int j=0;j<this.light[i].length;j++){
                _count += light[i][j];
            }
        }

        return _count;
    }
}


