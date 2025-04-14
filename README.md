# Formulario de Inicio de Sesión con Spring 

Este proyecto es una aplicación web sencilla desarrollada con **Spring Boot** que muestra un formulario de inicio de sesión y procesa los datos ingresados por el usuario. Fue realizada como parte de la materia **Temas Selectos de Programación**, en cumplimiento con las especificaciones del profesor.

---

## Objetivo

Implementar una aplicación con un formulario web que permita al usuario ingresar sus credenciales y verificar si son válidas. Si los datos son correctos, se mostrará un mensaje de bienvenida; si son incorrectos, se mostrará un mensaje de error.

---

## Funcionalidad

- Cuando accedes a /inicio mediante una solicitud GET, se muestra un formulario de inicio de sesión con campos para nombre de usuario y contraseña.

- Al enviar el formulario, se realiza una solicitud POST a la misma URL /inicio enviando los datos.

- Si los datos ingresados son correctos (usuario: usuario, contraseña: 1234), se redirige a una página de bienvenida que muestra el nombre del usuario.

- Si los datos son incorrectos, se vuelve a mostrar el formulario con un mensaje de error.

---

## Tecnologías utilizadas/requisitos

- Java 17
- Spring Boot 3.4.4
- Maven
- Thymeleaf (motor de plantillas HTML)
- Visual Studio Code (opcional)
- Sistema operativo: Debian GNU/Linux 12 (funciona en otros SO también)

---

## Ejecución del proyecto

### 1. Clonar el repositorio

```bash
git clone https://github.com/medrey24/loginSpring_AlonsoMedina.git
cd loginform

### 2. Ejecutar el proyecto

Desde la raíz del proyecto, usa Maven:

```bash
./mvnw spring-boot:run

O bien:

```bash
mvn spring-boot:run

### 3. Acceder desde el navegador
Ir a:
http://localhost:8080/inicio


### 🔐 Credenciales de prueba
Usuario	usuario
Contraseña	1234

### Estructura del proyecto

loginform/
├── src/main/java/com/ejemplo/loginform/
│   ├── LoginFormApplication.java      # Clase principal
│   ├── controller/LoginController.java # Controlador web
│   ├── model/User.java                # Modelo de datos
│   └── service/AuthService.java       # Lógica de validación
├── src/main/resources/templates/
│   ├── login.html                     # Formulario de login
│   └── home.html                      # Página de bienvenida
├── src/main/resources/application.properties
└── pom.xml                            # Configuración de Maven


### 📄 Detalles de implementación

- Se utilizó el patrón MVC de Spring Boot para separar responsabilidades.

- La validación se realiza en el servicio AuthService, que actualmente usa credenciales fijas.

- Las vistas HTML fueron creadas con Thymeleaf.

- En caso de error, el mensaje se muestra en rojo debajo del formulario.

Autor 👨‍💻
Nombre: Alonso Medina Reyes

Materia: Temas Selectos de Programación

Universidad: Universidad Autónoma de Campeche, Facultad de Ingeniería

Profesor: José Aguilar Canepa
