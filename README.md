## Temperature Converter Application
A Spring Boot application for converting temperatures between Celsius, Fahrenheit, and Kelvin units. This project demonstrates clean architecture, Docker containerization, and responsive web design.

<img width="1364" alt="image" src="https://github.com/user-attachments/assets/dd2f2631-4803-42d0-9e11-38fea111da79">

**Features**
```
Convert temperatures between different units:
Celsius (°C)
Fahrenheit (°F)
Kelvin (K)
Clean and responsive user interface
Real-time conversion
Error handling and validation
Containerized deployment
```
**Tech Stack**
```
Java 17
Spring Boot 2.7.0
Maven
Thymeleaf
Docker
HTML/CSS
```
**Prerequisites**
```
Java JDK 17 or later
Maven 3.8+
Docker
```
**Getting Started**
**Running Locally**
Clone the repository:
```
git clone https://github.com/Bhaktabahadurthapa/temperature-converter.git
cd temperature-converter
```
Build the application:
```
mvn clean install
```
Run the application:
```
mvn spring-boot:run
```
The application will be available at http://localhost:8000

## Using Docker
Build the Docker image:

```
docker build -t <image_name> .
```
Run the container:
```
docker run -d -p 8000:8000 --name temp-converter temperature-converter
```
<img width="1700" alt="image" src="https://github.com/user-attachments/assets/58537a06-62f2-4e29-92d6-0697f08b2255">

## Project Structure
```
temperature-converter/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── temperatureconverter/
│   │   │               ├── TemperatureConverterApplication.java
│   │   │               ├── controller/
│   │   │               │   └── TemperatureController.java
│   │   │               ├── model/
│   │   │               │   └── Temperature.java
│   │   │               └── service/
│   │   │                   └── TemperatureService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── templates/
│   │           └── converter.html
└── pom.xml
```
## API Usage
Convert temperature using the web interface or the REST API:
```
curl -X POST http://localhost:8000/api/convert \
-H "Content-Type: application/json" \
-d '{
    "value": 100,
    "fromUnit": "CELSIUS",
    "toUnit": "FAHRENHEIT"
}'
```
## Contributing
```
Fork the repository
Create your feature branch (git checkout -b feature/AmazingFeature)
Commit your changes (git commit -m 'Add some AmazingFeature')
Push to the branch (git push origin feature/AmazingFeature)
Open a Pull Request
```
## License
This project is licensed under the MIT License - see the LICENSE file for details.
## Contact
Name - Bhakta Thapa
Project Link: https://github.com/Bhaktabahadurthapa/temperature-converter.git
## Acknowledgments
**Spring Boot Documentation**
**Docker Documentation**
**Thymeleaf Documentation**












