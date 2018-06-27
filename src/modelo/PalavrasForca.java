package modelo;

public class PalavrasForca {
	
	String[] palavras = new String[15];
	String[] dica1 = new String[15];
	String[] dica2 = new String[15];
	String[] dica3 = new String[15];
	

	public String retornoPalavra(int nPalavra){
		
		palavras[0] = "ELEFANTE";
		palavras[1] = "COELHO";
		palavras[2] = "CACHORRO";
		palavras[3] = "MACACO";
		palavras[4] = "VACA";
		palavras[5] = "VELA";
		palavras[6] = "FACA";
		palavras[7] = "VENTILADOR";
		palavras[8] = "SUSHI";
		palavras[9] = "STROGONOFF";
		palavras[10] = "BRASIL";
		palavras[11] = "ARGENTINA";
		palavras[12] = "CIRCULO";
		palavras[13] = "QUADRADO";
		palavras[14] = "TRIANGULO";

		
		return palavras[nPalavra];
	}
	
	public String retornoDica1(int nDica1){
		dica1[0] = "Animal";
		dica1[1] = "Animal";
		dica1[2] = "Animal";
		dica1[3] = "Animal";
		dica1[4] = "Animal";
		dica1[5] = "Objeto";
		dica1[6] = "Objeto";
		dica1[7] = "Objeto";
		dica1[8] = "Comida";
		dica1[9] = "Comida";
		dica1[10] = "País";
		dica1[11] = "País";
		dica1[12] = "Forma geométrica";
		dica1[13] = "Forma geométrica";
		dica1[14] = "Forma geométrica";
		
		return dica1[nDica1];
	}
	
	public String retornoDica2(int nDica2){
		
		dica2[0] = "Um animal grande";
		dica2[1] = "Cenoura lembra me lembra!";
		dica2[2] = "Melhor amigo do homem";
		dica2[3] = "Vivo pendurado em árvores";
		dica2[4] = "Leite sai de mim";
		dica2[5] = "Minha cabeça pega fogo!";
		dica2[6] = "Eu corto as coisa pra você";
		dica2[7] = "Faço um ventinho gostoso";
		dica2[8] = "Sou do Japão";
		dica2[9] = "Fico bom de qualquer jeito - carne, frango.. ";
		dica2[10] = "Penta campeão mundial, respeita o Pai";
		dica2[11] = "Minha população gosta de visitar Floripa";
		dica2[12] = "Sou gordinho";
		dica2[13] = "Pra baixo, pra frente, eu = Hadouken";
		dica2[14] = "Além de forma geométrica sou um instrumento";
		
		return dica2[nDica2];
		
	}
	
	public String retornoDica3(int nDica3){
		
		dica3[0] = "Animal com uma tromba";
		dica3[1] = "Além de ser ícone da páscoa";
		dica3[2] = "Au-au";
		dica3[3] = "Banana é o que eu gosto!";
		dica3[4] = "Muuuuuuu";
		dica3[5] = "Vocês só me usam quando acaba a luz!";
		dica3[6] = "Mas a minha melhor hora é cortando a picanha";
		dica3[7] = "Você me trocou pelo ar-condicionado...";
		dica3[8] = "E vocês botam cream cheese em mim????";
		dica3[9] = "Sou feito com molho branco normalmente, e uma batatinha palha";
		dica3[10] = "� o maior país da América Latina";
		dica3[11] = "Maradona > Pelé";
		dica3[12] = "As bolas usam minha forma geométrica";
		dica3[13] = "Cada um no seu... Cada um no seu... (música)";
		dica3[14] = "Quando tu desenhava casinha eu era o telhado";
		
		return dica3[nDica3];
	}
}
