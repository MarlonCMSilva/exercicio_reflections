package br.com.msilva;

public class TabelaDeProdutos {
    @Tabela(product_name = "Produto Teste", product_id = 123456L, value = "teste")
    private String name;
    private Double value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
