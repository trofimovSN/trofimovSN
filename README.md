# Sergei Trofimov — QA Engineer

**Manual & Automation Testing · Java · Selenium · Playwright · API · SQL**

I build test automation frameworks from scratch and validate software across the full stack — UI, REST API, and database. Currently working as a QA intern and freelance tester on real client projects, with a focus on finding high-impact defects early and reducing manual regression effort.

📍 Woodruff, SC · Open to on-site, hybrid, or remote roles  
🔗 [LinkedIn](https://www.linkedin.com/in/sergei-trofimov-7b428275)

---

## Projects

### [Koel-Selenium](https://github.com/trofimovSN/Koel-Selenium) — UI & API Automation Framework
> Java · Selenium WebDriver · TestNG · Rest-Assured · Gradle · Page Object Model

End-to-end automation framework for [Koel](https://koel.dev) (open-source music streaming app).

- **32 automated UI tests** covering core user flows — positive and negative scenarios
- **7 API tests** validating backend endpoints independently of the UI layer
- Page Object Model architecture — maintainable, scalable, easy to extend
- Parallel test execution via multi-threaded TestNG configuration
- Custom TestListeners for structured execution reporting

---

### [Koel-API](https://github.com/trofimovSN/Koel-API) — Postman API Test Collection
> Postman · JavaScript (pm.test)

Standalone API test suite for the Koel music streaming server.

- Authentication flows: login/logout with token validation
- Playlist CRUD operations with full response validation (status codes, JSON body, headers)
- Request chaining — dynamic token and ID extraction across requests
- Loop execution for bulk operations (like/unlike songs)
- Negative testing: 401 Unauthorized, 404 Not Found, 422 Unprocessable Entity

---

### [Koel-Playwright](https://github.com/trofimovSN/Koel-Playwright) — Playwright Automation Framework *(in progress)*
> Playwright · Java · JUnit 5 · Maven

Parallel framework built alongside Koel-Selenium to compare Selenium vs Playwright approaches on the same application. Login and playlist flows automated; expanding coverage.

---

## Tech Stack

| Area | Tools |
|---|---|
| Languages | Java (Core — OOP, collections, business logic) |
| UI Automation | Selenium WebDriver, Playwright |
| Test Frameworks | TestNG, JUnit 5 |
| API Testing | Rest-Assured, Postman |
| Databases | MySQL, MariaDB, DBeaver |
| Build & CI | Gradle, Maven, Git |
| Defect Tracking | Jira |
| OS | Windows 11, Ubuntu Linux |

---

## Experience

**QA Engineer Intern** · TestPro Bootcamp · *Dec 2025 – Present*  
Designed and executed 50+ manual and automated test cases across UI, API, and database layers. Built and maintained a Selenium automation framework. Validated REST APIs and confirmed data consistency between frontend and database using SQL.

**Freelance Tester** · Test IO · *Jan 2026 – Present*  
Exploratory, functional, and regression testing on real client web and mobile applications. Submitted reproducible defect reports with steps, screenshots, and logs. Verified bug fixes across regression cycles.
