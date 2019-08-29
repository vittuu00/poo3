
public class Ex_02Main {

	public static void main(String[] args) {

		Ex_02 numeros = new Ex_02();
		
		numeros.setN1(10);
		numeros.setN2(5);
		
		
		if (numeros.getN1() > numeros.getN2()) {
			System.out.println("Os números serão invertidos!");
			int aux2 = numeros.getN1();
			int aux1 = numeros.getN2();
			numeros.setN1(aux1);
			numeros.setN2(aux2);
		}
		
		for(int k = 1;k < numeros.getN2()-numeros.getN1();k++) {
			System.out.print(numeros);
			}			
	}
}
