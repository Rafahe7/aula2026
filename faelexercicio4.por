programa {
  funcao inicio() {
  real notas[5], soma=0.0, media=0.0, maior=0.0, menor=0.0
  para(inteiro i=0; i<5; i++){
    escreva("Digite a nota:")
    leia(notas[i])
    soma = soma+notas[i]
    enquanto(notas[i] <0 ou notas[i] >10){
      escreva("Digite um número válido:")
      leia(notas[i])}
    se(i==0){
      maior=notas[i]
      menor=notas[i]
    }
    senao{
      se(notas[i] > maior){
        maior=notas[i]
      }
      se(notas[i] <menor){
        menor=notas[i]
      }
      }
    }
    media=soma/5.0
    escreva("A média das notas é:", media, "\n")
    escreva("Nota Maior:", maior, "\n")
    escreva("Nota Menor:", menor, "\n")
  }
  }
