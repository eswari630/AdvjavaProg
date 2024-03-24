package com.sathya.servlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ProductDao {

		public int save(Product product) {
				 Connection connection=null;
				  PreparedStatement preparedStatement=null;
				  int saveResult=0;
				  try {
					  //Get the connection
					  connection =Dbconnection.createconnection();
					  
					  //create the Ps Object
					  preparedStatement =connection.prepareStatement("insert into product_data values(?,?,?,?,?,?,?,?)");
					  
					
					  preparedStatement.setString(1,product.getProId());
					  preparedStatement.setString(2,product.getProName());
					  preparedStatement.setDouble(3,product.getProPrice());
					  preparedStatement.setString(4,product.getProBrand());
					  preparedStatement.setString(5,product.getProMadeIn());
					  
					  preparedStatement.setDate(6,product.getProMfgDate());
					  preparedStatement.setDate(7,product.getProExpDate());
					  
					  preparedStatement.setBytes(8,product.getProImage());
					  
					  saveResult=preparedStatement.executeUpdate();
					   
				  }
				  catch(SQLException e) {
					  e.printStackTrace();
					  
				  }
				  finally {
					  //before release connection check the connection present or not
					  try{
						  
					     if(connection!=null)
						  connection.close();
					     if(preparedStatement!=null)
							  preparedStatement.close();
				        }
					  catch(SQLException e) {
						  e.printStackTrace();
					  }
				  }
				return saveResult;
				
			}

		public List<Product> findAll()
		{
			List<Product> productList=new ArrayList<>();
			try(Connection connection=Dbconnection.createconnection();
					Statement statement=connection.createStatement())
			{
				ResultSet resultSet=statement.executeQuery("select * from product_data");
				while(resultSet.next())
				{
					Product product=new Product();
					product.setProId(resultSet.getString(1));
					product.setProName(resultSet.getString(2));
					product.setProPrice(resultSet.getDouble(3));
					product.setProBrand(resultSet.getString(4));
					product.setProMadeIn(resultSet.getString(5));
					product.setProMfgDate(resultSet.getDate(6));
					product.setProExpDate(resultSet.getDate(7));
					product.setProImage(resultSet.getBytes(8));;
					productList.add(product);
					
					
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			
			}
			return productList;
		}

	}


