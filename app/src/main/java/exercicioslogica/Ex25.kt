package exercicioslogica

/*
*:::2 Crie um algoritmo que calcule o desconto de um produto. O usuário deverá informar o Nome, valor do produto e a porcentagem de desconto a ser calculada.
* */


fun desconto(nome: String, valor: Double, desconto: Double){
    println("O desconto para o produto $nome é de ${valor*(desconto/100)}%")
}