let titulo = document.querySelector("h1");
titulo.innerHTML = "Hora do Desafio";

function botaoConsole() {
    console.log("O botão foi clicado");
}

function botaoAlert() {
    alert("Eu amo JS");
}

function botaoPrompt() {
    let cidade = prompt("Qual a sua cidade?");
    alert(`Estive em ${cidade} e lembrei de você`);
}

function botaoSoma() {
    let numero1 = parseInt(prompt("Digite um número inteiro a ser somado:"));
    let numero2 = parseInt(prompt("Digite outro número inteiro a ser somado:"));

    soma = numero1 + numero2;

    alert(`A soma entre ${numero1} e ${numero2} é ${soma}`);
}
