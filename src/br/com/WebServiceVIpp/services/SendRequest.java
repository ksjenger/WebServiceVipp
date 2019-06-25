package br.com.WebServiceVIpp.services;

import br.com.WebServiceVIpp.entities.ObjetoPostagem;
import br.inf.visualset.Destinatario;
import br.inf.visualset.PerfilVipp;
import br.inf.visualset.Postagem;
import br.inf.visualset.PostagemRetorno;
import br.inf.visualset.PostarObjetoResponse;

public class SendRequest {

    static Destinatario destinatario = new Destinatario();
    static PerfilVipp perfilVipp = new PerfilVipp();

    private static PostarObjetoResponse.PostarObjetoResult postarObjeto(br.inf.visualset.Postagem postagemVipp) {
        br.inf.visualset.PostagemVipp service = new br.inf.visualset.PostagemVipp();
        br.inf.visualset.PostagemVippSoap port = service.getPostagemVippSoap();
        return port.postarObjeto(postagemVipp);
    }

    public static PostarObjetoResponse.PostarObjetoResult setPostagemVipp() {
        Postagem postagem = new Postagem();
        postagem.setPerfilVipp(setPerfilVipp());
        postagem.setDestinatario(destinatario);
        PostarObjetoResponse.PostarObjetoResult resultObj = postarObjeto(postagem);
        return resultObj;
    }

    public static Destinatario setDestinatario(ObjetoPostagem obj) {
        destinatario.setNome(obj.getDestinatario());
        destinatario.setEndereco(obj.getEndereco());
        destinatario.setNumero(obj.getNumero());
        destinatario.setComplemento(obj.getComplemento());
        destinatario.setBairro(obj.getBairro());
        destinatario.setCidade(obj.getCidade());
        destinatario.setUF(obj.getUf());
        destinatario.setCep(obj.getCep());
        destinatario.setTelefone(obj.getTelefone());
        destinatario.setCelular(obj.getTelefone_celular());
        destinatario.setEmail(obj.getEmail());
        return destinatario;
    }

    public static PerfilVipp setPerfilVipp() {
        perfilVipp.setIdPerfil("604");
        perfilVipp.setToken("testewebservice");
        perfilVipp.setUsuario("webservice");
        return perfilVipp;
    }

}
