import java.util.Scanner;
class Ex2{
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    float valor = 0;
    System.out.print("Insira a quantidade de produtos: ");
    int estoque = reader.nextInt();
    for(int i =1;i<=estoque;i++){
      System.out.print("Insira o valor do produto " + i +"º: ");
      valor += reader.nextFloat();
    }
    System.out.println("O valor total é: " + valor);
    System.out.printf("A média de preço dos produtos é: %.2f", valor/estoque);
  }
}