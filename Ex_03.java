
public class Ex_03 {

	private int n1;
	private int n2;
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public int adicao() {
		return n1 + n2;	
	}
	
	public int subtracao() {
		return n1 - n2;
	}
	
	public int multiplicacao() {
		return n1*n2;
	}
	
	public double divisao() {
		return (double)n1/n2;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Opera��o de adi��o (n1+n2):");
		builder.append(adicao()+" \n");
		builder.append("Opera��o de subtra��o (n1-n2):");
		builder.append(subtracao()+" \n");
		builder.append("Opera��o de multiplica��o (n1*n2):");
		builder.append(multiplicacao()+" \n");
		builder.append("Opera��o de divis�o (n1/n2):");
		builder.append(divisao()+" \n");
		return builder.toString();
	}
	
	
}
