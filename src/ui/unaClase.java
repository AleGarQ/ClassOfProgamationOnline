package ui;
import java.io.*;

public class unaClase implements Serializable {
	public class Agenda implements Serializable {
		private String nombre;
		private String p_Apellido;
		private transient String s_Apellido;
		
		public Agenda(String nombre, String p_Apellido, String s_Apellido){
		    this.nombre = nombre;
		    this.p_Apellido = p_Apellido;
		    this.s_Apellido = s_Apellido;
		  }
		
	}
}
