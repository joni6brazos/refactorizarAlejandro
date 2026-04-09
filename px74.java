// /**
// * mostrar a foto e logo imprime a identidade e idade
// * @param identidade
// * @param idade
// * @see SEN REFACTORRIZAR  
// */
// void visualizarDatos(String identidade, int idade)){
//     mostrarfoto();
//     System.out.println("Idade: " + idade);
//     System.out.println("Indentidade" + identidade);
// }

//Reducion loxica

/**
 * mostrar a foto e logo imprime a identidade e idade
 * @param ident
 * @param idade
 * @see REFACTORRIZADO 
 */
void visualizarDatosRef(String ident, int idade){
    mostrarFoto();
    mostrarDatos (ident, idade);
}

/**
 * imprime e logo imprime a identidade e idade
 * @param ident
 * @param anos
 * @see REFACTORRIZADO 
 */
void mostrarDatos(String ident, int anos){
    System.out.println("Idade: " + anos);
    System.out.println("Indentidade" + ident);
}