# 🎮 Movie API

Movie API je Spring Boot aplikacija koja omogućava upravljanje filmovima putem RESTful servisa.  
Aplikacija koristi **Spring Boot, Maven, MySQL** i pokreće se unutar **Docker kontejnera**.

---

## 🚀 Pokretanje projekta

### 1️⃣ **Kloniraj repozitorij**
```bash
git clone https://github.com/tioberik/movieApi
cd movieApi
```

### 2️⃣ **Izgradi i pokreni Docker kontejnere**
Koristi **Docker Compose** za automatsko pokretanje baze i aplikacije:
```bash
docker-compose up --build
```

---

## 🛠 **Tehnologije**
- **Spring Boot** – backend REST API
- **MySQL** – baza podataka
- **Maven** – upravljanje dependency-ima
- **Docker** – kontejnerizacija aplikacije
- **Docker Compose** – orkestracija servisa

---

## 📌 **Endpointi**
| Metoda  | Ruta                              | Opis                                              |
|---------|-----------------------------------|---------------------------------------------------|
| `GET`   | `/api/v1/movie/all`               | Dohvaća sve filmove                               |
| `GET`   | `/api/v1/movie/{movieId}`         | Dohvaća film po ID-u                              |
| `GET`   | `/api/v1/movie/allMoviesPage`     | Dodaje sve filmove sa paginacijom                 |
| `GET`   | `/api/v1/movie/allMoviesPageSort` | Dodaje sve filmove sa paginacijom i sortiranjem   |
| `POST`  | `/api/v1/movie/add-movie`         | Dodaje novi film                                  |
| `PUT`   | `/api/v1/movie/update/{movieId}`  | Ažurira film po ID-u                              |
| `DELETE`| `/api/v1/movie/delete/{movieId}`  | Briše film po ID-u                                |
|---------|-----------------------------------|---------------------------------------------------|
| `POST`  | `/file/upload`                    | Učitavanje .png datoteka (postera)                |
| `GET`   | `/file/{fileName}`                | Dohvaćanje učitanih datoteka                      |
|---------|-----------------------------------|---------------------------------------------------|
| `POST`  | `/api/v1/auth/register`           | Registracija korisnika                            |
| `POST`  | `/api/v1/auth/login`              | Login korisnika                                   |
| `POST`  | `/api/v1/auth/refresh`            | Refreshiranje bearer tokena                       |

---

## 📂 **Struktura projekta**
```
movieApi/
│️─ src/
│   ├── main/
│   │   ├── java/com/example/movieapi/
│   │   │   ├── controllers/  # REST API kontroleri
│   │   │   ├── models/       # Modeli podataka (JPA entiteti)
│   │   │   ├── repositories/ # Repozitoriji (DAO sloj)
│   │   │   ├── services/     # Servisna logika
│   │   │   └── MovieApiApplication.java # Main klasa
│   │   └── resources/
│   │       └── application.properties # Konfiguracija baze
│️─ Dockerfile         # Konfiguracija za Docker
│️─ docker-compose.yml # Konfiguracija za Docker Compose
│️─ mvnw               # Maven wrapper (Linux/Mac)
│️─ mvnw.cmd           # Maven wrapper (Windows)
│️─ pom.xml            # Maven konfiguracija
│️─ README.md          # Ovaj fajl
```

---

## ⚙ **Konfiguracija baze podataka**
Aplikacija koristi **MySQL**. Ako želiš promijeniti podatke za pristup, uredi `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://mysql:3306/moviedb
spring.datasource.username=root
spring.datasource.password=secret
```

