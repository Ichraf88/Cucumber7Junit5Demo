# Cucumber7JUnit5Demo (Selenium + Cucumber 7 + JUnit 5)

Framework d’automatisation **UI** basé sur :
- **Selenium WebDriver**
- **Cucumber (BDD)**
- **JUnit 5 (JUnit Platform)**
- **Maven**
- (Optionnel) **ExtentReports** pour les rapports

Ce projet contient des scénarios Cucumber (ex: Login OrangeHRM demo) et une structure “Actions / Locators / Step Definitions” pour garder un code propre et maintenable.

---

## ✅ Stack technique
- Java (recommandé **11+**)
- Maven
- Selenium
- Cucumber 7
- JUnit 5 (JUnit Platform)
- WebDriverManager (si utilisé) pour gérer les drivers automatiquement

---

## 📁 Structure du projet
src
├─ main
│ └─ java
│ └─ com.example
│ ├─ actions # Actions / Page Actions (ex: LoginPageActions)
│ ├─ locations # Locators / Page Objects (ex: LoginPageLocators)
│ └─ utils # Helpers (ex: HelperClass)
└─ test
├─ java
│ └─ com.example
│ ├─ definitions # Step Definitions + Hooks (ex: LoginPageDefinitions, Hooks)
│ └─ runner # Runner JUnit (ex: CucumberRunnerTests)
└─ resources
├─ features # Fichiers .feature (ex: LoginPage.feature)
└─ junit-platform.properties