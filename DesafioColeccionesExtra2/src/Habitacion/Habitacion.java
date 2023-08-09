package Habitacion;

import java.time.LocalDate;
import java.util.Objects;

public class Habitacion {
    private int habitacion;
    private int time;
    public Habitacion(){

    }
    public Habitacion(int habitacion, int time) {
        this.habitacion = habitacion;
        this.time = time;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "habitacion=" + habitacion +
                ", time=" + time +
                '}';
    }


}
