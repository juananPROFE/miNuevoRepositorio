package ejemplosBasicoJAVA;

public class ComparacionCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1=new String("zoco");
		String cad2=new String("zasca");
		
		if(cad1.compareTo(cad2)>0)
			System.out.println(cad1+" es mayor que "+cad2);
		else
			System.out.println(cad1+" es menor que "+cad2);
		
	/*	if(cad1.equals(cad2))
			System.out.println("No son iguales");
		else
			System.out.println("Son iguales");
			*/
		
		
	}

}
