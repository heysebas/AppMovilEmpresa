package model

/**
 * Clase que representa a un cliente con su información básica.
 *
 * @property nombre El nombre del cliente.
 * @property documento El número de documento de identificación del cliente.
 * @property correo La dirección de correo electrónico del cliente.
 * @property direccion La dirección física del cliente.
 * @property telefono El número de teléfono de contacto del cliente.
 */
class Cliente(
    val nombre: String,
    val documento: String,
    val correo: String,
    val direccion: String,
    val telefono: String
) {
}
