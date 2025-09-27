<h1 align="center">🔑 Spring_Oauth_Demo</h1>  
<p align="center">
  <b>A Spring Boot OAuth2 Authentication Demo</b><br>
  Implemented secure login using <code>GitHub OAuth</code> for authentication and authorization.
</p>

---

## 📌 Introduction  
**Spring_Oauth_Demo** is a sample project that demonstrates how to implement **OAuth 2.0 authentication** in a Spring Boot application using **GitHub as an OAuth Provider**.  
It showcases how to integrate third-party OAuth providers for secure login, protecting routes, and retrieving authenticated user details.  

---

## ✨ Features  
✔️ **OAuth 2.0 Login with GitHub** – Authenticate users via their GitHub accounts.  
✔️ **Spring Security Integration** – Secure endpoints and restrict unauthorized access.  
✔️ **User Information Retrieval** – Fetch user profile data from GitHub after login.  
✔️ **Session Handling** – Maintain secure sessions for authenticated users.  
✔️ **Lightweight Demo** – Simple project structure for learning and extending OAuth with Spring.  

---

## 🛠️ Tech Stack  
- **Backend:** Spring Boot, Spring Security, OAuth2 Client  
- **OAuth Provider:** GitHub  
- **Build Tool:** Maven  
- **Database (Optional):** H2 / PostgreSQL (can be configured)  

---

## ⚙️ Configuration  
1. Create a new **OAuth App** on [GitHub Developer Settings](https://github.com/settings/developers).  
2. Copy the **Client ID** and **Client Secret**.  
3. Add them to your `application.properties` file:  

application.properties

```
spring.security.oauth2.client.registration.github.client-id=YOUR_CLIENT_ID
spring.security.oauth2.client.registration.github.client-secret=YOUR_CLIENT_SECRET
spring.security.oauth2.client.registration.github.scope=read:user,user:email
```

## 🚀 How to Run

1. Clone the repository:

```
git clone https://github.com/your-username/Spring_Oauth_demo.git
cd Spring_Oauth_demo
```

2. Build and run with Maven:
```
mvn spring-boot:run
```

3. Open your browser and go to:
```
http://localhost:8080/login
```

4. Login with your GitHub account 🎉

## 📂 Project Structure

Spring_Oauth_demo/ <br>
│── src/main/java/com/oauthdemo/         # Java source files<br>
│   ├── controller/                      # Controllers and endpoints<br>
│   ├── config/                          # Spring Security OAuth configurations if you wants to add<br>
│
│── src/main/resources/                  <br>
│   ├── application.properties           # GitHub OAuth credentials<br>
│
│── pom.xml                              # Maven dependencies<br>


## 🌟 Future Enhancements
🔹 Add support for Google, Facebook, LinkedIn OAuth.
🔹 Store authenticated users in a PostgreSQL database.
🔹 Extend with JWT Token-based authentication.
🔹 Deploy on Heroku/AWS for production.
<br><br>

<p align="center"> 🔐 Built with <b>Spring Boot</b> and <b>OAuth2</b> for secure authentication. </p>
