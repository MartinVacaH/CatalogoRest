# Usamos una imagen base de OpenJDK 17
FROM openjdk:17-jdk-slim

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el archivo JAR generado en `target/`
COPY target/articulos-1.0.0.jar app.jar

# Exponemos el puerto 9090
EXPOSE 8080

# Configurar variable de entorno para asegurarnos de que use el puerto correcto
ENV PORT=8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
