JAVA_EXEC = mvn exec:java
JAVA_COMPILE = mvn compile

MAIN_CLASS = com.atduyar.rental.UI.App
MAIN_CLASS_CLI = com.atduyar.rental.cli.App

run: compile ui

ui:
	$(JAVA_EXEC) -Dexec.mainClass=$(MAIN_CLASS)

cli:
	$(JAVA_EXEC) -Dexec.mainClass=$(MAIN_CLASS_CLI)

compile:
	$(JAVA_COMPILE)
