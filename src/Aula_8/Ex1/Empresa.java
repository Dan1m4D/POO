package Aula_8.Ex1;
import java.util.Scanner;
import java.util.ArrayList;

public class Empresa {
    private String nome, cpostal, email;
    private int nveiculos;
    private Scanner sc = new Scanner(System.in);
    private Veiculo v1;
    
    public ArrayList <Veiculo> frota = new ArrayList <>();

    public Empresa(String nome, String cpostal, String email, int nveiculos) {
        this.nome = nome;
        this.cpostal = cpostal;
        this.email = email;
        this.nveiculos = nveiculos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpostal(String cpostal) {
        this.cpostal = cpostal;
    }
    
    public Boolean checkEmail(String email) {
        String e = email.trim();
        if (e.indexOf("@") == -1){
            System.out.println("Email inválido!");
            return false;
        }
        else
            return true;
    }

    public void setEmail(String email) { 
        this.email = email;   
    }
    
    public void setNVeiculos(int nVeiculos) {
        this.nveiculos = nVeiculos;
    }

    public String getName() {return this.nome;}
    public String getCPostal() {return this.cpostal;}
    public String getEmal() {return this.email;}
    public int getNVeiculos() {return this.nveiculos;}

    public ArrayList<Veiculo> createFrota (){
        for (int i=0; i<this.nveiculos; i++) {
            System.out.println("TIPO DE VEÍCULO?");
            System.out.println("1: Automovel Ligeiro");
            System.out.println("2: Taxi");
            System.out.println("3: Motociclo");
            System.out.println("4: Pesado de Mercadorias");
            System.out.println("5: Pesado de Passageiros");
            int opt = sc.nextInt(); 

            switch(opt) {
                case 1:
                    System.out.println("Matricula?");
                    String matricula = sc.nextLine();
                    matricula = sc.nextLine();
                    System.out.println("Marca?");
                    String marca = sc.nextLine();
                    System.out.println("Modelo?");
                    String modelo = sc.nextLine();
                    System.out.println("Potencia?");
                    Double cv = sc.nextDouble();
                    System.out.println("Nº Quadro?");
                    int nQuadro = sc.nextInt();
                    System.out.println("Capacidade de Bagageira?");
                    double c = sc.nextDouble();

                    v1 = new ALigeiro(matricula, marca, modelo, cv, nQuadro, c);
                    frota.add(v1);
                    break;
                case 2:
                    System.out.println("Matricula?");
                    matricula = sc.nextLine();
                    matricula = sc.nextLine();
                    System.out.println("Marca?");
                    marca = sc.nextLine();
                    System.out.println("Modelo?");
                    modelo = sc.nextLine();
                    System.out.println("Potencia?");
                    cv = sc.nextDouble();
                    System.out.println("Nº Quadro?");
                    nQuadro = sc.nextInt();
                    System.out.println("Capacidade de Bagageira?");
                    c = sc.nextDouble();
                    System.out.println("Nº Licença?");
                    int nL = sc.nextInt();

                    v1 = new Taxi(matricula, marca, modelo, cv, nQuadro, c, nL);
                    frota.add(v1);
                    break;
                case 3:
                    System.out.println("Matricula?");
                    matricula = sc.nextLine();
                    matricula = sc.nextLine();
                    System.out.println("Marca?");
                    marca = sc.nextLine();
                    System.out.println("Modelo?");
                    modelo = sc.nextLine();
                    System.out.println("Potencia?");
                    cv = sc.nextDouble();
                    System.out.println("Tipo?");
                    String tipo = sc.nextLine();

                    v1 = new Motociclo(matricula, marca, modelo, cv, tipo);
                    frota.add(v1);
                    break;
                case 4:
                    System.out.println("Matricula?");
                    matricula = sc.nextLine();
                    matricula = sc.nextLine();
                    System.out.println("Marca?");
                    marca = sc.nextLine();
                    System.out.println("Modelo?");
                    modelo = sc.nextLine();
                    System.out.println("Potencia?");
                    cv = sc.nextDouble();
                    System.out.println("Nº Quadro?");
                    nQuadro = sc.nextInt();
                    System.out.println("Peso?");
                    double p = sc.nextDouble();
                    System.out.println("Carga maxima?");
                    double cm = sc.nextDouble();

                    v1 = new PMercadoria(matricula, marca, modelo, cv, nQuadro, p, cm);
                    frota.add(v1);
                    break;
                case 5:
                    System.out.println("Matricula?");
                    matricula = sc.nextLine();
                    matricula = sc.nextLine();
                    System.out.println("Marca?");
                    marca = sc.nextLine();
                    System.out.println("Modelo?");
                    modelo = sc.nextLine();
                    System.out.println("Potencia?");
                    cv = sc.nextDouble();
                    System.out.println("Nº Quadro?");
                    nQuadro = sc.nextInt();
                    System.out.println("Peso?");
                    p = sc.nextDouble();
                    System.out.println("Lotação maxima?");
                    int l = sc.nextInt();

                    v1 = new PPassageiros(matricula, marca, modelo, cv, nQuadro, p, l);
                    frota.add(v1);
                    break;
            }
        }

        return frota;
    }

    public String maisKm(ArrayList<Veiculo> frota){
        int max = 0, chosen = 0;

        for (int i = 0; i < frota.size(); i++){
            if (frota.get(i).distanciaTotal() > max)
                chosen = i;   
        }
        
        return "Viatura com mais km percoridos:\n" + frota.get(chosen).toString();
    }

    @Override
    public String toString() {
        String msg = "";
        msg += String.format("EMPRESA\n========================\nNome: %s\nCódigo postal: %s\nEmail: %s\n---------------------------------------\nFROTA\n=====================================\n", this.nome, this.cpostal, this.email);
        for (int i = 0; i < frota.size(); i++) {
            if (frota.get(i) == null)
                return "Frota não existente!";
            else
                msg += frota.get(i).toString() + "\n";
        }
        return msg;
    }

}
