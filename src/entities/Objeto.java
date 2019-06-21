package entities;

import java.util.ArrayList;

public class Objeto {

    private String destinatario;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String telefone;
    private String financeiro;
    private String registro;
    private String peso;
    private String altura;
    private String largura;
    private String comprimento;
    private String cubico;
    private String nota;
    private String serie_nota;
    private String declarado;
    private String valor_cobrar;
    private String adicionais;
    private String contrato;
    private String administrativo;
    private String cartao;
    private String email;
    private String observacao_1;
    private String observacao_2;
    private String observacao_3;
    private String telefone_celular;
    private ArrayList <DesObjeto> desObjeto;
    
    public Objeto() {
    }

    public Objeto(String destinatario, String endereco, String numero, String complemento, 
            String bairro, String cidade, String uf, String cep, String telefone, String financeiro, 
            String registro, String peso, String altura, String largura, String comprimento, 
            String cubico, String nota, String serie_nota, String declarado, String valor_cobrar, 
            String adicionais, String contrato, String administrativo, String cartao, String email, 
            String observacao_1, String observacao_2, String observacao_3, String telefone_celular) {
        
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.financeiro = financeiro;
        this.registro = registro;
        this.peso = peso;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.cubico = cubico;
        this.nota = nota;
        this.serie_nota = serie_nota;
        this.declarado = declarado;
        this.valor_cobrar = valor_cobrar;
        this.adicionais = adicionais;
        this.contrato = contrato;
        this.administrativo = administrativo;
        this.cartao = cartao;
        this.email = email;
        this.observacao_1 = observacao_1;
        this.observacao_2 = observacao_2;
        this.observacao_3 = observacao_3;
        this.telefone_celular = telefone_celular;
    }

    public Objeto(String destinatario, String endereco, String numero, String complemento, 
            String bairro, String cidade, String uf, String cep, String observacao_1) {
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.observacao_1 = observacao_1;
        }
            
    

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<DesObjeto> getDesObjeto() {
        return desObjeto;
    }

    public void setDesObjeto(ArrayList<DesObjeto> desObjeto) {
        this.desObjeto = desObjeto;
    }
    

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFinanceiro() {
        return financeiro;
    }

    public void setFinanceiro(String financeiro) {
        this.financeiro = financeiro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getCubico() {
        return cubico;
    }

    public void setCubico(String cubico) {
        this.cubico = cubico;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getSerie_nota() {
        return serie_nota;
    }

    public void setSerie_nota(String serie_nota) {
        this.serie_nota = serie_nota;
    }

    public String getDeclarado() {
        return declarado;
    }

    public void setDeclarado(String declarado) {
        this.declarado = declarado;
    }

    public String getValor_cobrar() {
        return valor_cobrar;
    }

    public void setValor_cobrar(String valor_cobrar) {
        this.valor_cobrar = valor_cobrar;
    }

    public String getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(String adicionais) {
        this.adicionais = adicionais;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(String administrativo) {
        this.administrativo = administrativo;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao_1() {
        return observacao_1;
    }

    public void setObservacao_1(String observacao_1) {
        this.observacao_1 = observacao_1;
    }

    public String getObservacao_2() {
        return observacao_2;
    }

    public void setObservacao_2(String observacao_2) {
        this.observacao_2 = observacao_2;
    }

    public String getObservacao_3() {
        return observacao_3;
    }

    public void setObservacao_3(String observacao_3) {
        this.observacao_3 = observacao_3;
    }

    public String getTelefone_celular() {
        return telefone_celular;
    }

    public void setTelefone_celular(String telefone_celular) {
        this.telefone_celular = telefone_celular;
    }

    @Override
    public String toString() {
        return "Objeto{" + "destinatario=" + destinatario + ", endereco=" + endereco + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + ", observacao_1=" + observacao_1 + ", =" + desObjeto + '}';
    }


    
    
}
