function display(value) {
    document.getElementById("result").value += value;
}
 function clearScreen()
 {
    document.getElementById("result").value='';
 }
 function deleteScreen()
 {
    document.getElementById("result").value=document.getElementById("result").value.toString().slice(0,-1);
 }
function calculate() {
    var p = document.getElementById("result").value;
    var q = eval(p);
    document.getElementById("result").value = q;
}