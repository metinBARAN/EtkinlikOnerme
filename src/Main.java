import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int heat;

        Scanner input=new Scanner(System.in);
        System.out.print("Sicaklik Degerini Yaziniz:");
        heat=input.nextInt();

        if(heat<5){
            System.out.println("Kayak Yapabilirsiniz.");

        }else if(heat>=5&&heat<=15) {
            System.out.println("Sinemaya Gidebilirsiniz.");
        }
           else if(heat>15&&heat<25){
                System.out.println("Piknige Gidebilirsiniz");
            }
         else{
            System.out.println("Yuzmeye Gidebilirsiniz");
        }
    }
}
