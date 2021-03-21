package model;

public class Produto
{


    private int codigo;
    private String descProduto;
    private float preco;
    private int quantidade;


    public Produto() {}


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getDescProduto() {
        return descProduto;
    }
    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }


    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }


    public int getQuatidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public String toString() {
        return  "\nCodigo: "+this.codigo+" | "+
                "Descrição do Produto: "+this.descProduto+" | "+
                "Preco: "+this.preco+" | "+
                "Quantidade: "+this.quantidade+"\n";
    }
}
