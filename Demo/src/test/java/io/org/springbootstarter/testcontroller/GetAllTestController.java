package io.org.springbootstarter.testcontroller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.google.gson.reflect.TypeToken;

import io.org.springbootstarter.buisness.OrderStatus;
import io.org.springbootstarter.buisness.Orders;
import io.org.springbootstarter.buisnessController.OrderController;
import io.org.springbootstarter.buisnessService.ServiceInt;
//import scala.annotation.meta.setter;

@RunWith(SpringRunner.class)
@WebMvcTest(OrderController.class)
public class GetAllTestController {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
    private ServiceInt getallServiceInt;
   
	OrderStatus status ;
	Orders orders;
    @Before
    public void Setup(){
    	status = new OrderStatus(10,11,12,13);
    	orders = new Orders();
    	orders.setTotalOrder(46);
    	orders.setOrders(status);
    	
    }
    
    
	
	/* @Test
	 public void getAll_ReturnAllEntries() throws Exception {
		 when(getallServiceInt.getAll()).thenReturn(orders);
		 
		 MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/getOrder")
				  .contentType(org.springframework.http.MediaType.APPLICATION_JSON)
				  .accept(org.springframework.http.MediaType.APPLICATION_JSON)
				  ).andReturn();
		 
			int status = result.getResponse().getStatus();
			assertEquals("Incorrect Response Status", HttpStatus.OK.value(), status);
			verify(getallServiceInt).getAll();
			
			
			TypeToken<List<OrderStatus>> token = new TypeToken<List<OrderStatus>>() {};
			
			
			@SuppressWarnings("unchecked")
			
			List<Orders> listResult = TestUtil.jsonToList(result.getResponse().getContentAsString(), token);
			
			System.out.println("result--" +result.getResponse().getContentAsString());
			
			assertNotNull("Employees not found", listResult);
			//assertEquals("Incorrect Employee List", getallServiceInt., listResult.size());
	    }
	*/

}
