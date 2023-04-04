import java.util.Scanner;

public class CalcularIMCView{
    public static void main(String args[]){
        Pessoa p = new Pessoa();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o Peso: ");
        p.setPeso(scan.nextDouble());

        System.out.print("Digite a Altura: ");
        p.setAltura(scan.nextDouble());

        System.out.println("Peso   => " + p.getPeso());
        System.out.println("Altura => " + p.getAltura());
        System.out.print("IMC = ");
        
        double imc = p.calcularIMC();
        System.out.println(String.format("%.2f",imc) + "\n" + p.informarIMC(imc));
    }

}