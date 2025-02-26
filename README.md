# Real Estate Management System

## Project Overview
Author: Amit Nachum 🎓
This project is a **Real Estate Management System** 
that allows users to register, log in, list properties for sale, search for properties, and purchase them.
It implements several **design patterns** and follows **OOP principles** to ensure modularity and scalability.

## Installation & Setup
1. **Clone the repository** or **Download** the project files.
2. **Ensure you have Java installed** (Java 17 or later).
3. **Compile the project using the terminal**:
   ```sh
   java Main
   ```
4. **Run the project From the command Line**:
   ```sh
   java Main
   ```
   **Note:** Running the application from an IDE may cause issues with password masking.

## Usage Instructions
### 1. Running the Application
- When the application starts, you will see the following options:
  - **Register a new account**
  - **Login as an existing user**
  - **Exit the program**

### 2. Logging In
Use the following test credentials:
- **Username:** `test`
- **Password:** `testtest`

**Password Masking Issue:**
- The password masking (hiding input) **only works when running from the command line**.
- In IDEs (like IntelliJ, Eclipse, or VS Code), the masking may not work due to how IDEs handle input streams.

### 3. Features
#### a. Property Management
- **Sellers** can list and remove properties,sells the properties and notify the broker.
- **Buyers** can search for available properties using different search strategies.
- **Brokers** can also list and remove properties.

#### b. Searching for Properties
Users can search properties based on:
- Address radius
- Price range
- Size range
- Availability status

#### c. Purchasing a Property
- Buyers can select a property and purchase it.
- Additional **decorator pattern-based services** (cleaning, moving, interior design, etc.) can be added to a purchase.
- Once purchased, the property is marked as **sold** and updated in the system.

## Design Patterns Implemented
- **Singleton Pattern:** Used in `Logger`, `PropertyLoader`, and `PropertyUpdater`.
- **Factory Pattern:** Implemented in `UserFactory` and `ApartmentFactory`.
- **Observer Pattern:** Used for broker notifications.
- **Decorator Pattern:** Applied to additional services during property purchases.
- **Strategy Pattern:** Used through the `SearchStratedy` package.

## Testing System
- The project includes **JUnit 5 tests** for all major components.
- Tests are structured in the `TestSystem` package and cover:
- **Factories** (`UserFactoryTest`, `ApartmentFactoryTest`)
- **Core Classes** (`BrokerTest`, `SellerTest`, `BuyerTest`, etc.)
- **Services & Decorators** (`CleaningServiceTest`, `MovingServiceTest`, etc.)
- **Search Strategies** (`AddressRadiusSearchTest`, `PriceRangeSearchTest`, etc.)

Or, if using JUnit directly:
```sh
java -jar junit-platform-console-standalone.jar --class-path out/production/Project --scan-class-path
```

## File Structure & Components
- **BasicClasses/** (Core application classes like `Broker`, `Seller`, `Buyer`, `Apartment`, etc.)
- **Factories/** (`UserFactory`, `ApartmentFactory` for object creation)
- **Services/** (`CleaningService`, `InteriorDesignService`, etc., for decorator pattern)
- **SearchStrategy/** (`PriceRangeSearch`, `AvailabilitySearch`, etc.)
- **TestSystem/** (JUnit 5 tests for all components)
- **Loading_And_Updating/**(`PropertyLoader`,`PropertyUpdater`)

## Notes
- This system provides a **console-based** real estate management solution.
- Password masking works **only in the command line (cmd/terminal)**.


---
**Developed as part of an Object-Oriented Programming (OOP) Project.**

