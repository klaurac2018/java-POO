package lapto;

public class lapto {
	
	
	private int windows;
	private String marca;
	private int almacenamiento;
	private int numTeclas;
	
	public lapto(int pwindows, String pmarca, int palmacenamiento, int pNumTeclas) {
		
		windows=pwindows;
		marca=pmarca;
		almacenamiento=palmacenamiento;
		numTeclas=pNumTeclas;
		
		
	}
	
 public int getwindows() {
	 return windows;
	
 }
 public void setwindows(int windows) {
	 this.windows=windows;
 }
 public String getmarca() {
	 return marca;
 }
 public void setmarca(String marca) {
	 this.marca=marca;
 }
 public int getAlmacenamiento() {
	return almacenamiento; 
 }
 public void setalmacenamiento(int almacenamiento) {
	 this.almacenamiento=almacenamiento;
 }
 public int getNumTeclas() {
	 return numTeclas;
 }
 public void setNumTeclas(int NumTeclas) {
	 this.numTeclas=NumTeclas;
 }
 
 public String toString() {
	 return "lapto "+marca+" con windows "+windows+""
			 +" capacidad de almacenamiento "+almacenamiento
			 +" tiene "+numTeclas+"teclas";
 }
}
