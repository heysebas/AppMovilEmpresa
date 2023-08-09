package model

class Empleado(
    val nombre: String,
    val documento: String,
    val correo: String,
    var cargo: Cargo,
    val salario: Double,
    val dependencia: String,
    val subordinados: MutableList<Empleado> = mutableListOf()
) {
    fun agregarSubordinado(empleado: Empleado) {
        subordinados.add(empleado)
    }

    fun eliminarSubordinado(empleado: Empleado) {
        subordinados.remove(empleado)
    }
}