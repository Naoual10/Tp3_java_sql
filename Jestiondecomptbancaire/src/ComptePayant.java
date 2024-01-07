/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class ComptePayant extends Compte{
 public static int nbComptesP = 0;
 private final static double TAUX_OPERATION = 5;
 public ComptePayant(Client leProproetaire, Agence agence){
 super(leProproetaire, agence);
 String code = this.getClass().getName()+":"+ ++nbComptesP;
 setCode(code);
 }
 public ComptePayant(double leSolde, Client leProproetaire, Agence agence){
 super(leSolde, leProproetaire, agence);
 String code = this.getClass().getName()+":"+ ++nbComptesP;
 setCode(code);
 }
 public void retirer(double som) {super.retirer(som+TAUX_OPERATION);}
 public void deposer(double som) {super.deposer(som-TAUX_OPERATION);}
 public String toString() {
 String s =
 "\t| "+getCode()+" | Solde: "+solde+" DH | Montant de l'operation:"+TAUX_OPERATION + " |" +"\n\t-----------------------------------------------------------------------" ;
 return s;
 }
} 