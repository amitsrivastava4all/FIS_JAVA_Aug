/**
 * Created By User
 *
 */
window.addEventListener("DOMContentLoaded",init);
//window.addEventListener("load",init);
function init(){
console.log("Button is "+document.getElementById("greetBt"));
document.getElementById("greetBt").addEventListener("click",greet);
}
function greet(){
	var firstName = document.getElementById("firstname").value;
	var lastName = document.getElementById("lastname").value;
	var message = "Welcome "+initCap(firstName)+" "+initCap(lastName);
	document.getElementById("msg").innerHTML = message;
	document.getElementById("msg").className="red";
	
}


