package com.mycompany.mavenproject1;
import java.util.Scanner;

public class urnaeletronica {
public static void main(String[] args) {
    final int candidato1 = 77123; //Pedro
final int candidato2 = 90321; //Maria
final int candidato3 = 12345; //Joao

Scanner scanner = new Scanner(System.in);

int votosCandidatos1=0;
int votosCandidatos2=0;
int votosCandidatos3=0;

int voto=0;
    
//A urna eletronica apresenta três possiveis candidatos 
//com um número correspondendo a cada candidato.
do{
System.out.println("===== ELEICOES 2023 =====\nEscolha seu candidato\n77123 - Pedro\n90321 - Maria\n12345 - Joao");

//O programa apresenta um campo de entrada de dados para
//que o usuario digite a escolha do seu candidato

//Após, deve solicitar um novo voto 
voto=scanner.nextInt();

//Ao digitar o número escolhido, o programa irá somar
//voto para o candidato escolhido pelo usuario
  if(voto==77123){
    votosCandidatos1=votosCandidatos1+1;
    System.out.println("Você votou em  Pedro seu voto foi computado com sucesso");
    
} else if(voto==90321){
    votosCandidatos2=votosCandidatos2+1;
    System.out.println("Você votou em Maria seu voto foi computado com sucesso");
} else if(voto==12345){
    votosCandidatos3=votosCandidatos3+1;
    System.out.println("Você votou em João seu voto foi computado com sucesso");
} else {
    if(voto!=00000);
    System.out.println("Você não digitou nenhum cadidato");
}
}while(voto!=00000);

 System.out.println("A votação encerrou\n+votosCanvdidato2+Pedro\n+votosCandidato+1Maria\n+votosCandidato+3Joao");


//O programa deve exibir ao usuario uma mensagem que o 
//voto foi computado com sucesso


//Após, deve solicitar um novo voto 

//Quando o mesário digitar a senha secreta, o programa 
//ira parar de disponibilizar votos 

//Logo após parar de disponibilizar votos, o programa deve exibir 
//a quantidade de votos para cada candidato
}
    
}

