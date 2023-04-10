
fun main(args: Array<String>) {
    var cad : String = ""
    var letra : Char = ' '

    println("Dime la cadena")
    cad = readln().trim().uppercase()
    println("Dime la letra que quieres buscar")
    letra = readln().get(0)

    println("La letra ${letra} aparece ${buscarLetra(cad, letra)} veces")

    println("Cambio hecho para que se vea en github")

    println("Hola mundo")

}
fun buscarLetra(cad : String, letra : Char) : Int{
    var cont : Int = 0
    var posicion : Int = 0
    var buscador : Int = 0

    do {
        buscador = cad.indexOf(letra, posicion, true)
        if (buscador != -1){
            posicion = buscador + 1
            cont ++
        }
    }while (buscador != -1)
    return cont
}
