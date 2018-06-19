/**
 * 
 */
package io.org.springbootstarter.buisnessService;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.org.springbootstarter.buisness.Order;
import io.org.springbootstarter.buisness.OrderStatus;
import io.org.springbootstarter.buisness.Orders;
import io.org.springbootstarter.buisnessBean.OrderBean;
import io.org.springbootstarter.buisnessDAO.OrderDAO;

/**
 * @author rakeshs3
 *
 */
@Service
public class ServiceImpl implements ServiceInt<Order> {

	@Autowired
	OrderDAO orderDao;
	
	/*@Override
	public Order save(Order pOrder) {
		// TODO Auto-generated method stub
		
		return orderDao.save(pOrder);
		
	}

	@Override
	public Order getAll(Order aOrder) {
		// TODO Auto-generated method stub
		
		return orderDao.findAll(aOrder);
		
	}*/

	
	
	@Override
	public Order save(Order pOrder) {
		// TODO Auto-generated method stub
		return orderDao.save(pOrder);
	}


	
	@Override
	public Orders getAll() {
		// TODO Auto-generated method stub
		Orders lOrders = new Orders();
		
		int pending=0;
		int processed=0;
		int shipped=0;
		int canceled=0;
		int totalOrder = 0;
		List<Order> order = orderDao.findAll();
		for(Order lOrder:order){
			if(lOrder.getOrder_status().equals("pending")){
				pending++;
				System.out.println("pending item is "+pending);
			}else if(lOrder.getOrder_status().equals("shipped")){
				shipped++;
				System.out.println("shipped item is "+shipped);
			}else if(lOrder.getOrder_status().equals("canceled")){
				canceled++;
			}
			else if(lOrder.getOrder_status().equals("processed")){
				processed++;
			}
		}
		
		
		OrderStatus orderObject = new OrderStatus();
		orderObject.setCanceled(canceled);
		orderObject.setPending(pending);
		orderObject.setProcessed(processed);
		orderObject.setShipped(shipped);
		
		
		lOrders.setOrders(orderObject);
		lOrders.setTotalOrder(order.size());
		return lOrders;
	}
	
	/*@Override
	public JSONObject getAll() throws Exception {
		// TODO Auto-generated method stub
		
		
		JSONObject chartobj = new JSONObject();
		//chartobj.put(key, value);
		
		
		JSONObject obj = new JSONObject();
        obj.put("0", "A");
        obj.put("1", "B");
        obj.put("2", "C");
        obj.put("3", "D");
        
        JSONArray list = new JSONArray();
        list.put(obj);
        
        
        JSONObject mainObj = new JSONObject();
        mainObj.put("orders", list);
		
		return mainObj;
	}*/
	
}
