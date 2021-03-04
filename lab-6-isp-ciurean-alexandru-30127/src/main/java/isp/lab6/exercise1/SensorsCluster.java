package isp.lab6.exercise1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SensorsCluster {
    private List<Sensor> sensors = new ArrayList<>();

    public SensorsCluster(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    public SensorsCluster() {
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }


    public Sensor addSensor(SensorType sensorType, String sensorId) {
        for (Sensor sensor : this.sensors) {
            if (sensor.getId().equals(sensorId)) {
                return null;
            }
        }
        Sensor sensor = new Sensor(sensorType, sensorId);
        this.sensors.add(sensor);
        return sensor;
    }


    public boolean writeSensorReading(String sensorId, double value, LocalDateTime dateTime) {
        if (getSensorById(sensorId) != null) {
            Sensor searchSensor = getSensorById(sensorId);
            SensorReading sensorReading = new SensorReading(dateTime, value);
            searchSensor.addSensorReading(sensorReading);
            return true;
        }

        return false;


    }


    public Sensor getSensorById(String sensorId) {
        for (int i = 0; i < sensors.size(); i++) {
            if (sensors.get(i).getId().equals(sensorId)) {
                return sensors.get(i);
            }
        }
        return null;
    }
}