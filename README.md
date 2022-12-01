# Recetas
App para buscar recetas

RecipeApp

App para buscar recetas 

Arquutectura:

En este proyecto se usa Clean-Architecture de la siguiente manera: 

- Layer Presentation/App: En esta capa se maneja todo lo relacionado con el framewrok de android y las vistas 
- Layer Domain: En esta capa esta la logica de negocio y los llamados al API 
- Layer Entities: En esta capa manejamos las definiciones de nuestros modelos

Tambien se implementa el patron de diseño MVVM de la siguiente forma 

![0_5eJUx2N-5IKoIJNO](https://user-images.githubusercontent.com/11460880/205169220-6a30eabf-869c-48a9-af1f-aef15e56bbc7.png)

Librerias: 

- Hilt: Se uso para el manejo de inyeccion de dependencias
- RxJava: Se uso para el manejo de observers.
- Retrofit2: Se uso para las peticiones HTTP/llamados al API
- Moshi: Se uso para el manejo de JSON

Dificultades

En este proyecto se presentaros dos dificualtades: 

1. El manejo para inyectar las interfaces de los UseCases se intento realizando binding. Esto no funciono 
2. La libreria Moshi no nos genero el JsonAdapter de nuestro modelo de respuesta del API 


