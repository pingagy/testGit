import java.util.Locale;
import java.util.ResourceBundle;

import redis.clients.jedis.JedisPool;

public class Test {

	private JedisPool pool;
	
	public static void main(String[] args) {
		Test test = new Test();
		test.initPool();

	}

	public void initPool(){
		Locale locale1 = new Locale("zh", "CN"); 
		final ResourceBundle bundle = ResourceBundle.getBundle("myconf.properties",locale1);
		System.out.println(bundle.getString("redis.pool.maxActive"));
	}
}
