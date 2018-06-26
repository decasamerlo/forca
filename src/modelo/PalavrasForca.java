package modelo;

import java.util.Random;

public class PalavrasForca {
	
	String[] palavras = new String[15];
	String[] dica1 = new String[15];
	String[] dica2 = new String[15];
	String[] dica3 = new String[15];
	

	public String retornoPalavra(int nPalavra){
		
		palavras[0] = "elefante";
		palavras[1] = "coelho";
		palavras[2] = "cachorro";
		palavras[3] = "macaco";
		palavras[4] = "vaca";
		palavras[5] = "vela";
		palavras[6] = "faca";
		palavras[7] = "ventilador";
		palavras[8] = "televisão";
		palavras[9] = "sushi";
		palavras[10] = "strognoff";
		palavras[11] = "Brasil";
		palavras[12] = "Argentina";
		palavras[13] = "circulo";
		palavras[14] = "quadrado";
		palavras[15] = "triangulo";

		
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
		dica1[8] = "Objeto";
		dica1[9] = "Comida";
		dica1[10] = "Comida";
		dica1[11] = "País";
		dica1[12] = "País";
		dica1[13] = "Forma geométrica";
		dica1[14] = "Forma geométrica";
		dica1[15] = "Forma geométrica";
		
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
		dica2[8] = "Vejam coisas em mim!";
		dica2[9] = "Sou do Japão";
		dica2[10] = "Fico bom de qualquer jeito - carne, frango.. ";
		dica2[11] = "Penta campeão mundial, respeita o Pai";
		dica2[12] = "Minha população gosta de visitar Floripa";
		dica2[13] = "Sou gordinho";
		dica2[14] = "Pra baixo, pra frente, eu = Hadouken";
		dica2[15] = "Além de forma geométrica sou um instrumento";
		
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
		dica3[8] = "Em época de copa, tens que ver o jogo em mim..";
		dica3[9] = "E vocês botam cream cheese em mim????";
		dica3[10] = "Sou feito com molho branco normalmente, e uma batatinha palha";
		dica3[11] = "Não basta ser penta, ainda tem que ser o maior país da América Latina";
		dica3[12] = "Maradona > Pelé";
		dica3[13] = "As bolas usam minha forma geométrica";
		dica3[14] = "Cada um no seu... Cada um no seu... (música)";
		dica3[15] = "Quando tu desenhava casinha eu era o telhado";
		
		return dica3[nDica3];
	}
}
