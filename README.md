# SmartCity-Grid-Simulator

🏙️ SmartCity Grid – Powering a Java Future

This Java project simulates a Smart City energy management system. It demonstrates how modern cities can handle power distribution, monitor energy usage, and balance loads efficiently using Object-Oriented Programming and multithreading.

🚀 Features

🏠 Classes & Inheritance: Models buildings, residential units, and smart units.
🔌 Interfaces: Standard grid operations (connectToGrid, transmitUsage, disconnectFromGrid).
⚠️ Exception Handling: Detects and reports energy overloads with custom exceptions.
💾 File I/O: Generates daily energy usage reports as .txt files.
⚡ Multithreading: Simulates load balancing across multiple power threads.
📦 Packages: Organized modules for clean and modular Java architecture.

🧱 Package Structure
smartcity.buildings
smartcity.grid
smartcity.exceptions
smartcity.io
smartcity.threads

🧩 Technologies Used

Java (JDK 17+)
Object-Oriented Programming
Multithreading
Exception Handling
File I/O (BufferedWriter)

🧠 Learning Outcomes

This project helped implement real-world programming concepts like:
Encapsulation and inheritance
Interface implementation
Handling checked exceptions
Managing concurrent threads
File writing and report generation

🖥️ How to Run
javac -d out -sourcepath src src/smartcity/SmartCityMain.java
java -cp out smartcity.SmartCityMain
