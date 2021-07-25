package intities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import intities.enuns.NivelTrabalhador;

public class Trabalhador {
    private String nome;
    private NivelTrabalhador nivel;
    private Double salarioBase;
    
    
    private Departamento departamento;
    
    private List<HorasContradadas> contratos=new ArrayList<>();
    
    
    public Trabalhador() {
    	
    }


	public Trabalhador(String nome, NivelTrabalhador nivel, Double slarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = slarioBase;
		this.departamento = departamento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public NivelTrabalhador getNivel() {
		return nivel;
	}


	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}


	public Double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public List<HorasContradadas> getContratos() {
		return contratos;
	}
		
	
	
	
	public void addContrato(HorasContradadas contrato) {
		contratos.add(contrato);
	}
	
    public void removeContrato(HorasContradadas contato) {
    	contratos.remove(contato);
    }
    
    
    public double income(int ano, int mes) {
    	double soma=salarioBase;
    	Calendar cal=Calendar.getInstance();
    	for (HorasContradadas c : contratos) {
    		cal.setTime(c.getData());
    		int c_ano = cal.get(Calendar.YEAR);
    		int c_mes = 1 + cal.get(Calendar.MONTH);
    		if (ano == c_ano && mes==c_mes) {
    			soma+=c.valorTotal();
    		}
    	}
    	return soma;
    }
    
}
