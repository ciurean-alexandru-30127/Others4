package isp.lab6.exercise1;


import java.time.LocalDateTime;

import static isp.lab6.exercise1.SensorType.*;

public class Exercise1 {

    public static void main(String[] args) {
        SensorsCluster sensorsCluster = new SensorsCluster();

        sensorsCluster.addSensor(TEMPERATURE, "1");
        sensorsCluster.addSensor(HUMIDITY, "2");
        sensorsCluster.addSensor(PRESSURE, "3");

        System.out.println(sensorsCluster);

        Sensor sensor1 = sensorsCluster.getSensorById("1");
        LocalDateTime localDateTime1 = LocalDateTime.of(2009, 10, 22, 1, 12, 1);
        SensorReading sensorReading1 = new SensorReading(localDateTime1, 123);
        LocalDateTime localDateTime2 = LocalDateTime.of(2015, 1, 14, 21, 51, 12);
        SensorReading sensorReading2 = new SensorReading(localDateTime2, 164);
        sensor1.addSensorReading(sensorReading1);
        sensor1.addSensorReading(sensorReading2);

        Sensor sensor2 = sensorsCluster.getSensorById("2");
        LocalDateTime localDateTime3 = LocalDateTime.of(2002, 4, 3, 12, 15, 1);
        SensorReading sensorReading3 = new SensorReading(localDateTime3, 123);
        LocalDateTime localDateTime4 = LocalDateTime.of(2018, 4, 5, 11, 51, 11);
        SensorReading sensorReading4 = new SensorReading(localDateTime4, 123);
        sensor2.addSensorReading(sensorReading3);
        sensor2.addSensorReading(sensorReading4);
        Sensor sensor3 = sensorsCluster.getSensorById("3");
        LocalDateTime localDateTimeP1 = LocalDateTime.of(2015, 2, 24, 14, 2, 12);
        SensorReading sensorReadingP1 = new SensorReading(localDateTimeP1, 14);
        LocalDateTime localDateTimeP2 = LocalDateTime.of(2016, 2, 1, 4, 2, 42);
        SensorReading sensorReadingP2 = new SensorReading(localDateTimeP2, 55);
        sensor3.addSensorReading(sensorReadingP1);
        sensor3.addSensorReading(sensorReadingP2);
        System.out.println(sensor1);
        System.out.println(sensor2);
        System.out.println(sensor3);
        System.out.println("Sensor1  ");
        sensor1.getSensorReadingSortedByDateAndTime();
        System.out.println("Sensor 2 ");
        sensor2.getSensorReadingSortedByValue();
        localDateTime1 = LocalDateTime.of(2002, 3, 5, 17, 27, 5);
        if (sensorsCluster.writeSensorReading("1", 19, localDateTime1)) {
            System.out.println("The sensor1 after add" + sensor1);
        } else {

        }

    }
}
