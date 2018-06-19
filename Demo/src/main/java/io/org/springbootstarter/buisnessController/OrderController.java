package io.org.springbootstarter.buisnessController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;
import javax.transaction.Transactional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import io.org.springbootstarter.buisness.Item;
import io.org.springbootstarter.buisness.Order;
import io.org.springbootstarter.buisness.Orders;
import io.org.springbootstarter.buisnessBean.ItemBean;
import io.org.springbootstarter.buisnessDAO.OrderDAO;
import io.org.springbootstarter.buisnessService.ServiceInt;


@Transactional
@RestController
public class OrderController {

	@Autowired
	ServiceInt serviceInt;
	
	
	private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	
	@RequestMapping(value="/createOrder",method = RequestMethod.GET)
	public ResponseEntity<Order> addOrder() {
		System.out.println("in controller");
		Order pOrder = new Order();
		pOrder.setTotal_price(100);
		
		Date date = new Date();
        System.out.println(sdf.format(date));
		pOrder.setCreation_date(date);
		pOrder.setModified_date(date);
		pOrder.setOrder_status("shipped");
		pOrder.setCountry("India");
		pOrder.setState("DL");
		
		Order lOrder = (Order) serviceInt.save(pOrder);
		return new ResponseEntity<Order>(lOrder, HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value="/getOrder" ,method = RequestMethod.GET)
	public ResponseEntity<Orders> getAllOrders() {
		Orders lOrders = serviceInt.getAll();
		if (lOrders==null) {
			
			return new ResponseEntity<Orders>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Orders>(lOrders, HttpStatus.OK);
	}
	
	/*@RequestMapping(value="/getOrder" ,method = RequestMethod.GET)
	public ResponseEntity<String> getAllOrdersCopy() throws Exception {
		JSONObject lOrders = serviceInt.getAll();
		String str = lOrders.toString();
		if (str.isEmpty()) {
			
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}*/
	
		
}
