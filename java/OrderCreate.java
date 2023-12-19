import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.razorpay.RazorpayClient;

@RequestMapping("/user")
public class OrderCreate {
	
	
	@RequestMapping("/order_user")
	public String createOrder() {
		return "done";
	}
}
