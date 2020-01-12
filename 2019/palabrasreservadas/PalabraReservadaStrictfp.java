package palabrasreservadas;

public class PalabraReservadaStrictfp{
	public static void main(String ... args){
		PalabraReservadaStrictfp a = new PalabraReservadaStrictfp();
		System.out.println("Con Strictfp: "+a.divideSFP(255555555555555555555555555555555555888999999999.203566555, 568996555.236699874111));
		System.out.println("Sin Strictfp: "+a.divide(255555555555555555555555555555555555888999999999.203566555, 568996555.236699874111));
	}

	public strictfp double divideSFP(double a, double b){
		return a/b;
	}

	public double divide(double a, double b){
		return a/b;
	}
}