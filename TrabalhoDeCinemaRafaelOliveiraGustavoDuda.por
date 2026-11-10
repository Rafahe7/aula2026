programa
{
	inteiro assentos[10][12]
	inteiro fileira=0
	inteiro col=0
	
	funcao inicio()
	{
		zerarAssentos()
		reservar()
	}
	
	funcao zerarAssentos()
	{	
	 		para(inteiro linha=0;linha<10;linha++)
	 		{
				para(inteiro coluna=0;coluna<12;coluna++)
				{
				assentos[linha][coluna]=0
	    			}
	  		}
     }
	
	funcao reservar()
	{
			faca
			{		
			escreva("\nEscolha a fileira (0 a 9) ou negativo para sair: ","\n")
			leia(fileira)
		
				se(fileira<0){
				pare
				}
				escreva("Escolha a coluna (0 a 11):", "\n")
				leia(col)
				
					se(fileira<0 ou fileira>9 ou col<0 ou col>11){
					escreva("\n[CRITICA] Assento inexistente! Digite fileira de 0 a 9 e coluna de 0 a 11")
					}
						senao se(assentos[fileira][col]==1){
						escreva("\nAssento já está reservado\n")
		
							}senao{
							assentos[fileira][col]=1
							escreva("\nAssento reservado com sucesso\n")	
							 
							 exibirMatriz()	
			}
	}enquanto(fileira>=0)
	}
		
		funcao exibirMatriz()
		{
			para(inteiro linha=0;linha<10;linha++){
				para(inteiro coluna=0;coluna<12;coluna++){
					escreva(assentos[linha][coluna], " ")
					}
					escreva("\n")
				}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 30; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {assentos, 3, 9, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
