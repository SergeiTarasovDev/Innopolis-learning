package com.learning;

// Определить интерфейс, который позволит перемещать фигуру на заданные координаты.
interface Relocatable {

    /**
     * relocate the figure to the coordinates
     * @param changeX new X-coordinate
     * @param changeY new Y-coordinate
     */
    public void setPosition (double changeX, double changeY);
}
