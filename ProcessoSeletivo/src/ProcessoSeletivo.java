import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe", "Paulo", "Júlia", "Fernando",  "Claúdio", "Márcia", "Bárbara", "Geovana", "Cleber", "Fausto", "Felícia"};
        for(String candidato: candidatos){
            contato(candidato);
        }
    }
        static void contato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu= false;
            do{
                atendeu = atender();
                continuarTentando =!atendeu;

                if (continuarTentando) {
                    tentativasRealizadas++;
                }else{
                    System.out.println("Contato realizado com sucesso");
                }
            }while(continuarTentando && tentativasRealizadas < 3);

            if (atendeu) {
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas);
            }else {
                System.out.println("Conseguimos contato com " + candidato + ", número máximo de tentativas realizadas");
            }
        }

    
        static boolean atender() {
            return new Random().nextInt(3)==1;
        }

    static void imprimirCandidatos () {
        String [] candidatos = {"Felipe", "Paulo", "Júlia", "Fernando",  "Claúdio", "Márcia", "Bárbara", "Geovana", "Cleber", "Fausto", "Felícia"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int i=0; i < candidatos.length; i++){
            System.out.println("O candidato de n° " + (i+1) + " é o " + candidatos[i]);
        }
    }

    static void selecaoCandidatos () {
        String [] candidatos = {"Felipe", "Paulo", "Júlia", "Fernando",  "Claúdio", "Márcia", "Bárbara", "Geovana", "Cleber", "Fausto", "Felícia"};

        int candidatosSelecionados = 0;

        int candidatoAtual = 0;

        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o valor de salário de : " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para está vaga.");
                candidatosSelecionados++;
            } else{
                System.out.println("O candidato " + candidato + " não foi selecionado para está vaga.");
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido () {
        return ThreadLocalRandom.current().nextDouble(1500, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidadato");
        }else if ( salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidado com outra proposta");
        }else {
            System.out.println("Aguardando mais candidatos");
        }
    }
}
