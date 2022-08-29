package DataBaseLayer;

import Models.Customer;
    
import Connection.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataBaseCustomer {
	private Customer customer;
	private DatabaseConnector db;
	private Connection connection;

        private void init(Customer customer) throws Exception{
		try {
			this.db = DatabaseConnector.getInstance();
			this.connection = this.db.getConnection();
		} catch (Exception ex) {
			throw ex;
		}
        }
	public DataBaseCustomer() throws Exception {
		this.customer= new Customer();
                this.init(this.customer);
	}

	public DataBaseCustomer(Customer customer) throws Exception {
                this.init(customer);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer( Customer customer ) {
		this.customer = customer;
	}
	public Customer save() throws Exception {
		try {
			// prepare for the data to be return in case of insert
			String generatedColumns[] = { "id" };
			// create the statement
			String query = "INSERT INTO  customer ( title, fullname, address, email, telephoneNumber, custType, CreditCardInfo, CompanyName, companyAddress, contact,"
                                + " discountOffered, expiryDate, bilingDate, loginId) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = this.connection.prepareStatement(query, generatedColumns);
                        
                        statement.setString(1, this.customer.getTitle());
                        statement.setString(2, this.customer.getFullName());
                        statement.setString(3, this.customer.getAddress());
                        statement.setString(4, this.customer.getEmail());
                        statement.setString(5, this.customer.getTelephoneNumber());
                        statement.setString(6, this.customer.getCustType());
                        statement.setString(7, this.customer.getCreditCardInfo());
                        statement.setString(8, this.customer.getCompanyName());
                        statement.setString(9, this.customer.getCompanyAddress());
			statement.setString(10, this.customer.getContact());
			statement.setFloat(11, this.customer.getDiscountOffered());
                        statement.setString(12, this.customer.getExpiryDate());
                        statement.setString(13, this.customer.getBilingDate());
                        statement.setInt(14, this.customer.getLoginId());
                        
			// execute the query
			int noOfUpdate = statement.executeUpdate();
			if (noOfUpdate > 0) {
				ResultSet rs = statement.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					this.customer.setLoginId(id);
				}
			}
			return this.customer;
		} catch (Exception ex) {
			throw ex;
		}
	}

	public Customer Update() throws Exception {
		try {
			// create the statement
			String query = "UPDATE user SET title =?, fullname =? ,address=? email=?, telephoneNumber= ?, CustType= ?,CreditCardInfo= ?,CompanyName= ?,CompanyAddress= ?,"
                        + "Contact= ?,DiscountOffered= ?,ExpiryDate= ?,BilingDate= ?, where LoginId= ?";
			PreparedStatement statement = this.connection.prepareStatement(query);
		        statement.setString(1, this.customer.getTitle());
                        statement.setString(2, this.customer.getFullName());
                        statement.setString(3, this.customer.getAddress());
                        statement.setString(4, this.customer.getEmail());
                        statement.setString(5, this.customer.getTelephoneNumber());
                        statement.setString(6, this.customer.getCustType());
                        statement.setString(7, this.customer.getCreditCardInfo());
                        statement.setString(8, this.customer.getCompanyName());
                        statement.setString(9, this.customer.getCompanyAddress());
			statement.setString(10, this.customer.getContact());
			statement.setFloat(11, this.customer.getDiscountOffered());
                        statement.setString(12, this.customer.getExpiryDate());
                        statement.setString(13, this.customer.getBilingDate());
                        statement.setInt(14, this.customer.getLoginId());
			// execute the query
			statement.executeUpdate();
			return this.customer;
		} catch (Exception ex) {
			throw ex;
		}
	}
	public ArrayList<Customer> getAllCustomer() throws Exception{
		ArrayList<Customer> users= new ArrayList<Customer>();
	    try{
	       String query = "SELECT * FROM user ORDER BY name";
	       Statement statement = this.connection.createStatement();
	       ResultSet rs = statement.executeQuery(query);
	       while(rs.next()) {
	        Customer c = new Customer();
                c.setTitle(rs.getString("title"));
                c.setFullName(rs.getString("fullname"));
                c.setAddress(rs.getString("address"));
                c.setAddress(rs.getString("email"));
                c.setTelephoneNumber(rs.getString("telephone no"));
                c.setCustType(rs.getString("CustType"));
                c.setCreditCardInfo(rs.getString("CreditCardInfo"));
                c.setCompanyName(rs.getString("CompanyName"));
                c.setCompanyAddress(rs.getString("Companyaddress"));
                c.setContact(rs.getString("Contact"));
                c.setDiscountOffered(rs.getFloat("DiscountOffered"));
                c.setExpiryDate(String.valueOf(rs.getDate("Expiry Date")));
                c.setBilingDate(String.valueOf(rs.getDate("Biling Date")));
	        users.add(c);
	  }
	    }
	    catch(Exception ex){
	        throw ex;
	    }
	    return users;
	    }
	    public ArrayList<Customer> searchCustomer(String[] keys , String[] values) throws Exception{
	        //SELECT * FROM USER WHERE NAME like '%hari%' and address LIKE '%PCPS%';
	        ArrayList<Customer> customers= new ArrayList<Customer>(); try{
	            int keyLength= keys.length;
	            String where = "";
	            for(int i=0; i<keyLength; ++i) {
	                if(i==0){
	                    where= where+" WHERE" + keys[i]+ "LIKE '%" + values[i]+ "%'  ";
	            }else{ 
	                    where=  where+" AND" + keys[i]+ "LIKE '%" + values[i]+ "%'  ";
	            }
	                }
	                String query = "SELECT * FROM Customer " + where+"ORDER BY name";
	                Statement statement = this.connection.createStatement();
	                ResultSet rs = statement.executeQuery(query);
	                while(rs.next()) {
		Customer c = new Customer();
                c.setTitle(rs.getString("title"));
                c.setFullName(rs.getString("fullname"));
                c.setAddress(rs.getString("address"));
                c.setAddress(rs.getString("email"));
                c.setTelephoneNumber(rs.getString("telephone no"));
                c.setCustType(rs.getString("CustType"));
                c.setCreditCardInfo(rs.getString("CreditCardInfo"));
                c.setCompanyName(rs.getString("CompanyName"));
                c.setCompanyAddress(rs.getString("Companyaddress"));
                c.setContact(rs.getString("Contact"));
                c.setDiscountOffered(rs.getFloat("DiscountOffered"));
                c.setExpiryDate(String.valueOf(rs.getDate("Expiry Date")));
                c.setBilingDate(String.valueOf(rs.getDate("Biling Date")));
	        customers.add(c);

		            }
		        }catch (SQLException e) {
		            throw new Exception(e.getMessage());
		        }
		        return customers;

		    }
		}

	       
	//Query
//Create a select query to check if the username and the password exists in the database
	


	
		