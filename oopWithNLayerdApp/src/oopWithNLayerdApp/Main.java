package oopWithNLayerdApp;

import java.util.List;

import oopWithNLayerdApp.business.ProducManager;
import oopWithNLayerdApp.core.logging.DatabaseLogger;
import oopWithNLayerdApp.core.logging.FileLogger;
import oopWithNLayerdApp.core.logging.Logger;
import oopWithNLayerdApp.dataAccess.HibernateProductDao;
import oopWithNLayerdApp.dataAccess.JdbcProductDao;
import oopWithNLayerdApp.dataAccess.ProductDao;
import oopWithNLayerdApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {

		Product product1 = new Product(1, "Iphone Xr", 100000);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger() };

		ProducManager producManager = new ProducManager(HibernateProductDao(),JdbcProductDao());
		producManager.add(product1);;

	}

	private static ProductDao HibernateProductDao() {
		
		return null;
	}

	private static List<Logger> JdbcProductDao() {
		
		return null;
	}

}
