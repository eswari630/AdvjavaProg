<%@page import="com.sathya.servlet.ProductDao" import="java.util.Base64" %>
 <%@ page language="java" contentType="text/html"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html> 
<head> 
           <title>ProductList</title> 
          <!-- Bootstrap CDN link to get the support of Bootstrap--> 
        <link rel="stylesheet" 
        href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"> 
            
  </head> 
 <body> 
          <h1  class="text-success text-center"> List of Products...</h1> 
           
          <a href="add-product.html" class="btn btn-success"> Save Product</a> 
             <div> 
              <input type ="text"  placeholder="search"> 
             </div> 
              
             <div> 
               <c:if test="${saveResult==1}"> 
               <h1 class="text-danger  text-center">Data Inserted Successfully...</h1> 
               </c:if> 
             </div> 
              
             <div> 
              
                 <c:if test="${DeleteResult==1}"> 
                        <h1 class="text-danger text-center"> Data Deleted  Successfully...</h1> 
               </c:if> 
              
              
                   <c:if test="${DeleteResult==0}"> 
                      <h1 class="text-danger text-center"> Data Deletion fail ...</h1> 
               </c:if> 
             </div> 
              
              
  
         <table class= "table table-bordered table-striped"> 
         <thead class ="thead-dark"> 
                   <tr> 
                       <th>Product ID</th> 
                       <th>Product Name</th> 
                       <th>Product Price</th> 
                       <th>Product Brand</th> 
                       <th>Product MadeIn</th> 
                       <th>Manufacture Date</th> 
                       <th>ExpiryDate</th> 
                       <th>Product Image</th> 
                       <th>Actions</th> 
                       <th>Product Audio</th> 
                       <th>Product Video</th> 
                       </tr> 
               </thead> 
               <tbody> 
                    <c:forEach var="product" items="<%=new ProductDao().findAll()%>"> 
                    <tr> 
                         <td>${product.proId}</td>  
                         <td>${product.proName}</td>  
                         <td>${product.proPrice}</td>  
                         <td>${product.proBrand}</td>  
                         <td>${product.proMadein}</td>  
                         <td>${product.mfgDate}</td>  
                         <td>${product.expDate}</td> 
                          
                          
           
                          
                    <td><img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(product.proImage)}"  
                     alt="ProductImage" style="max-width:100px; max-height:100px;"> </td> 
                           
                   <!-- Display audio using audio tag --> 
     <td> 
     <audio controls> 
     <source src="data:audio/mpeg;base64,${Base64.getEncoder().encodeToString(product.proAudio)}" 
      type="audio/mpeg" > 
     </audio> 
     </td> 
      
     <!-- Display video using video tag --> 
     <td> 
     <video controls width="320" height="240"> 
     <source src="data:video/mp4;base64,${Base64.getEncoder().encodeToString(product.proVideo)}" 
     type="video/mp4" > 
     </video> 
     </td> 
                           
                           
                         <td> 
                          <a class="btn btn-primary" 
                          href="./DeleteSevlet?proId=${product.proId}">Delete</a> 
                           
                          <a class="btn btn-primary" 
                           href="./EditServlet?proId=${product.proId}">Edit</a> 
                           
                          </td> 
                       </tr> 
                    </c:forEach>   
                </tbody> 
          </table> 
                    
                        
                        
          
</body> 
</html>