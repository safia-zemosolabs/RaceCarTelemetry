package org.example;

public class DiscreteLightSwitch implements LightSwitch {
    boolean light[][];

    DiscreteLightSwitch(boolean light[][]) {
        this.light = light;
    }

    public void on(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] = true;
            }
        }
    }

    public void off(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] = false;
            }
        }
    }
}
