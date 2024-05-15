# Star Wars Movie Information Retrieval

Descripción:

Este proyecto Java utiliza programación orientada a objetos (POO) para crear una aplicación que consulta información sobre películas de Star Wars de una API pública. La aplicación permite al usuario seleccionar una película por su número de episodio (entre 1 y 7) y muestra la información de la película en la consola. Además, la información de la película se guarda en un archivo JSON.

Estructura del proyecto:

Clases:
Pelicula: Representa una película de Star Wars con sus atributos: título, número de episodio, introducción, director, productor y fecha de lanzamiento.

ConsultaPelicula: Se encarga de consultar la información de una película específica de la API.

GeneradorDeArchivo: Guarda la información de una película en un archivo JSON.

Principal: La clase principal del proyecto, que contiene el punto de entrada (main) de la aplicación.


Funcionamiento:

El usuario ingresa el número de la película que desea consultar.

La clase ConsultaPelicula se utiliza para recuperar la información de la película de la API.

La información de la película se convierte en un objeto de la clase Pelicula.

La información de la película se muestra en la consola.

La clase GeneradorDeArchivo se utiliza para guardar la información de la película en un archivo JSON con el nombre del título de la película.

Si el usuario ingresa un número no válido o se produce un error al consultar la información de la película, se muestra un mensaje de error.


Tecnologías utilizadas:

Java 19

POO

API pública de Star Wars (https://swapi.dev/)

Gson (https://github.com/google/gson)

Java 19 HTTP Client API


Consideraciones adicionales:

La aplicación está diseñada para ser utilizada en la consola.

La información de la película se guarda en un archivo JSON para que pueda ser utilizada posteriormente.

La aplicación se puede ampliar para incluir más funcionalidades, como la búsqueda de películas por título o la consulta de información sobre otras entidades de Star Wars.


Ejemplo de uso:

Escriba el número de la película de Star Wars que quiere consultar (1-7):
2
{
  "title": "Attack of the Clones",
  "episode_id": 2,
  "opening_crawl": "There has been a great disturbance in the Force.",
  "director": "George Lucas",
  "producer": "Rick McCallum",
  "release_date": "2002-05-16"
}

Conclusión:

Este proyecto es un ejemplo práctico de cómo utilizar POO y otras tecnologías Java para crear una aplicación útil y fácil de usar. La aplicación se puede ampliar y modificar para adaptarse a diferentes necesidades.

Contribuciones:

Las contribuciones son bienvenidas. Si deseas contribuir a este proyecto, ¡no dudes en abrir un problema o enviar una solicitud de extracción!

