# Curso Avanzado de Java SE
**Table of Contents**

## ¿Qué vimos en el curso?  
El **Curso  Avanzado de Java SE** como tal nos explica que no existe una fase de java avanzado, sino, que en el vemos conceptos, funciones, metodo y clases un poco mas complejas.
En el curso nos enseña el uso de funciones como las interfaces funcionales, las clases abstractas, las nuevas umplementaciones de default y private en java 8 y 9entre muchas otras.

En este curso trabajamos con un proyecto llamado amazon viewer donde podiamos accedes a contenido multimedia, y consular otro tipo de archivos como libros o revistas.

En el proyecto reamos la nueva rama o branch la llamamada experimental, donde tambien se realizaron cambio.

EN el momento en que empezamos a preparar el proyecto para una futura conexion con una base de datos creamos otra rana llamada DAO donde preparamso el proyecto para su futura coneccion.

Tambien creamos una rama lamada SQL y lambdas donde se realizaron los cambios pertienentes y en lambas se agregaron las especificaciones y ejercicios de lambdas.

## Problemas del Curso
Iniciamos el proyecto clonando el repositorio desde git, hubo complicaciones de coneccion con el repositorio, posteriormente borramos la coneccion que tenia establecida con el 
repositorio de anncode (La instructora del curso), cambiamos la coneccion a mi repositorio en GitHub para poder hacer pull, commit y push al repositorio remoto ya que en la otra conexion no nos permitia hacerlo de manera correcta y tampoco tendriamos evidencia del curso (Este fue un problema un poco serio ya que debido a ello perdi la mitad del curso), una vez listo todo mandamos los datos hacia mi repositorio previamente añadid,o partimos de la rama o **Branch** 31.MakeReportAllEntities, posterior a ello realizamos unos cambios y los guardamos.

Hubo momento en los que el codigo tenia errores debido a problemas del codigo que venian desde el repositorio de ann code, ya que como corrobore yo mismo y basado en la experiencia de los dema usuario este curso tenia errores que se borraron detras de camara, pero con una buena revision se soluvionaron los problemas (la mayoria de los errores venia desde el inicio), auqnue si era dificil porque no entendiamos el porque de las cosas debido a que el curso donde se realizo elproyecto ahora no existe.

### ProyectoAmazon Viewer
Este proyecto fue un poco dificil de entender debido a la carente informacion obtenida, pero en si fue un reto comprender el como funciona el codigo.
En este proyecto podiamos ver las lista del contenido, visualizar el contenido y este mismo nos lanzaba un reporte sobre las peliculas series o libros consumidos

## Tecnologias usadas
Usamos:
- Java
- VS Code
- Eclipse
- Intellij IDEA
- Windows Subsystem for LInux 2 (WSL2).
- Ubuntu
- Github

