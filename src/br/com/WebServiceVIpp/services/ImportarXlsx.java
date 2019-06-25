package br.com.WebServiceVIpp.services;

import br.inf.visualset.Postagem;
import br.com.WebServiceVIpp.entities.DesObjeto;
import br.com.WebServiceVIpp.entities.ObjetoPostagem;
import br.com.WebServiceVIpp.view.FormPrincipal;
import br.inf.visualset.PostarObjetoResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportarXlsx {

    public static ObjetoPostagem ImportarXlsx(String url) {

        ObjetoPostagem obj = new ObjetoPostagem();
        ArrayList<DesObjeto> conteudo = new ArrayList<>();

        File file = new File(url);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            //Cria um woorkbook com todas as abas da planilha
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

            //recupera a segunda aba da planilha
            XSSFSheet sheet = workbook.getSheetAt(1);

            //retorna todas as linhas da planilha 1 ou aba 2
            Iterator<Row> rowInterator = sheet.iterator();

            //varre todas as linhas da planilha como se fosse um Resultset
            int cont = 0;
            while (rowInterator.hasNext()) {

                //recebe cada linha da planilha
                Row row = rowInterator.next();

                //Pegamos todas as celulas desta linha
                if (cont == 0) {
                    cont++;
                } else {

                    Iterator<Cell> cellInterator = row.iterator();

                    String observacao_1 = null, desObj, destinatario = null, endereco = null,
                            bairro = null, complemento = null, cep = null, cidade = null, 
                            uf = null, numero = null;

                    boolean temp = true;

                    //Varremos todas as celulas da linha atual
                    while (cellInterator.hasNext()) {

                        //Aqui criamos uma celula
                        Cell cell = cellInterator.next();

                        switch (cell.getColumnIndex()) {

                            case 0:
                                observacao_1 = "" + cell.getStringCellValue();
                                if (observacao_1 != null) {
                                    if (observacao_1.equals(obj.getObservacao_1())) {
                                        temp = false;
                                    }
                                }
                                    break;                            
                        
                        case 11:
                                desObj = "" + cell.getStringCellValue();
                                if (observacao_1 != null) {
                                    if (observacao_1.equals(obj.getObservacao_1())) {
                                        conteudo.add(new DesObjeto(desObj));
                                    } else {
                                        conteudo.clear();
                                        conteudo.add(new DesObjeto(desObj));
                                    }

                                }

                                break;

                            case 14:
                                destinatario = "" + cell.getStringCellValue();

                            case 16:
                                endereco = "" + cell.getStringCellValue();
                                break;

                            case 17:
                                numero = "" + cell.getStringCellValue();
                                break;

                            case 18:
                                bairro = "" + cell.getStringCellValue();
                                break;

                            case 19:
                                complemento = "" + cell.getStringCellValue();
                                break;

                            case 20:
                                cep = "" + cell.getStringCellValue();
                                break;

                            case 21:
                                cidade = "" + cell.getStringCellValue();
                                break;

                            case 22:
                                uf = "" + cell.getStringCellValue();
                                break;

                        }
                    }
                    if (temp) {
                            obj = new ObjetoPostagem(destinatario, endereco, numero, complemento,
                                    bairro, cidade, uf, cep, observacao_1);
                            obj.setDesObjeto(conteudo);
                        } else {
                            obj.setDesObjeto(conteudo);
                        }
                        
                        SendRequest.setDestinatario(obj);
                        SendRequest sd = new SendRequest();
                        sd.setPostagemVipp();
                        System.out.println(obj.toString());
                    }
                }

            }catch (FileNotFoundException ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

            return obj;
        }

    }
