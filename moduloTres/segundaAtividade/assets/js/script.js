/*
por Tag: getElementByTagName()
por Id: getElementById()
por Nome: getElementsByName()
por Classe: getElementsByClassName()
por Seletor: querySelector()
*/

const nav = document.getElementById('nav');
window.addEventListener('scroll', () => {
    if (window.scrollY >= 100) {
        nav.classList.add('navBlack');
    } else {
        nav.classList.remove('navBlack');
    }
});

let nome = window.document.getElementById('nome');
let email = window.document.getElementById('email');
let assunto = window.document.getElementById('assunto');
let nomeOk = false;
let emailOk = false;
let assuntoOk = false;

function validaNome(){
    let txtNome = document.querySelector('#txtNome');
    if(nome.value.length < 3){
        txtNome.innerHTML = "Nome inválido";
        txtNome.style.color = 'red';
    }else{
        txtNome.innerHTML = "Nome válido";
        txtNome.style.color = 'green';
        nomeOk = true;
    }
}

function validaEmail(){
    let txtEmail = document.querySelector('#txtEmail');
    if(email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1){
        txtEmail.innerHTML = "E-mail inválido";
        txtEmail.style.color = 'red';
    }else{
        txtEmail.innerHTML = "E-mail válido";
        txtEmail.style.color = 'green';
        emailOk = true;
    }
}

function validaAssunto(){
    let txtAssunto = document.querySelector('#txtAssunto');
    if(assunto.value.length >= 150){
        txtAssunto.innerHTML = "Texto muito grande, digite no máximo 150 caracteres ";
        txtAssunto.style.color = 'red';
    }else{
        txtAssunto.innerHTML = "Texto válido";
        txtAssunto.style.color = 'green';
        assuntoOk = true;
    }
}

function enviar(){
    if(nomeOk == true && emailOk == true && assuntoOk == true){
        alert('Enviado com sucesso! :)');
    }else{
        alert('Preencha corretamente os campos antes de envir! :(');
    }
}

