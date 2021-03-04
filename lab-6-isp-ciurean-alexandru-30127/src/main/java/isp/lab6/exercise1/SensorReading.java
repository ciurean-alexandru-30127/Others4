package isp.lab6.exercise1;

import java.time.LocalDateTime;
import java.util.Comparator;

public class SensorReading implements Comparable<SensorReading> {

    private LocalDateTime dateAndTime;

    private double value;

    public SensorReading(LocalDateTime dateAndTime, double value) {
        this.dateAndTime = dateAndTime;
        this.value = value;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public int compareTo(SensorReading o) {
        return getDateAndTime().compareTo(o.getDateAndTime());
    }

    public void add(SensorReading sensorReading) {
    }

    public static class ValueComparator implements Comparator<SensorReading> {
        @Override
        public int compare(SensorReading o1, SensorReading o2) {
            if (o1.getValue() - o2.getValue() > 0.01) {
                return 1;
            } else if (o1.getValue() - o2.getValue() < 0.01) {
                return -1;
            }
            return 0;
        }
    }
}