import java.sql.*;
import java.util.*;

pablic class ControlBuy{
    private final DatabaseConnection dbCon;
    private Cart myCart=null;
    
    public Cart getCart(User ){
	if(myCart==null){
	    myCart = new Cart();
	}
	return myCart;
    }
    public void confirmBuy(User , Cart ){
	
    }
}
