package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarProdutoComumComValorIgualA (double valor){
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Sofá Ibiza 3 Lugares");
        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("bege");
        cores.add("branco");
        produto.setProdutoCores(cores);
        produto.setProdutoUrlMock("");

        List<ComponentePojo> componentes = new ArrayList<>();

        ComponentePojo componete = new ComponentePojo();
        componete.setComponenteNome("Puff");
        componete.setComponenteQuantidade(2);
        componentes.add(componete);

        ComponentePojo segundoComponente = new ComponentePojo();
        segundoComponente.setComponenteNome("Banqueta");
        segundoComponente.setComponenteQuantidade(2);
        componentes.add(segundoComponente);

        produto.setComponentes(componentes);

        return produto;
    }
}
