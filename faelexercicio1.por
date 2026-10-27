programa {
  funcao inicio() {
    inteiro idade, maiores=0, menores=0
    inteiro quantidade = 5
para(inteiro i=1; i<quantidade; i++){
  escreva("idade:")
    leia(idade)
    se(idade >=18){
maiores++
    }senao{
menores++
    }
  }
escreva("Maiores:", maiores)
escreva("Menores:", menores)
}
  }
