package BusinessLayer;
import Models.Customer;
import java.util.ArrayList;
import Connection.InputException;
import DataBaseLayer.DataBaseCustomer;

public class BusinessLayerCustomer {
    Customer customer;

    public BusinessLayerCustomer(){
        this.customer = new Customer();
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer) throws InputException{
        try{
            if(this.validateCustomer(customer))
                this.customer = customer;
        } catch (InputException ex){
            throw ex;
        }
    }

    private boolean validateCustomer(Customer customer) throws InputException{
        boolean empty = customer.getFullName().length() == 0 ||
                customer.getContact().length() == 0 ||
                customer.getAddress().length() == 0 ||
                customer.getEmail().length() == 0 ||
                customer.getCreditCardInfo().length() == 0 ;
        
        if(empty){
            throw new InputException("Please fill all the details");
        }
        if(!customer.getFullName().contains(" ")){
            throw new InputException("Enter your full name");
        }
        
        return  true;
    }
    public Customer save() throws Exception{
        //this functions saves the user detail to database and returns the user object after saving
        try{
            DataBaseCustomer dlCustomer = new DataBaseCustomer(this.customer);
            return dlCustomer.save();
        } catch (Exception e){
            throw e;
        }
    }
    
    public Customer update() throws Exception{
        //this functions saves the user detail to database and returns the user object after saving
        try{
            DataBaseCustomer dlCustomer = new DataBaseCustomer (this.customer);
            return dlCustomer.Update();
        } catch (Exception e){
            throw e;
        }
    }

    
    public ArrayList<Customer> getAllCustomer() throws Exception{
        try{
           DataBaseCustomer  dlCustomer = new DataBaseCustomer(this.customer);
            return dlCustomer.getAllCustomer();
        } catch (Exception e){
            throw e;
        }
    }
   
    public ArrayList<Customer> searchCustomer(String[] keys , String[] values) throws Exception{
        try {
      DataBaseCustomer dlCustomer = new DataBaseCustomer(this.customer);
      return dlCustomer.searchCustomer(keys,values);
        }catch(Exception e) {
            throw e;
    }
        }

}