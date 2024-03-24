function validateForm()
{ //Read the form data
    var proId = document.getElementById("proId").value;
    var proName = document.getElementsById("proName").value;
    var proPrice = document.getElementsById("proPrice").value;
    var proBrand = document.getElementById("proBrand").value;
    var proMadeIn = document.getElementById("proMadeIn").value;
    
    if(proId.trim()=== ""  || proName.trim() === "" || proPrice.trim()=== ""  || proBrand.trim()=== "" || proMadeIn.trim()=== "")
    {
		  alert("All fields must be filled out");
		  return false;
	}
    
    if(parseFloat(proPrice)<0)
    {
		
		alert("proprice must be a non-negative value");
		return false;
	}
	//get the mfg & exp dates
	var proMfgDate = document.getElementById("praMfgdate").value;
	var proExpDate = document.getElementById("proExpDate").value;
	//convert into data format
	var manufacturingDateObj = new Date(pro/mfgDate);
	var expiryDateDateObj = new date(proExpDate);
	//cheak the validation of dates
	if(manufacturingDateObj > expiryDateDateObj)
	{
	alert("manufacturing date cannot be greater than expiry date.");
	return false;	
	}
return true;
}