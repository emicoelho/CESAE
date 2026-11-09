const nome = "Emily";
const idade = 33;
const curso = "Software Developer";
const inscrito = false;
console.log(`Me chamo ${nome}.`);
console.log(`Tenho ${idade} anos`);
console.log(`Faço o curso de ${curso}.`);
console.log(`${inscrito}`);

console.log(`===============================`);

//Operações matemáticas
const numero1 = 20;
const numero2 = 6;

console.log(`A soma de ${numero1} + ${numero2} é: ${numero1 + numero2}`);
console.log(`A subtração de ${numero1} - ${numero2} é: ${numero1 - numero2}`);
console.log(`A multiplicação de ${numero1} * ${numero2} é: ${numero1 * numero2}`);
console.log(`A divisão de ${numero1} / ${numero2} é: ${numero1 / numero2}`);
console.log(`O resto da divisão de ${numero1} % ${numero2} é: ${numero1 % numero2}`);

 console.log(`===============================`);   

//Estrutura condicional
const nota = 21;

if (nota < 0 || nota > 20) {
    console.log(`Nota inválida`);
}else if (nota >= 0 && nota <= 9) {
    console.log(`Insuficiente`);
}else if (nota >= 10 && nota <= 13) {
    console.log(`Suficiente`);
} else if (nota >= 14 && nota <= 17) {
    console.log(`Bom`);
} else if (nota >= 18 && nota <= 20) {
    console.log(`Muito bom`);
}

console.log(`===============================`);

for (let i = 0; i <= 10; i++) {
    console.log(`O número atual é: ${i}`);
}

for (let i = 0; i <= 10; i++) {
    if (i % 2 === 0) { //=== significa igual
        console.log(`O número ${i} é par`);
    } else {
        console.log(`O número ${i} é ímpar`);
    }
}

soma = 0;

for (let i = 0; i <= 10; i++) {
    soma = soma + i;
}

console.log(`A soma de todos os números de 0 a 10 é: ${soma}`);

console.log(`===============================`);

//Função
function calcularMedia(nota1, nota2) {
    return (nota1 + nota2) / 2;
}

const media = calcularMedia(14, 18);
console.log(media);

//Exercício função
function ehPar(numero){
    if (numero % 2 === 0) {
        return true;
    }
    return false;
}

function calcularDesconto(preco, porcentagem) {
    return preco - (preco * (porcentagem / 100));
}

//Testes functions

//Cálculo da média
console.log(calcularMedia(10, 20));

//Descobrir se o número é par
console.log(ehPar(8));
console.log(ehPar(7)); 

//Cálculo do desconto
console.log(calcularDesconto(100, 10));

console.log(`===============================`);
//Exercício módulo
const nome1 = "Emily";
const notaTeste = 17.5;
const notaProjeto = 19.3;

function calculaMediaFinal(notaTeste, notaProjeto) {
    return (notaTeste + notaProjeto) / 2;
}

const mediaFinal = calculaMediaFinal(notaTeste, notaProjeto);
console.log(`A média final de ${nome1} é: ${mediaFinal}`);

if (mediaFinal < 0 || mediaFinal > 20) {
    console.log(`Nota inválida`);
}else if (mediaFinal <10) {
    console.log(`Reprovado`);
} else {
    console.log(`Aprovado`);
}

let mediaArredondada = Math.floor(mediaFinal); //Arredonda para baixo

//Tabuada
for (let i = 1; i <= 10; i++) {
    console.log(mediaArredondada * i);
}
