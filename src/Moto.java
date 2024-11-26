public class Moto {

    //Propriedade da moto
   private String nome;

   private int modelo;

   private int anoFabricacao;

   private String corMoto;


    // get e setter modificadores de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }


    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCorMoto() {
        return corMoto;
    }

    public void setCorMoto(String corMoto) {
        this.corMoto = corMoto;
    }

    //metodo para definir as informações da moto
    public String cadastrarNome() {
        return "Hornet";
    }

    public String cadastrarModelo() {
        return ("modelo: " + 2025);
    }

    public String cadastrarFabricacao() {
        return  ("anoFabricação: " + 2024);
    }

    public String cadastrarCorMoto() {
        return ("corDaMoto: " + "Preta");
    }
}
