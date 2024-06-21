package dev.dani.aplicativos;

import dev.dani.funcionalidades.FuncionalidadesEmComum;

public class NavegadorInternet extends FuncionalidadesEmComum {

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
        System.out.println("Buscando um site pelo navegador");

    }


    public void exibirPagina () {
        System.out.println("exibindo página no navegador");
    }
    public void adicionarNovaAba() {
        System.out.println("nova aba adicionada ao navegador");
    }
    public void atualizarPagina() {
        System.out.println("página atualizada");
    }


}
