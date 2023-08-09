package model

/**
 * Clase que representa un cargo en una empresa con su nombre y nivel jerárquico.
 *
 * @property nombre El nombre del cargo.
 * @property nivelJerarquico El nivel jerárquico del cargo. Cuanto menor es el valor, mayor es la jerarquía.
 */
class Cargo(
    val nombre: String,
    val nivelJerarquico: Int
) {
}
