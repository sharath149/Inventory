# inventory
# To run the application
1. mvn clean install
2. Run InventoryApplication.java or "java -jar inventory-0.0.1-SNAPSHOT.jar" in target folder

# To build docker
1. mvn clean packagedocker:build
2. docker run -p 8080:8080 inventory

