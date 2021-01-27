package ejemplosBasicoJAVA;

public class For {

	public static void main(String[] args) {
		
		
				
		System.out.println("Contando...");
	
		for(int num=1; num<=4; num++){
			System.out.println("\nVamos por el número "+num);
			for(int j=1; j<=3; j++){
				System.out.println("Valor de j "+j);		
			}
		}
		
	
		System.out.println("Fin de la cuenta");
		}
}
