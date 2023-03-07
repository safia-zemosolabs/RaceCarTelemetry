package org.example;

public class DiscreteLightToggle implements LightToggle {
    boolean light[][];

    DiscreteLightToggle(boolean light[][]) {
        this.light = light;
    }

    public void toggle(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] = !this.light[i][j];
            }
        }
    }
}
