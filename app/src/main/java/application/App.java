package application;
import application.model.Tarefa; 

public class App {
    public static void main(String[] args) {
        Tarefa t = new Tarefa();
        t.setDescricao("TESTE DE TAREFA");
        t.setConcluido(false);

        System.out.println(t.getDescricao());
        System.out.println(t.getConcluido());

        Tarefa t2 = new Tarefa("segunda Tarefa");
        System.out.println(t2.getDescricao());
    }
    }
