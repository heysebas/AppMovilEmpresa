package model

/**
 * Clase que representa a un empleado en una empresa con su información básica y detalles laborales.
 *
 * @property nombre El nombre del empleado.
 * @property documento El número de documento de identificación del empleado.
 * @property correo La dirección de correo electrónico del empleado.
 * @property cargo El cargo del empleado.
 * @property salario El salario del empleado.
 * @property dependencia La dependencia o área en la que trabaja el empleado.
 * @property subordinados Lista mutable de empleados que son subordinados a este empleado.
 */

class Empleado(
    val nombre: String,
    val documento: String,
    val correo: String,
    var cargo: Cargo,
    val salario: Double,
    val dependencia: String,
    val subordinados: MutableList<Empleado> = mutableListOf()
) {
    /**
     * Agrega un empleado como subordinado de este empleado.
     *
     * @param empleado El empleado a ser agregado como subordinado.
     */
    fun agregarSubordinado(empleado: Empleado) {
        subordinados.add(empleado)
    }

    /**
     * Elimina un empleado de la lista de subordinados.
     *
     * @param empleado El empleado a ser eliminado de la lista de subordinados.
     */
    fun eliminarSubordinado(empleado: Empleado) {
        subordinados.remove(empleado)
    }
}