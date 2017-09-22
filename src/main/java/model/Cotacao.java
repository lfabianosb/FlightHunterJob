package model;

public class Cotacao {
	private String cia;
	private String dtIda;
	private String dtVolta;
	private Float valorTotal;
	private Float valorSemTaxaServico;
	private String horaSaidaIda;
	private String horaChegadaIda;
	private String paradasIda;
	private String dataHora;

	public Cotacao() {
	}

	public Cotacao(String cia, String dtIda, String dtVolta, Float valorTotal, Float valorSemTaxaServico,
			String horaSaidaIda, String horaChegadaIda, String paradasIda, String dataHora) {
		this.cia = cia;
		this.dtIda = dtIda;
		this.dtVolta = dtVolta;
		this.valorTotal = valorTotal;
		this.valorSemTaxaServico = valorSemTaxaServico;
		this.horaSaidaIda = horaSaidaIda;
		this.horaChegadaIda = horaChegadaIda;
		this.paradasIda = paradasIda;
		this.dataHora = dataHora;
	}

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public String getDtIda() {
		return dtIda;
	}

	public void setDtIda(String dtIda) {
		this.dtIda = dtIda;
	}

	public String getDtVolta() {
		return dtVolta;
	}

	public void setDtVolta(String dtVolta) {
		this.dtVolta = dtVolta;
	}

	public Float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Float getValorSemTaxaServico() {
		return valorSemTaxaServico;
	}

	public void setValorSemTaxaServico(Float valorSemTaxaServico) {
		this.valorSemTaxaServico = valorSemTaxaServico;
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

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	@Override
	public String toString() {
		return "Cotacao [cia=" + cia + ", dtIda=" + dtIda + ", dtVolta=" + dtVolta + ", valorTotal=" + valorTotal
				+ ", valorSemTaxaServico=" + valorSemTaxaServico + ", horaSaidaIda=" + horaSaidaIda
				+ ", horaChegadaIda=" + horaChegadaIda + ", paradasIda=" + paradasIda + ", dataHora=" + dataHora + "]";
	}

}
