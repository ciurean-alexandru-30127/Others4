package isp.lab6.exercise1Test;


import isp.lab6.exercise1.SensorsCluster;
import org.junit.Test;

import static isp.lab6.exercise1.SensorType.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.ArrayList;

public class SensorClusterTest {



    @Test
    public void TestAddSensorShouldReturnNewSensor(){
        SensorsCluster sensorsCluster=new SensorsCluster(new ArrayList<>());
        sensorsCluster.addSensor(TEMPERATURE, "someID");
        assertEquals(1,sensorsCluster.getSensors().size());
        assertEquals("someID",sensorsCluster.getSensors().get(0).getId());
        assertEquals(null, sensorsCluster.getSensors().get(0).getSensorType());

    }
    @Test
    public void TestAddSensorShouldReturnNullBecauseIdAlreadyExists(){
        SensorsCluster sensorsCluster=new SensorsCluster(new ArrayList<>());
        sensorsCluster.addSensor(TEMPERATURE, "someID");
        assertEquals(1,sensorsCluster.getSensors().size());
        assertEquals("someID",sensorsCluster.getSensors().get(0).getId());
        assertEquals(null,sensorsCluster.getSensors().get(0).getSensorType());
        assertNull(sensorsCluster.addSensor(HUMIDITY, "someID"));


    }
    @Test
    public void Test(){
        SensorsCluster sensorsCluster=new SensorsCluster(new ArrayList<>());
        sensorsCluster.addSensor(TEMPERATURE, "someID");
        assertEquals(1,sensorsCluster.getSensors().size());
        assertEquals("someID",sensorsCluster.getSensors().get(0).getId());
        assertEquals(null,sensorsCluster.getSensors().get(0).getSensorType());
        sensorsCluster.addSensor(HUMIDITY, "anotherID");
        assertEquals(2,sensorsCluster.getSensors().size());
        assertEquals("anotherID",sensorsCluster.getSensors().get(1).getId());
        assertEquals(null,sensorsCluster.getSensors().get(1).getSensorType());


    }
}

