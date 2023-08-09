package model

class Empresa(
    val nombre: String,
    val nit: String,
    val direccion: String,
    val empleados: MutableList<Empleado> = mutableListOf(),
    val clientes: MutableList<Cliente> = mutableListOf()
) {
    fun agregarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
    }

    fun eliminarEmpleado(empleado: Empleado) {
        empleados.remove(empleado)
    }

    fun agregarCliente(cliente: Cliente) {
        clientes.add(cliente)
    }

    fun eliminarCliente(cliente: Cliente) {
        clientes.remove(cliente)
    }

    fun getNominaTotal(): Double {
        return empleados.sumByDouble { it.salario }
    }

    fun getNominaPorDependencia(dependencia: String): Double {
        return empleados
            .filter { it.dependencia == dependencia }
            .sumByDouble { it.salario }
    }
}