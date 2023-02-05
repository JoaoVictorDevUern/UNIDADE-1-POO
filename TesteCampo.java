package Respostas;
import java.util.Scanner;

public class TesteCampo {
	private String campo;
	public static void main(String[] args) {
		System.out.println("informe a posicao X do Campo: ");
		try (Scanner Posicaobola = new Scanner(System.in)) {
			double pX = Posicaobola.nextDouble();
			System.out.println("informe a posicao Y do Campo");
			double pY = Posicaobola.nextDouble();
			System.out.println("informe a Altura: ");
			double alt = Posicaobola.nextDouble();
			System.out.println("informe a largura: ");
			double lag = Posicaobola.nextDouble();
			System.out.println("Informe a posica X da Bola: ");
			double Px = Posicaobola.nextDouble();
			System.out.println("Informe a posicao Y da Bola: ");
			double Py = Posicaobola.nextDouble();
			System.out.println("Informe o raio da bola: ");
			double Raio = Posicaobola.nextDouble();
			System.out.println("Informe a velocidade horizontal da Bola: ");
			double velhori = Posicaobola.nextDouble();
			System.out.println("Informe a velocidade vertical da Bola: ");
			double velvert = Posicaobola.nextDouble();
			ParOrdenado Pordenado = new ParOrdenado(Px,Py);
			Bola bolaa = new Bola(Pordenado,velhori,velvert,Raio);
			ParOrdenado camp = new ParOrdenado(pX,pY);
			CampoRetangular CampR = new CampoRetangular(camp,alt,lag,bolaa);
			for(double i = 0;i<= 30;i++) {
				CampR.movibola();
				System.out.println(bolaa.toString());
			}
		}
	}
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}

}
