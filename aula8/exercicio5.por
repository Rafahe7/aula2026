programa {
  funcao inicio() {
    inteiro numeros[10]
    para(inteiro i=0;i<10;i++){
      escreva("Digite um número:")
      leia(numeros[i])
    }
    para(inteiro i=9;i>=0;i--){
    escreva(numeros[i], "\n")
  }
}
}