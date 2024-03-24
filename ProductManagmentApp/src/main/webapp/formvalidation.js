function validateform() 
{ 
 //read the form data 
  var proId=document.getElementById("proId").value; 
  var proName=document.getElementById("proName").value; 
  var proPrice=document.getElementById("proPrice").value; 
  var proBrand=document.getElementById("proBrand").value; 
  var Madein=document.getElementById("Madein").value; 
  var MfgDate=document.getElementById("MfgDate").value; 
  var ExpDate=document.getElementById("ExpDate").value; 
  var proImage=document.getElementById("proImage").value; 
   
  if(proId.trim===""||proName.trim===""||proPrice===""||proBrand===""||Madein===""||MfgDate===""||ExpDate===""||proImage===""){ 
   alert("All Fields Must Be Failed Out"); 
   return false; 
   } 
   if(parseFloat(proPrice)<0){ 
    alert("proPrice Must Be Non-neagtive Values"); 
    return false; 
    } 
    if(proName.length>50||proBrand.length>50){ 
    alert("proName And proBrand less Than 50 Characters"); 
    return false; 
   } 
   // Get the Mfg  And Exp Dates 
         var MfgDate=document.getElementById("MfgDate").value; 
                  var ExpDate=document.getElementById("ExpDate").value; 
            
           // Convet into Data Format 
                var ManufacturingDataobj=new Data(MfgDate); 
                var ExpiryDataobj=new Data(ExpDate); 
                 
                //Check the Validation of Dates 
                if(ManufacturingDataobj>ExpiryDataobj) 
                { 
     alert("Manufacturing Date cannot be Greater than Expiry Date"); 
     return false; 
     } 
     return true; 
    }