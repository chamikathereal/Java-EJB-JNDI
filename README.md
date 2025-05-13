# Java-EJB-JNDI

A multi-module Java EE 7+ project demonstrating the use of **Enterprise Java Beans (EJB)** and **Java Naming and Directory Interface (JNDI)** communication between a server-side application and multiple client applications. This project uses **GlassFish** as the application server and is built using **Maven**.

---

## 📽️ Demo Video
[![Java CDI Project Demo](https://github.com/chamikathereal/Java-EJB-JNDI/blob/main/Java-EJB-JNDI.png)](https://youtu.be/3eMBZRCJQeM)

---

## 📦 Project Modules

This repository contains **three Maven projects** that work together:

### 1. `EE-WebApp`
A server-side EJB module exposing remote business logic using the `@Remote` interface.

- **Technologies**: EJB, JNDI, Jakarta EE (10)
- **Module Type**: EJB module (`.jar`)
- **Exposes**: `UserDetails` interface
- **Implements**: `UserDetailsBean`

### 2. `EE-Client-App`
A standalone Java client that connects to the EJB hosted on the application server using JNDI lookup.

- **Technology**: GlassFish embedded
- **Looks up**: `UserDetails` bean from the server
- **Prints**: User's name from the EJB
- **Binds**: `"AppName"` string to the JNDI context

### 3. `EE-Client-App2`
Another standalone Java client to demonstrate that **multiple clients** can interact with the shared EJB and JNDI registry.

- **Looks up**: `"AppName"` from the JNDI context
- **Prints**: Application name string

---

## 🛠 Technologies Used

- Java 11
- Jakarta EE 10
- EJB (Enterprise Java Beans)
- JNDI (Java Naming and Directory Interface)
- GlassFish 7.0.21 (embedded and remote)
- Maven

---

## 🔧 How to Run

1. **Deploy `EE-WebApp` to GlassFish**:
   - Use GlassFish Admin Console or `mvn clean install`
   - Ensure the EJB is accessible remotely

2. **Run EE-Client-App**:
   - Ensure GlassFish server is running
   - Run `Main.java` to perform JNDI lookup and bind `"AppName"`

3. **Run EE-Client-App2**:
   - Ensure EE-Client-App was executed first
   - Run `Main.java` to retrieve `"AppName"` via JNDI

---

## 🔗 Repository Structure

```

Java-EJB-JNDI/
├── EE-WebApp/
├── EE-Client-App/
└── EE-Client-App2/

```

---

## 📚 Learning Objectives

- Understand how to use EJBs for modular enterprise logic
- Use JNDI for client-server communication
- Implement dependency injection and JNDI lookups
- Build distributed Java EE applications

---

## 📎 License

This project is licensed under the [MIT License](LICENSE).

---

## 🤝 Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

---

## 🧑‍💻 Author

**Chamika Gayashan**  
Undergraduate Software Engineer | Sri Lanka  
Linkedin: [@chamikathereal](https://www.linkedin.com/in/chamikathereal/)


