package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import intities.Departamento;
import intities.HorasContradadas;
import intities.Trabalhador;
import intities.enuns.NivelTrabalhador;

public class Prtogram {

	public static void main(String[] args) throws ParseException {
		
    
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("entre com o nome do departamento:");
		String nomeDoDepartamento=sc.nextLine();
		System.out.println("entre com os dados do funcionario");
		System.out.print("nome: ");
		String nome=sc.nextLine();
		System.out.print("nivel: ");
		String nivelTrabalhado=sc.nextLine();
		System.out.print("salario base: ");
		double salariobase = sc.nextDouble();
		
		Trabalhador trabalhador=new Trabalhador(nome, NivelTrabalhador.valueOf(nivelTrabalhado), salariobase, new Departamento(nomeDoDepartamento));
		
		System.out.println("quantos contratos ele tem?");
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.println("entre com os dados do contrato "+i+" data: ");
			System.out.print("data (DD/MM/YYYY): ");
			Date dataDoContrato= sdf.parse(sc.next());
			System.out.print("valor por hora: ");
			double valorporhora=sc.nextDouble();
			System.out.print("duração: ");
			int horas=sc.nextInt();
			HorasContradadas contrato=new HorasContradadas(dataDoContrato,valorporhora,horas);
			
			trabalhador.addContrato(contrato);
		}
		System.out.println();
		System.out.println("entre com o mes e ano (MM/yyyy)");
		String mesEAno=sc.next();
		int mes=Integer.parseInt(mesEAno.substring(0,2));
		int ano=Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("nome: "+trabalhador.getNome());
		System.out.println("departamento: "+trabalhador.getDepartamento().getNome());
		System.out.println("ganho em "+mesEAno+": "+String.format("%.2f", trabalhador.income(ano, mes)));
		
		sc.close();
		
	}

}
