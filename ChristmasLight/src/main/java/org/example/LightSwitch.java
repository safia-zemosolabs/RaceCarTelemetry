package org.example;

public interface LightSwitch {
    void on(int startRow, int startColumn, int endRow, int endColumn);
    void off(int startRow, int startColumn, int endRow, int endColumn);
}
