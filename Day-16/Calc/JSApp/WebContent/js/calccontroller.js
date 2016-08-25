/**
 * Controller is a Glue B/W View and Model (Logic)
 */
window.addEventListener("DOMContentLoaded",init);
function init(){
	var buttonArray = document.getElementsByTagName("button");
	for(var i = 0 ; i<buttonArray.length; i++){
		buttonArray[i].addEventListener("click",doOperation);
	}
	//document.getElementById("add").addEventListener("click",doOperation);
	//document.getElementById("subtract").addEventListener("click",doOperation);
}
function clearData(){
	var firstNo = document.getElementById("firstno").value="";
	var secondNo = document.getElementById("secondno").value="";
	document.getElementById("result").innerHTML = "";
	
}
function doOperation(){
	var result= 0;
	//var operation = this.innerHTML.toUpperCase();
	var operation = this.getAttribute("data-operation");
	console.log("U Click on "+operation);
	var firstNo = document.getElementById("firstno").value;
	var secondNo = document.getElementById("secondno").value;
	if(operation!="clear"){
	result = performOperation(firstNo, secondNo, operation);
		//result = object[operation](firstNo,secondNo);
	}
	else
	if(operation=="clear"){
		clearData();
	}	
	
	//	if(operation==="ADD"){
//		result= add(firstNo,secondNo);
//	}
//	else
//		if(operation==="SUBTRACT"){
//			result= subtract(firstNo,secondNo);
//		}
//		else
//			if(operation==="MULTIPLY"){
//				result= multiply(firstNo,secondNo);
//			}
//			else
//				if(operation==="DIVIDE"){
//					result= divide(firstNo,secondNo);
//				}
//				else
//				if(operation==="CLEAR"){
//					clearData();
//				}	
	
	document.getElementById("result").innerHTML = result;
}

//function addition(){
//	var firstNo = document.getElementById("firstno").value;
//	var secondNo = document.getElementById("secondno").value;
//	var result = add(firstNo,secondNo);
//	document.getElementById("result").innerHTML = result;
//}
//
//function subtraction(){
//	var firstNo = document.getElementById("firstno").value;
//	var secondNo = document.getElementById("secondno").value;
//	var result = subtract(firstNo,secondNo);
//	document.getElementById("result").innerHTML = result;
//}
