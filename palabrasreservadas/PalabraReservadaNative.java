public class PalabraReservadaNative{
	public static void main(String ... args){
		PalabraReservadaNative a = new PalabraReservadaNative();
		System.out.println("Sumando metodo echo en c: "+a.sumar(1,5));	
	}
	
	public native int sumar(int a, int b);
}