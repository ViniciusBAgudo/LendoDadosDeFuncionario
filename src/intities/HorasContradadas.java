package intities;

import java.util.Date;

public class HorasContradadas {
	
    private Date data;
    private Double valorporhora;
    private Integer horas;
    
    public HorasContradadas() {
    	
    }

	public HorasContradadas(Date data, Double valorporhora, Integer horas) {
		this.data = data;
		this.valorporhora = valorporhora;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorporhora() {
		return valorporhora;
	}

	public void setValorporhora(Double valorporhora) {
		this.valorporhora = valorporhora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
    
    public double valorTotal() {
    	return valorporhora*horas;
    }
}
