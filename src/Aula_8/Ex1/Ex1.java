package Aula_8.Ex1;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;
        Empresa E1 = new Empresa("N/A","N/A","N/A",0);

        do {
            System.out.println("EMPRESA                    | CONSULTAR INFO                 | OUTRAS");
            System.out.println("===========================|================================|===========");
            System.out.println("1: Criar empresa           | 6: Automovel Ligeiro           | 0: Sair");
            System.out.println("2: Criar frota             | 7: Taxi                        | 11: Ver dados da empresa");
            System.out.println("3: Mudar Email             | 8: Pesado de Mercadorias       |");
            System.out.println("4: Mudar Codigo postal     | 9: Pesado de Passageiros       |");
            System.out.println("5: Viatura com mais km     | 10: Motociclo                  |");
            System.out.println("Opção:\n");
            opt = sc.nextInt();
            
            switch (opt) {
                case 0:
                    System.out.println("Byeeee!");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Nome da Empresa:");
                    String nome = sc.nextLine();
                    nome = sc.nextLine();
                    System.out.println("Código postal:");
                    String cpostal = sc.nextLine();
                    System.out.println("Email:");
                    String email = sc.nextLine();
                    System.out.println("Nº de viaturas na frota:");
                    int n = sc.nextInt();

                    E1 = new Empresa(nome, cpostal, email, n);

                    System.out.println("Empresa criada com sucesso!");
                    break;
                case 2:
                    E1.createFrota();
                    System.out.println("Frota criada com sucesso!");
                    break;
                case 3:
                    do{
                        System.out.println("Novo email:");
                        email = sc.nextLine();
                        email = sc.nextLine();
                    }while(!(E1.checkEmail(email)));

                    E1.setEmail(email);
                    System.out.println("Email atualizado com sucesso!");
                    break;
                case 4:
                    System .out.println("Novo código postal:\n");
                    cpostal = sc.nextLine();
                    cpostal = sc.nextLine();
                    E1.setCpostal(cpostal);
                    System.out.println("Código postal atualizado com sucesso!");
                    break;
                case 5:
                    System.out.println(E1.maisKm(E1.frota));
                case 6:
                    int option;
                    do{
                        System.out.println("AUTOMOVEL LIGEIRO");
                        System.out.println("1: Mudar matricula");
                        System.out.println("2: Mudar cv");
                        System.out.println("3: Adicionar km da ultima viagem");
                        System.out.println("4: Ver km da viatura");
                        System.out.println("5: Ver informação da viatura");
                        System.out.println("0: Voltar");
                        option = sc.nextInt();

                        ALigeiro A = new ALigeiro("N/A", "N/A", "N/A", 0.0, 0, 0);

                        for (int i = 0; i < E1.frota.size(); i++){
                            if (E1.frota.get(i) instanceof ALigeiro)
                                {A = (ALigeiro) E1.frota.get(i);
                                break;}
                            else{
                                System.out.println("Tipo de viatura não existente na frota!");
                                option = 0;
                            }
                        }

                        switch (option) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("Nova matrícula?");
                                String m = sc.nextLine();
                                m = sc.nextLine();
                                A.setMatricula(m);
                                break;
                            case 2:
                                System.out.println("Potencia?");
                                double c = sc.nextDouble();
                                c = sc.nextDouble();
                                A.setCv(c);
                                break;
                            case 3:
                                System.out.println("Km da ultima viagem?");
                                int km = sc.nextInt();
                                km = sc.nextInt();
                                A.trajeto(km);
                                System.out.println("Km da ultima viagem inseridos com sucesso!");
                                break;
                            case 4:
                                int i = A.ultimoTrajeto(); 
                                int l = A.distanciaTotal(); 
                                System.out.println("Km da ultima viagem: "+ i);
                                System.out.println("Km da viatura: " + l);
                                break;
                            case 5:
                                System.out.println(A.toString());
                                break;
                        }
                    }
                    while(option != 0);
                    break;
                case 7:
                    do{
                        System.out.println("TAXI");
                        System.out.println("1: Mudar matricula");
                        System.out.println("2: Mudar cv");
                        System.out.println("3: Adicionar km da ultima viagem");
                        System.out.println("4: Ver km da viatura");
                        System.out.println("5: Ver informação da viatura");
                        System.out.println("0: Voltar");
                        option = sc.nextInt();

                        Taxi A = new Taxi("N/A", "N/A", "N/A", 0.0, 0, 0, 12345678);

                        for (int i = 0; i < E1.frota.size(); i++){
                            if (E1.frota.get(i) instanceof Taxi)
                                {A = (Taxi) E1.frota.get(i);
                                break;}
                            else{
                                System.out.println("Tipo de viatura não existente na frota!");
                                option = 0;
                            }
                        }

                        switch (option) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("Nova matrícula?");
                                String m = sc.nextLine();
                                m = sc.nextLine();
                                A.setMatricula(m);
                                break;
                            case 2:
                                System.out.println("Potencia?");
                                double c = sc.nextDouble();
                                c = sc.nextDouble();
                                A.setCv(c);
                                break;
                            case 3:
                                System.out.println("Km da ultima viagem?");
                                int km = sc.nextInt();
                                km = sc.nextInt();
                                A.trajeto(km);
                                System.out.println("Km da ultima viagem inseridos com sucesso!");
                                break;
                            case 4:
                                int i = A.ultimoTrajeto(); 
                                int l = A.distanciaTotal(); 
                                System.out.println("Km da ultima viagem: "+ i);
                                System.out.println("Km da viatura: " + l);
                                break;
                            case 5:
                                System.out.println(A.toString());
                                break;
                        }
                    }
                    while(option != 0);
                    break;
                case 8:
                    do{
                        System.out.println("PESADO DE MERCADORIAS");
                        System.out.println("1: Mudar matricula");
                        System.out.println("2: Mudar cv");
                        System.out.println("3: Mudar carga maxima");
                        System.out.println("4: Adicionar km da ultima viagem");
                        System.out.println("5: Ver km da viatura");
                        System.out.println("6: Ver informação da viatura");
                        System.out.println("0: Voltar");
                        option = sc.nextInt();

                        PMercadoria A = new PMercadoria("N/A", "N/A", "N/A", 0.0, 0, 0, 120000.0);

                        for (int i = 0; i < E1.frota.size(); i++){
                            if (E1.frota.get(i) instanceof PMercadoria)
                                {A = (PMercadoria) E1.frota.get(i);
                                break;}
                            else{
                                System.out.println("Tipo de viatura não existente na frota!");
                                option = 0;
                            }
                        }

                        switch (option) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("Nova matrícula?");
                                String m = sc.nextLine();
                                m = sc.nextLine();
                                A.setMatricula(m);
                                break;
                            case 2:
                                System.out.println("Potencia?");
                                double c = sc.nextDouble();
                                c = sc.nextDouble();
                                A.setCv(c);
                                break;
                            case 3:
                                System.out.println("Carga maxima?");
                                double cm = sc.nextDouble();
                                cm = sc.nextDouble();
                                A.setCMax(cm);
                                break; 
                            case 4:
                                System.out.println("Km da ultima viagem?");
                                int km = sc.nextInt();
                                km = sc.nextInt();
                                A.trajeto(km);
                                System.out.println("Km da ultima viagem inseridos com sucesso!");
                                break;
                            case 5:
                                int i = A.ultimoTrajeto(); 
                                int l = A.distanciaTotal(); 
                                System.out.println("Km da ultima viagem: "+ i);
                                System.out.println("Km da viatura: " + l);
                                break;
                            case 6:
                                System.out.println(A.toString());
                                break;
                        }
                    }
                    while(option != 0);
                    break;
                case 9:
                    do{
                        System.out.println("PESADO DE PASSAGEIROS");
                        System.out.println("1: Mudar matricula");
                        System.out.println("2: Mudar cv");
                        System.out.println("3: Mudar lotação maxima");
                        System.out.println("4: Adicionar km da ultima viagem");
                        System.out.println("5: Ver km da viatura");
                        System.out.println("6: Ver informação da viatura");
                        System.out.println("0: Voltar");
                        option = sc.nextInt();

                        PPassageiros A = new PPassageiros("N/A", "N/A", "N/A", 0.0, 0, 0, 120);

                        for (int i = 0; i < E1.frota.size(); i++){
                            if (E1.frota.get(i) instanceof PPassageiros)
                                {A = (PPassageiros) E1.frota.get(i);
                                break;}
                            else{
                                System.out.println("Tipo de viatura não existente na frota!");
                                option = 0;
                            }
                        }

                        switch (option) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("Nova matrícula?");
                                String m = sc.nextLine();
                                m = sc.nextLine();
                                A.setMatricula(m);
                                break;
                            case 2:
                                System.out.println("Potencia?");
                                double c = sc.nextDouble();
                                c = sc.nextDouble();
                                A.setCv(c);
                                break;
                            case 3:
                                System.out.println("Lotação maxima?");
                                int lm = sc.nextInt();
                                lm = sc.nextInt();
                                A.setNPassageiros(lm);
                                break; 
                            case 4:
                                System.out.println("Km da ultima viagem?");
                                int km = sc.nextInt();
                                km = sc.nextInt();
                                A.trajeto(km);
                                System.out.println("Km da ultima viagem inseridos com sucesso!");
                                break;
                            case 5:
                                int i = A.ultimoTrajeto(); 
                                int l = A.distanciaTotal(); 
                                System.out.println("Km da ultima viagem: "+ i);
                                System.out.println("Km da viatura: " + l);
                                break;
                            case 6:
                                System.out.println(A.toString());
                                break;
                        }
                    }
                    while(option != 0);
                    break;
                case 10:
                    do{
                        System.out.println("MOTOCICLO");
                        System.out.println("1: Mudar matricula");
                        System.out.println("2: Mudar cv");
                        System.out.println("3: Adicionar km da ultima viagem");
                        System.out.println("4: Ver km da viatura");
                        System.out.println("5: Ver informação da viatura");
                        System.out.println("0: Voltar");
                        option = sc.nextInt();

                        Motociclo A = new Motociclo("N/A", "N/A", "N/A", 0.0, "N/A");

                        for (int i = 0; i < E1.frota.size(); i++){
                            if (E1.frota.get(i) instanceof Motociclo)
                                {A = (Motociclo) E1.frota.get(i);
                                break;}
                            else{
                                System.out.println("Tipo de viatura não existente na frota!");
                                option = 0;
                            }
                        }

                        switch (option) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("Nova matrícula?");
                                String m = sc.nextLine();
                                m = sc.nextLine();
                                A.setMatricula(m);
                                break;
                            case 2:
                                System.out.println("Potencia?");
                                double c = sc.nextDouble();
                                c = sc.nextDouble();
                                A.setCv(c);
                                break;
                            case 3:
                                System.out.println("Km da ultima viagem?");
                                int km = sc.nextInt();
                                km = sc.nextInt();
                                A.trajeto(km);
                                System.out.println("Km da ultima viagem inseridos com sucesso!");
                                break;
                            case 4:
                                int i = A.ultimoTrajeto(); 
                                int l = A.distanciaTotal(); 
                                System.out.println("Km da ultima viagem: "+ i);
                                System.out.println("Km da viatura: " + l);
                                break;
                            case 5:
                                System.out.println(A.toString());
                                break;
                        }
                    }
                    while(option != 0);
                    break;
                case 11:
                    System.out.println(E1.toString());
            }
        }while (opt != 0);
        sc.close();
    }
    
}
