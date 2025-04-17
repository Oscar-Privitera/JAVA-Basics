JAVAC=javac
JAVA=java
SRC_DIR=src
BUILD_DIR=build

# Lister tous les fichiers .java dans src/
# List all .java files in src/
# src/ 内のすべての .java ファイルをリストする
SOURCES=$(wildcard $(SRC_DIR)/*.java)
CLASSES=$(patsubst $(SRC_DIR)/%.java,$(BUILD_DIR)/%.class,$(SOURCES))

# Compiler tous les fichiers
# Compile all files
# すべてのファイルをコンパイルする
all: $(CLASSES)

$(BUILD_DIR)/%.class: $(SRC_DIR)/%.java
	@mkdir -p $(BUILD_DIR)
	$(JAVAC) -d $(BUILD_DIR) $<

# Exécuter un exercice (ex: make run name=Exo1)
# Run an exercise (e.g. make run name=Exo1)
# 課題を実行する（例: make run name=Exo1）
run: all
	$(JAVA) -cp $(BUILD_DIR) $(name)

# Nettoyer les fichiers compilés
# Clean up compiled files
# コンパイルされたファイルをクリーンアップする
clean:
	rm -rf $(BUILD_DIR)
