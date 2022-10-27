package oopWithNLayerdApp.business;

import java.io.LineNumberInputStream;
import java.util.List;

import oopWithNLayerdApp.core.logging.Logger;
import oopWithNLayerdApp.dataAccess.HibernateProductDao;
import oopWithNLayerdApp.dataAccess.JdbcProductDao;
import oopWithNLayerdApp.dataAccess.ProductDao;
import oopWithNLayerdApp.entities.Product;

public class ProducManager {
	
	private ProductDao productDao;
    private List<Logger>loggers;
	
public ProducManager(ProductDao productDao,List<Logger>loggers) {
		
		this.productDao = productDao;
		this.loggers=loggers;
	}


public void add(Product product) throws Exception {
	
	//bussines rules
	
	if(product.getUnitPrice()<10) {
		throw new Exception("Ürün fiyatı 10 dan küçük olamaz.");
	}
  
    productDao.add(product);

    for(Logger logger:loggers) {//[db,mail]
    	logger.log(product.getName());
    	
    }
}
}
