import java.sql.*;
import java.util.*;

public class Cart{
    private List<Product> cart_in = new ArrayList<Product>();
    private final DatabaseConnection dbcon;

    public void add(int id, int idVendor, String name, String description, float price, int quantity){
	Product  new_product = new Product();

	product.setId(id);
	product.setIdVendor(idVendor);
	product.setName(name);
	product.setDescription(description);
	product.setprice(price);
	product.setquantity(quantity);

	cart_in.add(new_product);
    }

    public void remove(int num){
	product.remove(num);
    }
}
