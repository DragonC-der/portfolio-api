# 🚀 Developer Portfolio — Java + Spring Boot

![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-brightgreen?style=flat-square&logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=flat-square&logo=mysql)
![Netlify](https://img.shields.io/badge/Frontend-Netlify-00C7B7?style=flat-square&logo=netlify)
![Railway](https://img.shields.io/badge/Backend-Railway-0B0D0E?style=flat-square&logo=railway)

A full-stack developer portfolio with an animated plasma + 3D frontend and a production-ready Spring Boot REST API backend connected to MySQL — fully deployed on the internet.

---

## 🌐 Live Demo

| Layer | URL |
|-------|-----|
| 🎨 Frontend | https://dragoncoder.netlify.app |
| ⚙️ Backend API | portfolio-api-production-e515.up.railway.app |

---

## ✨ Features

- 🌊 Animated glowing plasma background with cyan & magenta waves
- 🔮 Three.js 3D spinning wireframe geometry with particle cloud
- 📱 Fully responsive — works on mobile, tablet, desktop
- 📬 Contact form connected to a live REST API
- 🗄️ Messages saved to MySQL database
- 🔒 CORS configured for secure cross-origin requests
- ☁️ Deployed on Netlify (frontend) + Railway (backend + database)

---

## 🛠️ Tech Stack

### Frontend
- HTML5, CSS3, Vanilla JavaScript
- Three.js (3D animation)
- Plasma canvas animation (custom)

### Backend
- Java 17
- Spring Boot 3.2
- Spring Web (REST API)
- Spring Data JPA (ORM)
- Spring Boot DevTools
- Lombok

### Database
- MySQL 8.0
- Hibernate (auto schema generation)

### DevOps & Deployment
- Git + GitHub
- Netlify (frontend hosting)
- Railway (backend + managed MySQL)

---

## 📁 Project Structure

```
portfolio/
│
├── frontend/
│   └── index.html                  # Complete frontend (HTML + CSS + JS)
│
└── backend/
    └── portfolio-api/
        ├── src/
        │   └── main/
        │       ├── java/com/portfolio/
        │       │   ├── PortfolioApiApplication.java
        │       │   ├── controller/
        │       │   │   └── ContactController.java
        │       │   ├── model/
        │       │   │   └── ContactMessage.java
        │       │   └── repository/
        │       │       └── ContactRepository.java
        │       └── resources/
        │           └── application.properties
        └── pom.xml
```

---

## 🚀 Run Locally

### Prerequisites
- Java 17+
- Maven
- MySQL 8.0
- Node.js (optional, for live server)

### 1. Clone the repository
```bash
git clone https://github.com/DragonC-der/portfolio-api.git
cd portfolio-api
```

### 2. Set up MySQL
```sql
CREATE DATABASE portfolio_db;
```

### 3. Configure application.properties
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/portfolio_db
spring.datasource.username=root
spring.datasource.password=yourpassword  // put your mysql password here
spring.jpa.hibernate.ddl-auto=update
server.port=8080
```

### 4. Run the backend
```bash
mvn spring-boot:run
```

### 5. Open the frontend
Just open `index.html` in your browser or use VS Code Live Server.

---

## 📬 API Reference

### POST `/api/contact`
Saves a contact message to the database.

**Request Body:**
```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "message": "Hello, I'd like to work with you!"
}
```

**Response:**
```
Message saved successfully!
```

---

## 🌍 Deployment

| Service | Purpose | Free Tier |
|---------|---------|-----------|
| Netlify | Frontend hosting | ✅ Yes |
| Railway | Backend (Spring Boot) | ✅ Yes |
| Railway | MySQL Database | ✅ Yes |

---

## 🙋‍♂️ Author

**Subhadra Debnath**
- GitHub: [@DragonC-der](https://github.com/DragonC-der)
- LinkedIn: [subhadra-debnath-95282a220/](https://linkedin.com/in/subhadra-debnath-95282a220/)
- Portfolio: [dragoncoder.netlify.app](https://dragoncoder.netlify.app)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

> Built with ☕ Java, 🌱 Spring Boot, and a lot of passion.
