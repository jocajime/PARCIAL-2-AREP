# PARCIAL 2 AREP - JOEL CARVAJAL

## Comenzando 🚀

para clonar este proyecto abrimos nuestro cmd y ponemos:

    git clone https://github.com/jocajime/PARCIAL-2-AREP


### Pre-requisitos 📋

- [Java](https://www.java.com/download/)
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)
- Navegador 

### Despliegue🔧

Se dirá como instalar y desplegar en cada una de las partes de solución en este README

## Construido con 🛠️

- [Java](https://www.java.com/download/)
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)

## Parte I

### EC2 CON DOCKER
Se presentara u servicio web con Spark, el cual tendra 2 funciones que son cos, asin. recibira Double y respondera con un json Con el formato, este tendra la operacion solicitada, el valor ingrasado y el resultado.

para acceder a este lo haremos con el link: 
http://ec2-3-88-144-84.compute-1.amazonaws.com:35000/cos?value=3.141592
este link esta con la demostración de coseno de aproximadamente pi, sin embargo para cambiar esto podemos guiarnos con la siguiente plantilla.
http://ec2-3-88-144-84.compute-1.amazonaws.com:35000/[cos o asin]?value=[numero]
(si se quiere usar este servicio solicitar prender las maquinas)
### MUESTRA DE FUNCIONAMIENTO
primero vemos el repositorio de DockerHub:

 ![fotorepo](https://github.com/jocajime/PARCIAL-2-AREP/blob/master/img/fotorepo.PNG)
 
 luego vemos la instancia en EC2:
 
 ![fotoinstancia](https://github.com/jocajime/PARCIAL-2-AREP/blob/master/img/fotoinstancia.PNG)
 
notamos como esta funcionando nuestro contenedor en la instancia de EC2 conectandonos desde cmd de windows:

 ![fotocmd](https://github.com/jocajime/PARCIAL-2-AREP/blob/master/img/fotocmd.PNG)
 
y por ultimo comprobamos su funcionamiento desde un navegador.

 ![fotonavegador](https://github.com/jocajime/PARCIAL-2-AREP/blob/master/img/fotonavegador.PNG)
 
 se puede ver el video en la carpeta videos.
 
### INSTALACION LOCAL
Si queremos tener una instalación local de este servicio correremos el siguiente comando una vez iniciado el servicio de docker:

     docker run -d -p 34000:6000 --name mathservice joelcarvajal/mathwebserviceparcial
y luego accederemos localmente desde un navegador:
			localhost:35000/[cos o asin]?value=[numero]
de esta manera tendremos corriendo este contenedor de manera local y podremos usar el servicio.

## Parte II

### LAMDA CON GATEWAY

En este caso se implementaron las dos funciones estas se pueden verificar en el link:
 https://hwpw4ralfg.execute-api.us-east-1.amazonaws.com/parcial/[cos o sin]?value=[numer]
 
 Ejemplo:
 
 https://hwpw4ralfg.execute-api.us-east-1.amazonaws.com/parcial/cos?value=3.141592
 
 estas devolveran el resultado de la operacion.
 
 ### MUESTRA DE FUNCIONAMIENTO
primero vemos las funciones en lambda:

 ![funciones](https://github.com/jocajime/PARCIAL-2-AREP/blob/master/img/funciones.PNG)
 
 luego podemos ver el api gateway:
 
  ![gateway](https://github.com/jocajime/PARCIAL-2-AREP/blob/master/img/gateway.PNG)
  
  y por ultimo verificamos el funcionamiento:
  
![funcos](https://github.com/jocajime/PARCIAL-2-AREP/blob/master/img/funcos.PNG)
	
![funasin](https://github.com/jocajime/PARCIAL-2-AREP/blob/master/img/funasin.PNG)

se puede ver el video en la carpeta videos.

### INSTALACION LOCAL

si queremos usar este servicio podemos clonar el repositorio o descargar la carpeta lambda.

## Autores ✒️

* **Joel Carvajal** - [jocajime](https://github.com/jocajime)

## Licencia 📄

Este proyecto está bajo la Licencia (Tu Licencia) - mira el archivo [LICENSE.md](LICENSE.md) para detalles