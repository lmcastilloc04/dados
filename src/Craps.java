import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.random;

public class craps {

    public static void main(String[] args) {
        int die1=0;
        int die2=0;
        int total=0;
        int point=0;
        Scanner scanner = new Scanner(System.in);
        Random numbers = new Random();

        System.out.println("Para iniciar el juego oprima 1");
        if (scanner.nextInt()==1){
            die1= numbers.nextInt(6)+1;
            System.out.println("Su primer dado saco: "+die1);
            die2= numbers.nextInt(6)+1;
            System.out.println("Su segundo dado saco: "+die2);
            total=die1+die2;
            System.out.println("La suma de su lanzamiento fue: "+ total);
        }
        if (total==7 || total==11){
            System.out.println("GANASTE!!!");
        }else if(total == 2 || total == 3 || total ==12){
            System.out.println("CRAPS!!! La casa gana");
        }else{
            point=total;
            total=0;
            boolean flag = true;
            System.out.println("Tu punto es: "+ point);
            while (point!=total || total!=7){
                total=0;
                die1= numbers.nextInt(6)+1;
                System.out.println("Su primer dado saco: "+die1);
                die2= numbers.nextInt(6)+1;
                System.out.println("Su segundo dado saco: "+die2);
                total=die1+die2;
                System.out.println("total= "+ total);
                System.out.println("point=" + point);
            }
        }
    }

}