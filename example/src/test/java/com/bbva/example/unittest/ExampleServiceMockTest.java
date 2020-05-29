package com.bbva.example.unittest;



import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.bbva.example.model.Data;
import com.bbva.example.model.ObjetoSalida;
import com.bbva.example.model.RestApiExampleObject;
import com.bbva.example.service.ExampleService;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class ExampleServiceMockTest {

	@Mock
	private ExampleService exampleMock;
	
    @BeforeEach
    void setMockOutput() {
        
    	RestApiExampleObject restApiExampleObject = new RestApiExampleObject();
    	List<Data> lista = new ArrayList<Data>();
    	Data d= new Data();
    	d.setId("1");
    	d.setEmployeeName("Luis");
    	lista.add(d);
    	restApiExampleObject.setData(lista);
    	ObjetoSalida o = new ObjetoSalida("1", "Luis");
    	List<ObjetoSalida> list = new ArrayList<ObjetoSalida>();
    	list.add(o);
       
    	when(exampleMock.reestructurar(restApiExampleObject)).thenReturn(list);
    }

    @DisplayName("Test Mock exampleMock + helloRepository")
    @Test
    void testGet() {
    	RestApiExampleObject restApiExampleObject = new RestApiExampleObject();
    	List<Data> lista = new ArrayList<Data>();
    	Data d= new Data();
    	d.setId("1");
    	d.setEmployeeName("Luis");
    	lista.add(d);
    	restApiExampleObject.setData(lista);
    	
    	ObjetoSalida o = new ObjetoSalida("1", "Luis");
    	List<ObjetoSalida> list = new ArrayList<ObjetoSalida>();
    	list.add(o);
        assertEquals(list, exampleMock.reestructurar(restApiExampleObject));
    	
    }
	
}
