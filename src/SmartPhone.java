public class SmartPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
        
    }

    @Override
    public void atender() {
        System.out.println("Atendeu!");
        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
        
    }

    @Override
    public void exibirPagina(String nome) {
        System.out.println("Exibindo página " + nome);
        
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada!");
        
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println("Selecionado a musica " + nome);
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando!");
        
    }
    
}
