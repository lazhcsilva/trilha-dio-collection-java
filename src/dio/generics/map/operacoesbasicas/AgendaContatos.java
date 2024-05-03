package dio.generics.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContatos(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContatos("Camila", 123456);
        agendaContatos.adicionarContatos("Camila", 5665);
        agendaContatos.adicionarContatos("Camila Cavalcanti", 111111);
        agendaContatos.adicionarContatos("Camila DIO", 654987);
        agendaContatos.adicionarContatos("Maria Silva", 111111);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila DIO"));
    }

}
