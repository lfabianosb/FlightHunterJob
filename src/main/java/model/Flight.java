package model;

public class Flight {
	private String cia;
	private float valorTotal;
	private float valorSemTaxaServico;
	private String msg;
	private String horaSaidaIda;
	private String horaChegadaIda;
	private String paradasIda;

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public float getValorSemTaxaServico() {
		return valorSemTaxaServico;
	}

	public void setValorSemTaxaServico(float valorSemTaxaServico) {
		this.valorSemTaxaServico = valorSemTaxaServico;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getHoraSaidaIda() {
		return horaSaidaIda;
	}

	public void setHoraSaidaIda(String horaSaidaIda) {
		this.horaSaidaIda = horaSaidaIda;
	}

	public String getHoraChegadaIda() {
		return horaChegadaIda;
	}

	public void setHoraChegadaIda(String horaChegadaIda) {
		this.horaChegadaIda = horaChegadaIda;
	}

	public String getParadasIda() {
		return paradasIda;
	}

	public void setParadasIda(String paradasIda) {
		this.paradasIda = paradasIda;
	}

	@Override
	public String toString() {
		return "Flight [cia=" + cia + ", valorTotal=" + valorTotal + ", valorSemTaxaServico=" + valorSemTaxaServico
				+ ", msg=" + msg + ", horaSaidaIda=" + horaSaidaIda + ", horaChegadaIda=" + horaChegadaIda
				+ ", paradasIda=" + paradasIda + "]";
	}

}
