package model

/**
 * Clase que representa a una persona con su información básica.
 *
 * @property nombre El nombre completo de la persona.
 * @property documento El número de documento de identificación de la persona.
 * @property correo La dirección de correo electrónico de la persona.
 */
open class Persona(val nombre: String, val documento: String, val correo: String)
