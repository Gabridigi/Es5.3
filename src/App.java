import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input= new Scanner(System.in);
        System.out.println("Inserisci il numero");
        int numero= input.nextInt();
        if (numero<0)
        {
            numero=numero*-1;
            int numCifre = String.valueOf(numero).length();
            if (numCifre>=11)
        {
            System.out.println("Numero maggiore uguale di dieci miliardi");
        }
        else if (numCifre>=10)
        {
            System.out.println("Numero maggiore uguale di un miliardo");
        }
        else if (numCifre>=9)
        {
            System.out.println("Numero maggiore uguale di cento milioni");
        }
        else if (numCifre>=8)
        {
            System.out.println("Numero maggiore uguale di dieci milioni");
        }
        else if (numCifre>=7)
        {
            System.out.println("Numero maggiore uguale di un milione");
        }
        else if (numCifre>=6)
        {
            System.out.println("Numero maggiore uguale di centomila");
        }
        else if (numCifre>=5)
        {
            System.out.println("Numero maggiore uguale di diecimila");
        }
        else if (numCifre>=4)
        {
            System.out.println("Numero maggiore uguale di mille");
        }
        else if (numCifre>=3)
        {
            System.out.println("Numero maggiore uguale di cento");
        }
        else if (numCifre>=2)
        {
            System.out.println("Numero maggiore uguale di dieci");
        }
        else if (numCifre>=1)
        {
            System.out.println("Numero maggiore uguale di zero");
        }
        }
        else
        {
            int numCifre = String.valueOf(numero).length();
            if (numCifre>=11)
        {
            System.out.println("Numero maggiore uguale di dieci miliardi");
        }
        else if (numCifre>=10)
        {
            System.out.println("Numero maggiore uguale di un miliardo");
        }
        else if (numCifre>=9)
        {
            System.out.println("Numero maggiore uguale di cento milioni");
        }
        else if (numCifre>=8)
        {
            System.out.println("Numero maggiore uguale di dieci milioni");
        }
        else if (numCifre>=7)
        {
            System.out.println("Numero maggiore uguale di un milione");
        }
        else if (numCifre>=6)
        {
            System.out.println("Numero maggiore uguale di centomila");
        }
        else if (numCifre>=5)
        {
            System.out.println("Numero maggiore uguale di diecimila");
        }
        else if (numCifre>=4)
        {
            System.out.println("Numero maggiore uguale di mille");
        }
        else if (numCifre>=3)
        {
            System.out.println("Numero maggiore uguale di cento");
        }
        else if (numCifre>=2)
        {
            System.out.println("Numero maggiore uguale di dieci");
        }
        else if (numCifre>=1)
        {
            System.out.println("Numero maggiore uguale di zero");
        }
        }
        
        


    }
}
