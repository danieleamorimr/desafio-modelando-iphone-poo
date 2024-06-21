package dev.dani.aplicativos;

import dev.dani.funcionalidades.FuncionalidadesEmComum;

public class ChamadasTelefonicas extends FuncionalidadesEmComum {

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
        System.out.println("Buscando um número na agenda telefonica");

    }

    public void ligar () {
        System.out.println("ligando");
    }
    public void atender() {
        System.out.println("ligação atendida");
    }
    public void iniciarCorreioDeVoz() {
        System.out.println("ouvindo o correio de voz");
    }


}

