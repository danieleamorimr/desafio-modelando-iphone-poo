package dev.dani.aplicativos;

import dev.dani.funcionalidades.FuncionalidadesEmComum;

public class ReprodutorMusical extends FuncionalidadesEmComum {

    @Override
    protected void verificarConexaoInternet() {
        System.out.println("verificando conexão com a internet");

    }

    @Override
    protected void carregarAplicativo() {
        System.out.println("carregando aplicativo");

    }

    @Override
    public void utilizarBusca() {
        System.out.println("Buscando uma música");

    }

    public void tocarMusica() {
        System.out.println("tocando música");
    }
    public void pausarMusica() {
        System.out.println("música pausada");
    }
    public void selecionarMusica() {
        System.out.println("selecionando música");
    }


}



