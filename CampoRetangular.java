package Respostas;

public class CampoRetangular {
	private ParOrdenado campo;
	private double comprimento,altura;
	private Bola movibola;
	public CampoRetangular(ParOrdenado psuperioresqdcampo, double comprimento, double altura, Bola movibola) {
		this.campo = psuperioresqdcampo;
		this.comprimento = comprimento;
		this.altura = altura;
		this.movibola = movibola;
	}
	public ParOrdenado getPsuperioresqdcampo() {
		return campo;
	}


	public double getComprimento() {
		return comprimento;
	}


	public double getAltura() {
		return altura;
	}


	public Bola getMovibola() {
		return movibola;
	}


	public boolean bolasup() {
		if(altura/2 <= movibola.getPosicaodabola().getX() + movibola.getRaiobola())
			return true;
		return false;
	}
	public boolean bolainf() {
		if(-altura/2 >= movibola.getPosicaodabola().getX() + movibola.getRaiobola())
			return true;
		return false;
	}
	public boolean bolaesq() {
		if(-comprimento/2 >= movibola.getPosicaodabola().getY() + movibola.getRaiobola())
			return true;
		return false;
	}
	public boolean boladir() {
		if(comprimento/2 <= movibola.getPosicaodabola().getY() + movibola.getRaiobola())
			return true;
		return false;
	}
	public void movibola() {
		if(bolasup()) {
			movibola.setVelocidadevert(-1 * movibola.getVelocidadevert());
		}
		else if(bolaesq()) {
			movibola.setVelocidadehori(-1 * movibola.getVelocidadehori());
	    }
		else if(bolainf()) {
			movibola.setVelocidadevert(-1 * movibola.getVelocidadevert());
		}
		else if(boladir()) {
			movibola.setVelocidadehori(-1 * movibola.getVelocidadehori());
		}
		movibola.movimenta();
	}

}
