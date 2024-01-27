alert("Boas vindas ao jogo de adivinhação!");
let numeroMaximo = 5000;
let numeroSecreto = parseInt(Math.random() * numeroMaximo + 1);
console.log(numeroSecreto);
let chute;
let tentativas = 1;

// Enquanto o chute não for igual ao número secreto...
while (chute != numeroSecreto) {
    chute = prompt(`Escolha um número entre 1 e ${numeroMaximo}:`);

    // Se o chute for igual ao número secreto, o usuário acertou
    if (numeroSecreto == chute) {
        break;
    } else {
        if (numeroSecreto > chute) {
            alert(`O número secreto é maior que ${chute}`);
        }
        if (numeroSecreto < chute) {
            alert(`O número secreto é menor que ${chute}`);
        }
    }
    tentativas++;
}

let palavraTentativa = tentativas > 1 ? "tentativas" : "tentativa";
alert(
    `Você descobriu o número secreto ${numeroSecreto} com ${tentativas} ${palavraTentativa}!`
);
