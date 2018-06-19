/**
 * 
 */
package io.org.springbootstarter.buisnessService;

import java.util.List;

import javax.transaction.Transactional;

import io.org.springbootstarter.buisness.Order;
import io.org.springbootstarter.buisness.Order_bk;
import io.org.springbootstarter.buisness.Orders;
import io.org.springbootstarter.buisnessBean.OrderBean;

/**
 * @author rakeshs3
 *
 */
public interface ServiceInt<Order> {

	Order save(Order order);
	
	Orders getAll();
	
	//org.json.JSONObject getAll()throws Exception;
}
