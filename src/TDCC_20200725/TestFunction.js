//測試數列[n1,n2]兩個同為奇數或偶數回傳true

var testSerial = [[1,2],[2,3],[5,7],[8,10]];

function isOdd(num){
	return num%2 !==0;
}
function isEven(num){
	return num%2 ===0;
}
function testNum(x){
	var odd = isOdd(x[0]) && isOdd(x[1]);
	var even = isEven(x[0]) && isEven(x[1]);
	// console.log("odd "+odd);
	// console.log("even "+even);
	return odd? true:even?true:false;
}

console.log(testNum([1,2]));
console.log(testNum([2,4]));
console.log(testNum([5,7]));

