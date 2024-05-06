import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

    }

    static void imprimirCandidatos () {
        String [] candidatos = {"Felipe", "Paulo", "Júlia", "Fernando",  "Claúdio", "Márcia", "Bárbara", "Geovana", "Cleber", "Fausto", "Felícia"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int i=0; i < candidatos.length; i++){
            
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
