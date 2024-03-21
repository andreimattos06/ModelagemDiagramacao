public class App {
    public static void main(String[] args) throws Exception {
        SmartPhone iphone = new SmartPhone();
        AparelhoTelefonico celular = iphone;
        NavegadorInternet navegador = iphone;
        ReprodutorMusical musica = iphone;

        celular.ligar("67999999");
        celular.atender();
        celular.iniciarCorreioVoz();

        navegador.exibirPagina("Teste");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        musica.tocar();
        musica.selecionarMusica("Baroes da Pisadinha");
        musica.pausar();

        iphone.ligar("67999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("Teste");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.tocar();
        iphone.selecionarMusica("Baroes da Pisadinha");
        iphone.pausar();

    }
}
