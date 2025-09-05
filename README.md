# 📧 Kafka Email Notify

## 🚀 Project Overview
Kafka Email Notify is an **event-driven email notification system** built with **Apache Kafka** and **Spring Boot**.  
It demonstrates a real-world use case of the **publish/subscribe** model:  
- The **Producer** publishes an email request to a Kafka topic.  
- The **Consumer** consumes the message and sends the email via SMTP.  

The purpose of this project is to demonstrate how Kafka can be integrated with Spring Boot and provide a simple reference for event-driven microservice communication and notification workflows.  

> **Note:** This project is a **minimal example** of Event-Driven Architecture (EDA), built to demonstrate how Kafka can enable asynchronous communication between a producer and a consumer. It is not a production-scale application but a learning and showcase project.

---

## ✨ Features
- Event-driven architecture  
- Publish/Subscribe communication via Kafka  
- Email sending using Spring Mail (SMTP)  
- Kafka + Zookeeper setup with Docker Compose  
- Easy configuration via `application.properties`  

---

## 🛠 Tech Stack
- **Java 17**  
- **Spring Boot 3.x**  
- **Spring Kafka**  
- **Spring Mail**  
- **Apache Kafka & Zookeeper (Docker Compose)**  
- **Maven**  

---

## ⚙️ Setup Instructions

```bash
# 1. Clone the project
git clone https://github.com/alirizakaygusuz/kafka-email-notify.git
cd kafka-email-notify

# 2. Start Kafka & Zookeeper
docker-compose up -d
```

### 3. Configure Gmail App Password
To send emails via Gmail, you need to generate an **App Password** (not your regular Gmail password):  
1. Log in to your Gmail account.  
2. Go to **Manage your Google Account** (top-right profile).  
3. Navigate to the **Security** tab.  
4. Under “Signing in to Google,” find **App passwords**.  
5. Select “Mail” → “Other (Custom name)” and generate a password.  
6. Copy the 16-character password into `application.properties`:  

```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=youremail@gmail.com
spring.mail.password=your-app-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

### 4. Build and Run
```bash
mvn clean install
mvn spring-boot:run
```

### 5. Test with Postman
```http
POST http://localhost:8080/api/v1/mail
Content-Type: application/json

{
  "to": "test@example.com",
  "subject": "Kafka Demo",
  "body": "Hello, this email was triggered via Kafka!"
}
```

The consumer will read the message from Kafka and send the email ✅  

---

## ✍️ Author
**Ali Rıza Kaygusuz** – 🛠 Java Backend Developer  

🌍 [GitHub Profile](https://github.com/alirizakaygusuz)  
💼 [LinkedIn Profile](https://www.linkedin.com/in/alirizakaygusuz)  

---

## 📄 License
This project is licensed under the **MIT License**.  

📜 [MIT License Link](https://opensource.org/licenses/MIT)  

Feel free to fork, contribute, or use it freely in your own applications.  
