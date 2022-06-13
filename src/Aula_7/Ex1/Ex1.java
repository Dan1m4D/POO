package Aula_7.Ex1;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int n;
        double r=1, comp=1, alt=1, l1=1, l2=1,l3=1;
        String cor;
        Scanner sc = new Scanner(System.in);

        Circulo circulo = new Circulo(r);
        Triangulo triangulo = new Triangulo(l1,l2,l3);
        Retangulo retangulo = new Retangulo(alt,comp);


        do{
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.println("Opções: ");
            System.out.println("Circulo:                       | Retangulo                              | Triangulo");
            System.out.println("   1 - Inserir raio.           |   6 - Inserir comprimento e altura.    |   11 - Inserir lados");
            System.out.println("   2 - Calcular area.          |   7 - Calcular area.                   |   12 - Calcular area");
            System.out.println("   3 - Calcular perimetro.     |   8 - Calcular perimetro.              |   13 - Calcular perimetro");
            System.out.println("   4 - Mudar cor.              |   9 - Mudar cor.                       |   14 - Mudar cor.");
            System.out.println("   5 - Ver circlo.             |   10 - Ver retangulo.                  |   15 - Vr triangulo.");
            System.out.println("Opção? ");
            n = sc.nextInt();

            switch(n){
                case 0:
                    System.out.println("----------------------------------");
                    System.out.println("Bye!");
                    break;
                case 1:
                    System.out.println("----------------------------------");
                    System.out.print("Raio: ");
                    r = sc.nextDouble();
                    circulo.setCirculo(r);
                    break;
                case 2:
                    System.out.println(circulo.toString());
                    System.out.printf("Area: %.2f %n", circulo.area());
                    break;
                    case 3:
                    System.out.println(circulo.toString());
                    System.out.printf("Perimetro: %.2f %n", circulo.perimetro());
                    break;
                case 4:
                    System.out.println("----------------------------------");
                    System.out.print("Cor: ");
                    cor = sc.next();
                    circulo.setCor(cor);
                    break;
                case 5:
                    System.out.println(circulo.toString());
                //..............................................
                case 6:
                    System.out.println("----------------------------------");
                    System.out.print("Comprimento: ");
                    comp = sc.nextDouble();
                    System.out.print("Altura: ");
                    alt = sc.nextDouble();
                    retangulo.setRetangulo(comp, alt);
                    break;
                case 7:
                    System.out.println(retangulo.toString());
                    System.out.printf("Area: %.2f %n", retangulo.area());
                    break;
                case 8:
                    System.out.println(retangulo.toString());
                    System.out.printf("Perimetro: %.2f %n", retangulo.perimetro());
                    break;
                case 9:
                    System.out.println("----------------------------------");
                    System.out.print("Cor: ");
                    cor = sc.next();
                    retangulo.setCor(cor);
                    break;
                case 10:
                    System.out.println(retangulo.toString());
                //..............................................
                case 11:
                    System.out.println("----------------------------------");
                    System.out.print("Lado 1: ");
                    l1 = sc.nextDouble();
                    System.out.print("Lado 2: ");
                    l2 = sc.nextDouble();
                    System.out.print("Lado 3: ");
                    l3 = sc.nextDouble();
                    triangulo.setTriangulo(l1, l2, l3);
                    break;
                case 12:
                    System.out.println(triangulo.toString());
                    System.out.printf("Area: %.2f %n", triangulo.area());
                    break;
                case 13:
                    System.out.println(triangulo.toString());
                    System.out.printf("Perimetro: %.2f %n", triangulo.perimetro());
                    break;
                case 14:
                    System.out.println("----------------------------------");
                    System.out.print("Cor: ");
                    cor = sc.next();
                    triangulo.setCor(cor);
                    break;
                case 15:
                    System.out.println(triangulo.toString());    
                default:
                    System.out.println("----------------------------------");
                    System.out.println("Opção inválida!");
                    break;
                }
            }
        while(n!= 0);
        sc.close();
    }
}
