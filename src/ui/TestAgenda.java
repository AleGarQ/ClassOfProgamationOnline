package ui;
import java.io.*;

public class TestAgenda {
	public static void main(String[] args){
		  Agenda a1 = new Agenda("Ana", "Martínez", "Fernández");
		  Agenda a2 = new Agenda("Ernesto", "García", "Pérez");
		  try{
		    FileOutputStream fs = new FileOutputStream("agenda.txt");//Creamos el archivo
		    ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
		    os.writeObject(a1);//El método writeObject() serializa el objeto y lo escribe en el archivo
		    os.writeObject(a2);
		    os.close();//Hay que cerrar siempre el archivo
		  }catch(FileNotFoundException e){
		    e.printStackTrace();
		  }catch(IOException e){
		    e.printStackTrace();
		  }
		  try{
			  FileInputStream fis = new FileInputStream("agenda.txt");
			  ObjectInputStream ois = new ObjectInputStream(fis);
			  a1 = (Agenda) ois.readObject();//El método readObject() recupera el objeto
			  a2 = (Agenda) ois.readObject();
			  ois.close(); fis.close();
			}catch(FileNotFoundException e){
			  e.printStackTrace();
			}catch(IOException e){
			  e.printStackTrace();
			}catch(ClassNotFoundException e){
			  e.printStackTrace();
			}
}
}	
	