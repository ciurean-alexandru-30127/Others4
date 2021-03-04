package isp.lab6.exercise1;

import java.util.*;

public class Sensor {
    private SensorType type;
    private List<SensorReading> sensorReadings = new ArrayList<>();
    private String id;

    public Sensor(SensorType sensorType, String sensorId) {
        this.id = sensorId;
        this.type = sensorType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<SensorReading> getSensorReadings() {
        return sensorReadings;
    }

    public void setSensorReadings(List<SensorReading> sensorReadings) {
        this.sensorReadings = sensorReadings;
    }

    public List<SensorReading> getSensorReadingSortedByDateAndTime() {
        Collections.sort(this.sensorReadings);
        return this.sensorReadings;
    }

    public List<SensorReading> getSensorReadingSortedByValue() {
        Collections.sort(this.sensorReadings, new SensorReading.ValueComparator());
        return this.sensorReadings;
    }

    public boolean addSensorReading(SensorReading sensorReading) {
        if (getSensorReadings() != null) {
            this.sensorReadings.add(sensorReading);
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sensor sensor = (Sensor) o;
        return type == sensor.type &&
                Objects.equals(sensorReadings, sensor.sensorReadings) &&
                Objects.equals(id, sensor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sensorReadings, id);
    }

    public SensorType getSensorType() {
        return null;

    }

}