import model.*

fun main() {
    // Solicitar al usuario que ingrese información de la empresa
    println("Ingrese el nombre de la empresa:")
    val nombreEmpresa = readLine()
    println("Ingrese el NIT:")
    val nit = readLine()
    println("Ingrese la dirección:")
    val direccion = readLine()

    // Crear una instancia de Empresa si la información está completa
    val empresa = if (nombreEmpresa != null && nit != null && direccion != null) {
        Empresa(nombreEmpresa, nit, direccion)
    } else {
        println("La empresa no pudo ser creada debido a datos faltantes.")
        null
    }

    // Si se creó la empresa, agregar empleados y clientes
    if (empresa != null) {
        // Definir diferentes cargos
        val gerente = Cargo("Gerente", 1)
        val supervisor = Cargo("Supervisor", 2)
        val empleadoComun = Cargo("Empleado Común", 3)

        // Crear instancias de Empleado con sus respectivos detalles
        val empleado1 = Empleado("Juan Felipe", "1095967987", "Juan_Felipe@gmail.com", gerente, 5000.0, "Gerencia")
        val empleado2 = Empleado("Santiago Quintero", "1095967345", "Santiago@gmail.com", supervisor, 4000.0, "Gerencia")
        val empleado3 = Empleado("Santiago Hernandez", "1095967564", "Santi25@gmail.com", empleadoComun, 3000.0, "Operativo")

        // Establecer jerarquía entre empleados
        empleado1.agregarSubordinado(empleado2)
        empleado2.agregarSubordinado(empleado3)

        // Agregar empleados a la empresa
        empresa.agregarEmpleado(empleado1)
        empresa.agregarEmpleado(empleado2)
        empresa.agregarEmpleado(empleado3)

        // Crear instancias de Cliente con sus detalles
        val cliente1 = Cliente("Paula Grisales", "24393893", "grisales@gmail.com", "centro calle 15-23", "3182737282")
        val cliente2 = Cliente("Monica Gomez", "3984773893", "Monica@gmail.com", "barrio la union", "318273654")

        // Agregar clientes a la empresa
        empresa.agregarCliente(cliente1)
        empresa.agregarCliente(cliente2)

        // Mostrar la nómina total de la empresa y nómina por dependencia
        println("Nómina total de la empresa: ${empresa.getNominaTotal()}")
        println("Nómina de la dependencia Gerencia: ${empresa.getNominaPorDependencia("Gerencia")}")
    }
}