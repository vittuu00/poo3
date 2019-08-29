public class Ex_8Main {
	public static void main(String[] args) {
		Ex_8 a = new Ex_8();
	    a.setNome("Pedro");
		a.setAltura(180);
		a.setIdade(18);
		a.setPeso(80);
		a.Envelhecer(20);
		/**
		System.out.println("Altura"+a.getAltura());
		System.out.println("idade "+a.getIdade());
		System.out.println("Nome: "+a.getNome());
		System.out.println("Peso: "+a.getPeso());
		
		System.out.println("-------------####-------------");
		System.out.println("Altura"+a.getAltura());
		System.out.println("idade "+a.getIdade());
		**/
		System.out.println(a);
		a.Envelhecer(20);
		a.Engordar(10);
		System.out.println(a);
		
	}

}
