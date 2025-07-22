# The Burger House - Inventory Management System

A Spring Boot web application that manages restaurant inventory for "The Burger House". The system tracks ingredients and menu items, handles purchases, and maintains stock levels with validation.

## What This Program Does

This is a restaurant inventory management system that allows you to:

- **Manage Ingredients**: Add, update, and track restaurant ingredients (parts) with minimum and maximum stock levels
- **Manage Menu Items**: Create and maintain menu items (products) that are made from ingredients
- **Process Orders**: Use the "Buy Now" feature to sell menu items and automatically update inventory
- **Track Stock Levels**: Monitor current, minimum, and maximum inventory levels
- **Validate Inventory**: Prevent stock issues with built-in validation that ensures inventory stays within acceptable ranges
- **View Company Info**: Access an "About" page with restaurant information

## How It Works

The application uses a simple inventory model:
- **Ingredients** (like burger patties, buns, lettuce) are the raw materials
- **Menu Items** (like cheeseburgers, veggie burgers) are made from ingredients
- When customers buy menu items, the inventory decreases
- The system prevents sales when inventory is too low
- Managers can set minimum and maximum stock levels for each ingredient

## How to Run

### Prerequisites
- Java 17 or higher
- Maven (or use the included Maven wrapper)

### Running the Application

1. **Clone or download** this project to your computer

2. **Open a terminal** in the project directory

3. **Run the application** using one of these commands:
   ```bash
   # Using Maven wrapper (recommended)
   ./mvnw spring-boot:run
   
   # Or if you have Maven installed
   mvn spring-boot:run
   ```

4. **Open your web browser** and go to: `http://localhost:8080`

5. **Start using the application**:
   - View ingredients and menu items on the main page
   - Click "Buy Now" to purchase menu items
   - Add or edit ingredients and menu items using the forms
   - Visit the "About" page to learn about The Burger House

### Running Tests

To run the unit tests:
```bash
./mvnw test
```

### Stopping the Application

Press `Ctrl+C` in the terminal where the application is running.

## Sample Data

The application comes with sample data including:
- 5 ingredients (burger patties, buns, lettuce, tomatoes, cheese)
- 5 menu items (various burger combinations)
- Realistic inventory levels and stock limits

This sample data is automatically loaded when you first run the application.