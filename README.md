## Despliegue de applicaciones Spring Boot en HEROKU

Crear archivo `system.properties` en el proyecto con el contenido:
```
java.runtime.version=18
```

1. Crear una cuenta en heroku.com y github.com
2. Tener configurado git en el computador
    1. `git config --global user.name "Mialzafu"`
    2. `git config --global user.email mazf3485@gmail.com`
3. Subir el proyecto a GitHub desde Intellij IDEA desde la opción: VCS > Share project on GitHub
4. Desde HEROKU, crear app y elegir método GitHub y buscar el repositorio subido
5. Habilitar deploy automático y ejecutar el Deploy manual
6. Open app para validar que todo quedó configurado correctamente