/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class Compte {
 private String code;
 protected double solde;
 protected Agence lAgence;
 protected Client proprietaire;
 public Compte(Client leProproetaire, Agence agence){
 this.solde = 0;
 this.proprietaire = leProproetaire;
 this.lAgence = agence;
 }
 public Compte(double leSolde, Client leProproetaire, Agence agence){
 this.solde = leSolde;
 this.proprietaire = leProproetaire;
 this.lAgence = agence;
 }
 public void setCode(String code) {this.code = code;}

 public String getCode() {return code;}
 public void retirer(double som) {if(som<solde) solde -= som;}
 public void deposer(double som) {solde += som;}

} 
