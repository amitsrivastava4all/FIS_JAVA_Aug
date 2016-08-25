/**
 * It only contain the Logic
 */
function performOperation(firstNumber,secondNumber,operation){
	var expression = parseInt(firstNumber) + operation + parseInt(secondNumber);
	console.log("Expression is ",expression);
	console.log("Expression type is ",typeof expression);
	return eval(expression);
	
}

// Object Oriented Style
//var object = {
// addTwoNumbers:function(firstnumber,secondnumber){
//	return parseInt(firstnumber) + parseInt(secondnumber);
//	
//},
//
// subtract:function(firstnumber,secondnumber){
//	return firstnumber - secondnumber;
//	
//},
//
// multiply:function(firstnumber,secondnumber){
//	return firstnumber * secondnumber;
//	
//},
//
// divide:function(firstnumber,secondnumber){
//	return firstnumber / secondnumber;
//	
//}
//}

// Functional Style Code
/*
function add(firstnumber,secondnumber){
	return parseInt(firstnumber) + parseInt(secondnumber);
	
}

function subtract(firstnumber,secondnumber){
	return firstnumber - secondnumber;
	
}

function multiply(firstnumber,secondnumber){
	return firstnumber * secondnumber;
	
}

function divide(firstnumber,secondnumber){
	return firstnumber / secondnumber;
	
}*/