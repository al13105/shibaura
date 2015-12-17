import java.sql.*;
import java.util.*;

public class Cart{
    private List<Product> cartIn = new ArrayList<Product>();
    private final DatabaseConnection dbCon;

    public void add(int id, int idVendor, String name, String description, float price, int quantity){
	Product  newProduct = new Product();

	product.setId(id);
	product.setIdVendor(idVendor);
	product.setName(name);
	product.setDescription(description);
	product.setprice(price);
	product.setquantity(quantity);

	cartIn.add(newProduct);
    }

    public void remove(int num){
	product.remove(num);
    }
}
