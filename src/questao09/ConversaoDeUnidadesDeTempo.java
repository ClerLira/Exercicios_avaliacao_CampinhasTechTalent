package questao09;

public class ConversaoDeUnidadesDeTempo {

	public static double minutoParaSegundos (double minutos) {
		double segundos = minutos * 60;
		return segundos;  
	}
	public static double horaParaMinutos (double hora) {
		double minutos = hora * 60;
		return minutos;  
	}
	public static double diaParaHora (double dia) {
		double hora = dia * 24;
		return hora;  
	}
	public static double semanaParaDias (double semana) {
		double dias = semana * 7;
		return dias;  
	}
	public static double mesParaDias (double mes) {
		double dias = mes * 30;
		return dias;	
	}
	public static double anoParaDias (double ano) {
		double dias = ano * 365;
		return dias;	
	}
	
}
