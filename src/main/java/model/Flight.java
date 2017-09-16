package model;

public class Flight {
	private String cia;
	private float valor;
	private String msg;
	private String duracaoIda;
	private String escalas;

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDuracaoIda() {
		return duracaoIda;
	}

	public void setDuracaoIda(String duracaoIda) {
		this.duracaoIda = duracaoIda;
	}

	public String getEscalas() {
		return escalas;
	}

	public void setEscalas(String escalas) {
		this.escalas = escalas;
	}

	@Override
	public String toString() {
		return "Flight [cia=" + cia + ", valor=" + valor + ", msg=" + msg + ", duracaoIda=" + duracaoIda + ", escalas="
				+ escalas + "]";
	}

}
