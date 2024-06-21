package dev.dani.telefones;

import dev.dani.aplicativos.ChamadasTelefonicas;
import dev.dani.aplicativos.NavegadorInternet;
import dev.dani.aplicativos.ReprodutorMusical;
import dev.dani.funcionalidades.FuncionalidadesEmComum;

public class Iphone {
    public static void main(String[] args) {
        FuncionalidadesEmComum funcionalidade = null;

        String appEscolhido = "navegador";

        if (appEscolhido.equals("chamadas"))
            funcionalidade = new ChamadasTelefonicas();
        else if (appEscolhido.equals("navegador"))
            funcionalidade = new NavegadorInternet();
        else if (appEscolhido.equals("música"))
            funcionalidade = new ReprodutorMusical();

        funcionalidade.utilizarBusca();


   ReprodutorMusical musica = new ReprodutorMusical();

    System.out.println("IPOD");

    musica.selecionarMusica();
    musica.tocarMusica();
    musica.pausarMusica();

    NavegadorInternet navegador = new NavegadorInternet();

    System.out.println("SAFARI");

    navegador.exibirPagina();
    navegador.adicionarNovaAba();
    navegador.atualizarPagina();

    ChamadasTelefonicas chamadas = new ChamadasTelefonicas();

    System.out.println("CHAMADA TELEFONICA");

    chamadas.ligar();
    chamadas.atender();
    chamadas.iniciarCorreioDeVoz();

    }

}


