package lapto;

public class ejercicio {

	public static void main(String[]args) {
		lapto lapto1=new lapto(8, "marca1",1024, 86);
		lapto lapto2=new lapto(10, "marca2",10024, 90);
		
		System.out.println(lapto1.toString());
		System.out.println(lapto2.toString());
		
		lapto1.setNumTeclas(87);
		if(lapto1.getNumTeclas()>lapto2.getNumTeclas()) {
			System.out.println(lapto1.getmarca()+"tiene mas teclas");
		}else {
			System.out.println(lapto2.getmarca()+"tiene mas teclas");
		}
	}
}
