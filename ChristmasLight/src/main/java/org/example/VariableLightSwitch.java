package org.example;

public class VariableLightSwitch implements LightSwitch {
    int light[][];

    VariableLightSwitch(int light[][]) {
        this.light = light;
    }

    public void on(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] += 1;
            }
        }
    }

    public void off(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                if (this.light[i][j] > 0) {
                    this.light[i][j] -= 1;
                }
            }
        }
    }
}
