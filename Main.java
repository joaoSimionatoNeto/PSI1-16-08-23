import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double peso = 0;
    java.util.Scanner reader = new Scanner(System.in);
    System.out.print("Informe seu sexo (M/F): ");
    char sexo = reader.next().charAt(0);
    System.out.print("\nInforme sua altura: ");
    double  altura = reader.nextDouble();
    if(sexo == 'M'){
      peso = (72.7*altura) - 58;
    }else if(sexo == 'F'){
      peso = (61.1 * altura) - 44.7;
    }
    System.out.printf("Seu peso ideal é: %.1f", peso);
  }
}