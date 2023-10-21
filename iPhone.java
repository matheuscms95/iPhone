public interface Reprodutor {
    void tocar();
    void pausar();
    void selecionarMusica();
}

public interface Telefone {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

public interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}

public class iPhone implements Reprodutor, Telefone, NavegadorInternet {
    @Override
    public void tocar() {
    }

    @Override
    public void pausar() {
    }

    @Override
    public void selecionarMusica() {
    }

    @Override
    public void ligar() {
    }

    @Override
    public void atender() {
    }

    @Override
    public void iniciarCorreioVoz() {
    }

    @Override
    public void exibirPagina() {
    }

    @Override
    public void adicionarNovaAba() {
    }

    @Override
    public void atualizarPagina() {
    }
}
