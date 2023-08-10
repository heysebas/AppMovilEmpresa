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
    nombre: String,
    documento: String,
    correo: String,
    val direccionCorrespondencia: String,
    val telefono: String
) : Persona(nombre, documento, correo)
