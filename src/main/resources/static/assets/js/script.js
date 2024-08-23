let nomeInput = document.getElementById('nome')
let emailInput = document.getElementById('email')
let validarEmail = document.getElementById('validarEmai')
let form = document.getElementById('form')
let telefoneinput = document.getElementById("telefone")
let crachaInput = document.getElementById("cracha")
let validarcracha = document.getElementById("validarcracha")

form.addEventListener("input", function(event){
    event.preventDefault();

    const email = emailInput.value

    //validar
const isValid = validateEmail(email);

if (isValid){
    validarEmai.style.display = 'none'
} else {
    validarEmail.style.display = 'block'
}
});

const validateEmail = (email) =>{
 const regex = /^[^\s]+@[^\s]+\.[^\s]+$/;

 return regex.test(email)
}

telefoneinput.addEventListener('input', function(){

var limparvalor = telefoneinput.value.replace(/\D/g, "").substring(0,11)

var numerosArray= limparvalor.split("")

var numeroFormatado = "";



if(numerosArray.length > 0){
    numeroFormatado += `(${numerosArray.slice(0,2).join("")})`;
}


if(numerosArray.length > 2){
    numeroFormatado += ` ${numerosArray.slice(2,7).join("")}`;
}

if(numerosArray.length > 7){
    numeroFormatado += `-${numerosArray.slice(7,11).join("")}`;
}

telefoneinput.value = numeroFormatado
})