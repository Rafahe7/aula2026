programa {
  funcao inicio() {
    cadeia nomesTimes[8], campeao="", lanterna=""
    inteiro pontuacao[8], maisPontos=0, menosPontos=100
    para(inteiro i=0; i<8; i++){
      escreva("Nome do time:")
      leia(nomesTimes[i])
      escreva("Pontuação:")
      leia(pontuacao[i])
    se(pontuacao[i] > maisPontos){
      maisPontos=pontuacao[i]
      campeao = nomesTimes[i]
      }
    se(pontuacao[i] < menosPontos){
      menosPontos=pontuacao[i]
      lanterna = nomesTimes[i]
      }
      }
      escreva("Campeão:",campeao,"Total de Pontos:", maisPontos)
      escreva("\n Lanterna:", lanterna, "Total de Pontos:", menosPontos)
  }
}