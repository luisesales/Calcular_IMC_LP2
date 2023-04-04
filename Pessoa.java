public class Pessoa {

    // Atributos
    private double peso;
    private double altura;

    // Método para definir o peso
    public void setPeso(double p){
        peso = p;
    }

    // Método para definir a altura
    public void setAltura(double a){
        altura = a;
    }

    // Método para retornar peso
    public double getPeso(){
        return peso;
    }

    // Método para retornar altura
    public double getAltura(){
        return altura;
    }

    // Método para calcular o IMC
    public double calcularIMC(){
        double imc = peso/(altura*altura);
        return imc;
    }

    public String informarIMC(double imc){
        String line;
        if(imc < 18.5){
            line = "Pessoa Abaixo do Peso";
        }
        else if(imc < 25){
            line = "Pessoa com Peso Normal";
        }
        else if(imc < 30){
            line = "Pessoa com Pré-Obesidade";
        }
        else if(imc < 35){
            line = "Pessoa com Obesidade Grau 1";
        }
        else if(imc < 40){
            line = "Pessoa com Obesidade Grau 2";
        }
        else{
            line = "Pessoa com Obesidade Grau 3";
        }
        return line;
    }
}