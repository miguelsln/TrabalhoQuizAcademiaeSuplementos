import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: Miguel Solon Augusto Lemes de Almeida jjjjhh");
        System.out.println("Professor: Brenno Pimenta da Costa");
        System.out.println("Faculdade: UNIFAN - Centro Universitário Alfredo Nasser");
        System.out.println("Tema: Academia e Suplementos");
        System.out.println();

        List<Questao> questoes = new ArrayList<>();

        int acertos = 0;

        questoes.add(new Questao("1) Qual é um dos principais objetivos da musculação?",
                "Melhorar apenas a flexibilidade",
                "Aumentar força e desenvolver a musculatura",
                "Diminuir a capacidade respiratória",
                "Reduzir a mobilidade do corpo",
                "Aumentar somente a velocidade",
                'B'));

        questoes.add(new Questao("2) Qual suplemento é conhecido por fornecer aminoácidos importantes para a construção muscular?",
                "Whey Protein",
                "Cafeína",
                "Ômega 3",
                "Multivitamínico",
                "Eletrólitos",
                'A'));

        questoes.add(new Questao("3) Qual é a principal função da creatina?",
                "Aumentar a hidratação da pele",
                "Fornecer energia para esforços de alta intensidade",
                "Substituir todas as refeições",
                "Reduzir permanentemente a frequência cardíaca",
                "Aumentar a flexibilidade",
                'B'));

        questoes.add(new Questao("4) O que é o whey protein?",
                "Um suplemento à base de proteína do leite",
                "Um suplemento exclusivamente de carboidratos",
                "Um tipo de vitamina",
                "Um medicamento para emagrecimento",
                "Um suplemento de fibras",
                'A'));

        questoes.add(new Questao("5) Qual nutriente é uma importante fonte de energia para os exercícios?",
                "Carboidrato",
                "Água",
                "Cálcio",
                "Ferro",
                "Sódio",
                'A'));

        questoes.add(new Questao("6) Qual é a importância da hidratação durante a prática de exercícios?",
                "Evitar completamente o suor",
                "Auxiliar no funcionamento adequado do organismo",
                "Aumentar automaticamente a massa muscular",
                "Substituir a alimentação",
                "Eliminar a necessidade de descanso",
                'B'));

        questoes.add(new Questao("7) Para que serve principalmente o aquecimento antes do treino?",
                "Preparar o corpo para a atividade física",
                "Substituir o treino principal",
                "Aumentar imediatamente a massa muscular",
                "Evitar completamente qualquer lesão",
                "Substituir a hidratação",
                'A'));

        questoes.add(new Questao("8) O que são aminoácidos?",
                "Componentes que formam as proteínas",
                "Tipos de carboidratos",
                "Minerais encontrados somente na água",
                "Tipos de exercícios aeróbicos",
                "Substâncias usadas exclusivamente para aumentar a gordura corporal",
                'A'));

        questoes.add(new Questao("9) Qual suplemento é formado por uma combinação de vitaminas e minerais?",
                "Whey Protein",
                "Creatina",
                "Multivitamínico",
                "BCAA",
                "Glutamina",
                'C'));

        questoes.add(new Questao("10) Qual é uma boa prática para quem começa a frequentar uma academia?",
                "Começar sempre com cargas máximas",
                "Ignorar a técnica dos exercícios",
                "Buscar orientação profissional para realizar os exercícios corretamente",
                "Treinar sem descanso todos os dias",
                "Evitar beber água durante o treino",
                'C'));

        questoes.add(new Questao("11) Qual é uma das funções das proteínas no organismo?",
                "Participar da construção e manutenção dos tecidos",
                "Substituir completamente a água",
                "Impedir a digestão dos alimentos",
                "Diminuir permanentemente a temperatura corporal",
                "Eliminar a necessidade de carboidratos",
                'A'));

        questoes.add(new Questao("12) O que significa hipertrofia muscular?",
                "Diminuição do tamanho dos músculos",
                "Aumento do tamanho das fibras musculares",
                "Perda completa de força",
                "Redução da quantidade de água no organismo",
                "Aumento da flexibilidade dos ossos",
                'B'));

        questoes.add(new Questao("13) Qual destas opções pode fazer parte de uma rotina adequada de recuperação após os treinos?",
                "Descanso adequado",
                "Treinar sem parar",
                "Evitar qualquer tipo de alimentação",
                "Dormir poucas horas diariamente",
                "Não beber água",
                'A'));

        questoes.add(new Questao("14) O que é BCAA?",
                "Um conjunto de três aminoácidos de cadeia ramificada",
                "Um tipo de carboidrato simples",
                "Um mineral",
                "Um equipamento de academia",
                "Um tipo de exercício",
                'A'));

        questoes.add(new Questao("15) Qual atitude é mais adequada antes de iniciar o uso de suplementos?",
                "Tomar qualquer suplemento indicado por amigos",
                "Utilizar vários suplementos ao mesmo tempo",
                "Buscar orientação de um profissional qualificado",
                "Aumentar a dose por conta própria",
                "Substituir todas as refeições por suplementos",
                'C'));

        for (Questao questao : questoes) {
            questao.exibirQuestao();
            System.out.println("Qual a sua resposta: ");

            char resposta = scanner.next().toUpperCase().charAt(0);

            if (questao.verificarRespostaCorreta(resposta)) {
                System.out.println("Resposta Correta!");
                acertos++;
            } else {
                System.out.println("Resposta errada");
            }

            System.out.println();
        }

        System.out.println("Foram " + acertos + " acertos");

        double porcentagem = ((acertos * 100.0) / questoes.size());

        System.out.printf("Porcentagem de acertos: %.2f%% %n", porcentagem);

        System.out.println("Obrigado por participar do quiz");

        scanner.close();
    }
}