
public class Run {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Darcio Silva");
		funcionario.setCpf("0101010101");
		funcionario.setSalario(2000);
		
		
		Gerente gerente = new Gerente();
		gerente.setNome("Juliano Santos");
		gerente.setCpf("0202020202");
		gerente.setSalario(4000);
		
		Estagiario estagiario = new Estagiario();
		estagiario.setNome("Fabiano almeida");
		estagiario.setCpf("0303030303");
		estagiario.setSalario(500);
		
		//print plr
		System.out.println("PLR do funcionario: "+funcionario.getPLR());
		System.out.println("PLR do Gerente: "+gerente.getPLR());
		System.out.println("PLR do estagiario: "+estagiario.getPLR());
		
		System.out.println();
		//obs: o calculo das ferias foi tomado uma formula que não representa a realidade
		System.out.println("Calcular ferias do funcionario: "+funcionario.calcularFerias(12));
		System.out.println("Calcular ferias do Gerente: "+gerente.calcularFerias(12));
		System.out.println("Calcular ferias do estagiario: "+estagiario.calcularFerias(12));
		
		
	}
	
	
}
