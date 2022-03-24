package uca.ni.edu.peliculas.entidades

data class Pelicula(
    val idPelicula: Int,
    val clasificacion: String,
    val duracion: String,
    val nacionalidad: String,
    val sinopsis: String,
    val tipoMetraje: String,
    val titulo: String
)