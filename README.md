# Recetas
App para buscar recetas

# RecipeApp

App para buscar recetas

## Arquitectura:

En este proyecto se usa Clean-Architecture de la siguiente manera:

- Layer Presentation/App: En esta capa se maneja todo lo relacionado con el Framework de android y las vistas
- Layer Domain: En esta capa esta la lógica de negocio y los llamados al API
- Layer Entities: En esta capa manejamos las definiciones de nuestros modelos

También se implementa el patrón de diseño MVVM de la siguiente forma

![0_5eJUx2N-5IKoIJNO](https://user-images.githubusercontent.com/11460880/205169220-6a30eabf-869c-48a9-af1f-aef15e56bbc7.png)

## Librerías:

- Hilt: Se uso para el manejo de inyección de dependencias
- RxJava: Se uso para el manejo de Observer.
- Retrofit2: Se uso para las peticiones HTTP/llamados al API
- Gson: Se uso para el manejo de JSON

## Dificultades

En este proyecto se presentaros dos dificultades:

1. El manejo para inyectar las interfaces de los UseCases se intento realizando binding. Esto no funciono. Se cambia el binding por la inyección normal y directa del UseCase 
2. La librería Moshi no nos genero el JsonAdapter de nuestro modelo de respuesta del API. Se remplaza Moshi por la libreria Gson 

## Output 

![Screenshot_20221202_001122](https://user-images.githubusercontent.com/11460880/205219203-0da56218-cfb2-4e96-868c-d75446db63ec.png)


