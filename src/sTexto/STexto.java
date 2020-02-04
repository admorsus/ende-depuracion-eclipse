package sTexto;

/**
 * Wrapper class for string
 * @author Miguel Bautista
 *
 */
public class STexto {

	private int smax;
	private String content;
	
	
	public STexto(int smax, String text) {
		this.smax = smax;
		setContent(text);
	}
	
	public STexto(int smax) {
		this.smax = smax;
		this.content = new String();
	}
	
	public void aCabeza (String text) {
		if (text.length() + content.length() <= smax) {
			content = new String(text + content);
		} else {
			mostrarSetError();
		}
	}
	
	public void aCola (String text) {
		if (text.length() + content.length() <= smax) {
			content = new String(content + text);
		} else {
			mostrarSetError();
		}
	}
	
	public void setContent(String text) {
		if (text.length() <= smax) {
			content = text;
		} else {
			mostrarSetError();
		}
	}

	public void setMax(int smax) {
		this.smax = smax;
	}
	
	public String getContent() {
		return content;
	}

	public void mostrar () {
		System.out.println(content);
	}
	
	private void mostrarSetError() {
		System.out.println("ERROR:\tSe ha alcanzado el tamaño máximo de " + smax + " carácteres.");
		System.out.println("\tNo se realiza la operación.");
	}

	
	public static void main(String[] args) {
		STexto te1 = new STexto(10, "asdfghjkl");
		te1.mostrar();
		te1.aCabeza("hola");
		te1.mostrar();
		
		STexto te2 = new STexto(50, "F");
		te2.aCabeza(te1.getContent());
		te2.aCola("0987654");
		te2.mostrar();
		
	}
}
