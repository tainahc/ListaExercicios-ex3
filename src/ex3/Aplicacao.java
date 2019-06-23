/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author Tainah e Leo
 */
public class Aplicacao {
    public static void main(String[] args) {
    Documento documentoPrimeiro = new Documento(); 
    
    documentoPrimeiro.setDescricao("Este documento relata a dificuldade do governo em restabelecer a crise economica");
    documentoPrimeiro.setNomeDocumento("Documento v1");
    
        System.out.println("Nome do documento: "+documentoPrimeiro.getNomeDocumento());
        System.out.println("Descricao: "+documentoPrimeiro.getDescricao());
    
    }
    
}
