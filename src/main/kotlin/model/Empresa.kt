package model

/**
 * Clase que representa una empresa con su información básica y empleados/clientes asociados.
 *
 * @property nombre El nombre de la empresa.
 * @property nit El número de identificación tributaria (NIT) de la empresa.
 * @property direccion La dirección física de la empresa.
 * @property empleados Lista mutable de empleados que trabajan en la empresa.
 * @property clientes Lista mutable de clientes asociados a la empresa.
 */
class Empresa(
    val nombre: String,
    val nit: String,
    val direccion: String,
    val empleados: MutableList<Empleado> = mutableListOf(),
    val clientes: MutableList<Cliente> = mutableListOf()
) {
    /**
     * Agrega un empleado a la lista de empleados de la empresa.
     *
     * @param empleado El empleado a ser agregado.
     */
    fun agregarEmpleado(empleado: Empleado) {
        empleados.add(empleado)
    }

    /**
     * Elimina un empleado de la lista de empleados de la empresa.
     *
     * @param empleado El empleado a ser eliminado.
     */
    fun eliminarEmpleado(empleado: Empleado) {
        empleados.remove(empleado)
    }

    /**
     * Agrega un cliente a la lista de clientes de la empresa.
     *
     * @param cliente El cliente a ser agregado.
     */
    fun agregarCliente(cliente: Cliente) {
        clientes.add(cliente)
    }

    /**
     * Elimina un cliente de la lista de clientes de la empresa.
     *
     * @param cliente El cliente a ser eliminado.
     */
    fun eliminarCliente(cliente: Cliente) {
        clientes.remove(cliente)
    }

    /**
     * Obtiene el total de la nómina de todos los empleados de la empresa.
     *
     * @return El total de la nómina de la empresa.
     */
    fun getNominaTotal(): Double {
        return empleados.sumByDouble { it.salario }
    }

    /**
     * Obtiene el total de la nómina de empleados en una dependencia específica.
     *
     * @param dependencia La dependencia de la que se desea calcular la nómina.
     * @return El total de la nómina en la dependencia especificada.
     */
    fun getNominaPorDependencia(dependencia: String): Double {
        return empleados
            .filter { it.dependencia == dependencia }
            .sumByDouble { it.salario }
    }
}
