package ui;

public class Burbuja {
	
	public static int[] burbuja(int[] arreglo)
    {
      int auxiliar;
      int[] arregloOrdenado;
      for(int i = 1; i < arreglo.length; i++)
      {
        for(int j = 0;j < arreglo.length-i;j++)
        {
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
    
    public static void main(String[] args) 
    {
      //Valores que tiene el arreglo desordenado.
      int arreglo[] = {8,2,3,6,5,1,9,4,7,10};
      int arregloOrdenado[] = burbuja(arreglo);
 
      //imprimimos el arreglo ordenado.
      for(int i = 0; i < arregloOrdenado.length;i++)
        System.out.println(arregloOrdenado[i]);
    }
}
