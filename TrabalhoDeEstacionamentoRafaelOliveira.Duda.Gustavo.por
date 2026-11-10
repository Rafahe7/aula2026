programa
{
	cadeia vagas[31]
	
	funcao inicio()
	{
		inteiro opcao
		
		faca{
	
			escreva("\n-------MENU--------","\n")
			escreva("1-Entrada de Veículo","\n")
			escreva("2-Saída de Veículo","\n")
			escreva("3-Listar Vagas","\n")
			escreva("4-Sair do programa","\n")
			escreva("Digite a opção: ")
			leia(opcao)

			escolha(opcao){
				caso 1:
					gerenciarEntradas()
					pare
				
				caso 2:
					gerenciarSaida()
					pare
				
				caso 3:
					listarVagas()
					pare
				
				caso 4:
					escreva("Fechando Programa. Até mais!","\n")
					pare
				
				caso contrario:
					escreva("Digite uma opção válida\n")
			}
		
		} enquanto(opcao != 4)
	}

	funcao logico validarNumeroVaga(inteiro numVaga)
	{
		se (numVaga >= 1 e numVaga <= 30)
		{
			retorne verdadeiro
		}
		senao
		{
			retorne falso
		}
	}

	funcao gerenciarEntradas()
	{
		inteiro numVaga
		cadeia placa
		escreva("Digite o número da vaga (1 a 30): ")
		leia(numVaga)

		se (validarNumeroVaga(numVaga))
		{
			se (vagas[numVaga] == "")
			{
				escreva("Digite a placa: ")
				leia(placa)
				vagas[numVaga] = placa 
				escreva("Veículo estacionado na vaga: ", numVaga, "\n")
			}
			senao
			{
				escreva("Erro> A vaga ", numVaga, " já está ocupada pela placa: ", vagas[numVaga], "\n")
			}
		}
		senao
		{
			escreva("Erro: Número de vaga inválido! Escolha entre 1 e 30\n")
		}
	}
	
	funcao gerenciarSaida()
	{	
		inteiro numVaga
		escreva("Digite o número da vaga (1 a 30): ")
		leia(numVaga)

		se (validarNumeroVaga(numVaga))
		{
			se (vagas[numVaga] != "")
			{
				escreva("Veículo placa: ", vagas[numVaga], " retirado da vaga ", numVaga, "\n")
				vagas[numVaga] = ""
			}
			senao
			{
				escreva("Aviso! A vaga ", numVaga, " já está vazia\n")
			}
		}
		senao
		{
			escreva("Erro: Número de vaga inválido! Escolha entre 1 e 30\n")
		}
	}

	funcao listarVagas()
	{
		escreva("----- Lista de Vagas (1 a 30) ------\n")
		
		para (inteiro i = 1; i <= 30; i++)
		{
			se (vagas[i] == "")
			{
				escreva("Vaga ", i, ": [LIVRE]\n")
			}
			senao
			{
				escreva("Vaga ", i, ": [OCUPADA] - Placa: ", vagas[i], "\n")
			}
		}
		escreva("------------------------------------\n")
	}
}
