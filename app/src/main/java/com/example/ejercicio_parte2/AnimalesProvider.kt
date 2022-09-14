package com.example.ejercicio_parte2

import java.util.Random

class AnimalesProvider {
    companion object {
        val animalesList = listOf(

            Animal(
                "Elefante",
                "Mamifero",
                "Habitad: Selva",
                "Comida: Plantas",
                "${hambreAlto()}",
                "https://lanoticia.com/wp-content/uploads/2022/06/elefante.jpg"),
            Animal(
                "Murcielago",
                "Mamifero",
                "Habitat: Cuevas",
                "Comida: Insectos",
                "${hambreBajo()}",
                "https://natureconservancy-h.assetsadobe.com/is/image/content/dam/tnc/nature/en/photos/tnc_34284690_1640x1025.jpg?crop=0%2C0%2C1640%2C1230&wid=640&hei=480&scl=2.5625",
            ),
            Animal(
                "Jirafa",
                "Mamifero",
                "Habitat: Sabana",
                "Comida: Hojas",
                "${hambreAlto()}",
                "https://www.hogarmania.com/archivos/202101/jirafa-portada-668x400x80xX-1.jpg"
            ),
            Animal(
                "Loro",
                "Ave",
                "Habitat: Tropical",
                "Comida: Cemillas",
                "${hambreBajo()}",
                "https://cdn.download.ams.birds.cornell.edu/api/v1/asset/95481341/1800",
            ),
            Animal(
                "Leon",
                "Mamifero",
                "Habitat: Sabana",
                "Comida: Antilopes",
                "${hambreAlto()}",
                "https://www.bioenciclopedia.com/wp-content/uploads/2011/12/leon-800.jpg",
            ),
            Animal(
                "Pinguino",
                "Ave",
                "Habitat: Antartida",
                "Comida: Peces",
                "${hambreBajo()}",
                "https://images.ecestaticos.com/pqIAcGCEagnkjdIBVKVbC9i5FH4=/0x0:1920x1278/1200x900/filters:fill(white):format(jpg)/f.elconfidencial.com%2Foriginal%2Fe8e%2Fe27%2F2bf%2Fe8ee272bfd36f69679936351209d708c.jpg",
            )
        )
        fun hambreAlto(): String {
            var n = Random ()
            var nHambre = n.nextInt(40) +61
            var a = "Nivel de hambre: $nHambre"
            return a
        }
        fun hambreBajo(): String {
            var n = Random ()
            var nHambre = n.nextInt(50) +1
            var a = "Nivel de hambre: $nHambre"
            return a
        }
    }
}