import model.*

fun main() {
    println("Ingrese el nombre:")
    val nombreEmpresa = readLine()
    println("Ingrese el nit:")
    val nit = readLine()
    println("Ingrese la direccion:")
    val direccion = readLine()

    val empresa = if (nombreEmpresa != null && nit != null && direccion != null) {
        Empresa(nombreEmpresa, nit, direccion)
    } else {
        println("La empresa no pudo ser creada debido a datos faltantes.")
        null
    }

    if (empresa != null) {
        val gerente = Cargo("Gerente", 1)
        val supervisor = Cargo("Supervisor", 2)
        val empleadoComun = Cargo("Empleado Común", 3)

        val empleado1 = Empleado("Juan Felipe", "1095967987", "Juan_Felipe@gmail.com", gerente, 5000.0, "Gerencia")
        val empleado2 = Empleado("Santiago Quintero", "1095967345", "Santiago@gmail.com", supervisor, 4000.0, "Gerencia")
        val empleado3 = Empleado("Santiago Hernandez", "1095967564", "Santi25@gmail.com", empleadoComun, 3000.0, "Operativo")

        empleado1.agregarSubordinado(empleado2)
        empleado2.agregarSubordinado(empleado3)

        empresa.agregarEmpleado(empleado1)
        empresa.agregarEmpleado(empleado2)
        empresa.agregarEmpleado(empleado3)

        val cliente1 = Cliente("Paula Grisales", "24393893", "grisales@gmail.com", "centro  calle 15-23", "3182737282")
        val cliente2 = Cliente("Monica Gomez", "3984773893", "Monica@gmail.com", "barrio la union", "318273654")

        empresa.agregarCliente(cliente1)
        empresa.agregarCliente(cliente2)

        println("Nómina total de la empresa: ${empresa.getNominaTotal()}")
        println("Nómina de la dependencia Gerencia: ${empresa.getNominaPorDependencia("Gerencia")}")
    }


}








