package Bucles;
//tenemos una bolsa con 10 bolas y queremos sacar las bolas y quitarlo de la bolsa,no puede haber repetidos
import java.util.Random;
public class Bolsa {
   public static void main(String args[]){
   		int b[] = {1,2,3,4,5,6,7,8,9,10};
   		int b1[]=numerosAleatorios(b);
   		for(int i=0; i<b.length; i++)
   			System.out.print(b1[i]+"-");
    }
   public static int[] numerosAleatorios(int bolsa[]){
  		Random ale=new Random();
  		for(int i=bolsa.length; i>0; i--)
  		{
  			int num_ale=ale.nextInt(i);  
  			bolsa[num_ale]=bolsa[i-1];

  		}
  	return bolsa;
   }

}