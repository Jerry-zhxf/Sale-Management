function onclick1() {
	var num = aa.num.value;
	var num1 = aa.num1.value;
	var select = aa.symbol.value;
	switch (parseInt(select)) {
	case 0 :
		document.getElementById("tid").innerHTML = parseFloat(num) + parseFloat(num1);
		break;
	case 1 :
		document.getElementById("tid").innerHTML = parseFloat(num) - parseFloat(num1);
		break;
	case 2 :
		document.getElementById("tid").innerHTML = parseFloat(num) * parseFloat(num1);
		break;
	case 3 :
		document.getElementById("tid").innerHTML = parseFloat(num) / parseFloat(num1);
		break;
	}
	
}