### Algunas anotaciones del curso
Durante el trascurso del curso trate de tomar apuntes muy específicos que me han servido de ayuda en casi de repasar algo que no tenga muy claro o que simplemente necesite recordar.
Espero les sirvan como a mí. 
Da click **[sobre este enlace](https://www.notion.so/Curso-avanzado-de-Java-SE-cce273581fe14e2cbc528890c8110723)** para ir a los apuntes.

### Comandos Usados en el curso
- pwd = para ver en qué ruta de nuestro sistema está posicionado el terminal

- git init = para iniciar un proyecto nuevo (una sóla vez por repositorio)

- git status = para ver el estado de mis archivos

- git status -s = solo muestra los archivos modificados

- git show: Mostrara todos los cambios que hemos hecho, esto incluye las líneas que hemos cambiado, cuando y quien hizo dicho cambios.

- git add Nombre del Archivo = para agregar un archivo al staging area

- git add. = Agrega todos los archivos que hayan cambiado en la carpeta donde estás parado.(Después de $ git add . se suele hacer un commit para actualizar la base de datos)

- git commit = para crear un primer punto de control de nuestro código

- git commit -m “mensaje a escribir” = si quieres enviar algún mensaje

- git commit -am = es un “git add” automático de los cambios(funciona con los archivos a los cuáles ya les hiciste “git add” previamente)

- git config --global user.email ["you@example.com](mailto:%22you@example.com)" = para configurar el email del usuario

- git config --global -l = para visualizar el usuario y el e-mail

- git log Nombre del Archivo = para ver todos los commit que se han creado

- git log --stat = ver todos los cambios específicos que se hicieron en los archivos a partir del commit(con la “q” salgo de ahí)

- git log --all --graph --decorate --oneline = para ver todos los commit de manera más comprimida(alias unaliascualquiera=“git log --all --graph --decorate --oneline” = Para ponerle un alias y que sea más fácil acordarse, en mi caso, es “todosloscommits”)

- git checkout = para cambiar rápidamente de rama

- git checkout – “Nombre del archivo” = para revertir los cambios de los archivos

- git checkout -b Nombre de la nueva rama = Crea una rama a partir de la que te encuentres parado con el nombre “nombre_rama_nueva”, y luego salta sobre la rama nueva, por lo que quedas parado en esta última.

- git checkout -t origin/Nombre de la rama = Si existe una rama remota de nombre “nombre_rama”, al ejecutar este comando se crea una rama local con el nombre “nombre_rama” para hacer un seguimiento de la rama remota con el mismo nombre.

- git checkout Nombre de la rama a la cual quiero cambiar = Auto descriptivo

- git checkout Nombre del commit Nombre del archivo = para ver cómo era un archivo antes(también se puede con “git checkout master Nombre del archivo” aunque no es lo mismo, ojo)

- git diff Nombre del archivo = para ver las diferencias hechas en los archivos(se puede hacer también con “git diff Número del commit 1 Número del commit 2”)

- git show = todos los cambios históricos realizados(la misma función se puede realizar con el comando git log -nombre de archivo-)

- git show-ref --tags = para ver a qué commit está conectado un Tag

- git show-branch = para ver todas las ramas que existen y su historia(“git show-branch --all” = lo mismo pero más detallado)

- git pull = Para traer los archivos o cambios a un servidor remoto.

- git log --oneline = Muestra en una línea los commit realizados

- git reset --hard “Número del commit” = Viajamos al commit en específico “Número del commit” y eliminamos los cambios futuros

- git push = subir todos los cambios locales al servidor remoto de github

- git push origin Nombre de la rama = Commitea los cambios desde el branch local origin al branch “nombre_rama”.

- git push origin --tags = para enviar todos los tags al repositorio

- git pull = Cuando realizamos cambios directamente en github pero no de forma local para descargar los cambios realizados

- git pull origin master = para hacer un pull desde el origin remoto (en rama master) y luego el merge a la rama

- git fetch = compara los archivos locales con los del servidor(si hay alguna diferencia nos pediría realizar un get pull para hacer un match de los archivos locales)

- git tag Nombre de la version -m “Descripción de la versión” = para hacer versiones de nuestro proyecto.

- git tag -d Nombre del tag = para borrar un tag

- git push --tags = subir los tags

- git branch = para ver todas las ramas

- git branch Nombre de la rama = para crear una rama

- git branch -a = Lista todas las ramas locales y remotas.

- git branch -d Nombre de la rama = Elimina la rama local con el nombre “nombre_rama”.

- git branch -d Nombre de la rama = para borrar una rama

- git merge Nombre de la rama a unir = para unir una rama a la rama “master”(para eso hay que ubicarse en la rama “master”, no desde la rama a unir)

- git remote prune origin = Actualiza tu repositorio remoto en caso que algún otro desarrollador haya eliminado alguna rama remota.

- git reset --hard HEAD = Elimina los cambios realizados que aún no se hayan hecho commit.

- git tag -a Nombre del Tag -m “Mensaje del Tag” Número del Tag = para los Tags

- gitk = ver todo de manera más agradable a la vista


## Conclusiones
El curso fue un poco dificil de comprender, mas que nada en la sintaxis donde no sabiamos el porque hacia las cosas ya que el curso tenia mucho avance detra de camaras.
Aunque fue dificil, fue muy entretenido y como siempre nos pone a prueba ya sea para solucionar un problema o consultarlo.

##### Edita los archivos con extensiones **.md**
[Edita aqui archivos .md](https://pandao.github.io/editor.md/en.html#H2%20Header%20(Underline))

### End
