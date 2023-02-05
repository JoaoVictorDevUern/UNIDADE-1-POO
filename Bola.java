package Respostas;

public class Bola {
	ParOrdenado posicaodabola;
	private double velocidadehori;
	private double velocidadevert;
	final private double raiobola;

	public Bola(ParOrdenado posicaodabola, double velocidadehori, double velocidadevert, double raiobola) {
		super();
		this.posicaodabola = posicaodabola;
		this.velocidadehori = velocidadehori;
		this.velocidadevert = velocidadevert;
		this.raiobola = raiobola;
	}
	public void setVelocidadehori(double velocidadehori) {
		this.velocidadehori = velocidadehori;
	}
	public void setVelocidadevert(double velocidadevert) {
		this.velocidadevert = velocidadevert;
	}
	public ParOrdenado getPosicaodabola() {
	return posicaodabola;
	}
	public double getVelocidadehori() {
	return velocidadehori;
	}
	public double getVelocidadevert() {
	return velocidadevert;
	}
	public double getRaiobola() {
	return raiobola;
	}	
	public void movimenta() {
		double movibola = posicaodabola.getX() + velocidadehori;
		posicaodabola.setX(movibola);
		movibola = posicaodabola.getY() + velocidadevert;
		posicaodabola.setY(movibola);
	}

	public String toString() {
		return "A bola vai da posicao "+ this.posicaodabola.toString()+ "se move a velocidade ("+(velocidadehori)+","+(velocidadevert)+") pixels por movimento";
	}

}
