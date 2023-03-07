package org.example;

public class VariableLightToggle implements LightToggle {
    int light[][];

    VariableLightToggle(int light[][]) {
        this.light = light;
    }

    public void toggle(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] += 2;
            }
        }
    }
}
