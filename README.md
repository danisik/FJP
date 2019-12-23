# FJP
## Struktura projektu
- src - zdrojové kódy
- testFiles - příklady použití
- doc - dokumentace
- pom.xml.example - pro použití Maven odstranit z názvu example
- run.sh - skript pro build a ukázkové spuštění Linux
- run.bat - skript pro build a ukázkové spuštění Windows

## Spuštění
Pro spuštění je nutné mít nainstalovanou Javu a Maven. Pro vytvoření buildu přejmenovat **pom.xml.example** na **pom.xml** a spustit
příkaz:
>mvn clean install

Vytvoří se složka target s dvěma JAR soubory. Pro korektní spuštění je nutné 
spustit JAR, který obsahuje v názvu -jar-with-dependencies", jinak neobsahuje ANTLR knihovnu. 
Spuštění se provede:

>java -jar target/SimpleJava-1.0-jar-with-dependencies.jar <vstupní soubor> <výstupní soubor>

## Spuštění ukázkového scriptu
### Linux
Pokud nejde skript spustit, je nutné nejdříve nastavit práva: 

>chmod +x run.sh

následně se skript spustí:
>./run.sh

### Windows
Spustit soubor run.bat

v kořenové složce se vytvoří soubor output.txt s instrukcemi PL/0 pro soubor
testFiles/aritmetic/basic.txt
