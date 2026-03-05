# MathQuest

Une application Java de quiz mathématique. Répondez correctement aux questions pour progresser de salle en salle.

Ce projet est une démo pour illustrer le design pattern Factory Method.

## Compilation et Exécution

### Linux / macOS

Ce projet utilise un **Makefile** pour faciliter la compilation et l'exécution.

**Commandes disponibles :**

```bash
make compile    # Compile tous les fichiers source Java
make run        # Compile (si nécessaire) et lance le jeu
make clean      # Supprime les fichiers compilés (.class)
make rebuild    # Nettoie et recompile tout
make help       # Affiche l'aide
```

**Exemple :**

```bash
make run
```

### Windows

Ce projet inclut un fichier **batch** (`build.bat`) pour la compilation et l'exécution sous Windows.

**Commandes disponibles :**

```cmd
build.bat compile    # Compile tous les fichiers source Java
build.bat run        # Compile (si nécessaire) et lance le jeu
build.bat clean      # Supprime les fichiers compilés
build.bat rebuild    # Nettoie et recompile
build.bat help       # Affiche l'aide
```

**Note :** Dans PowerShell, vous devez préfixer la commande par `.\` :

```powershell
.\build.bat run
```

Dans l'invite de commande (CMD), vous pouvez l'exécuter directement :

```cmd
build.bat run
```

## Prérequis

- Java Development Kit (JDK) 8 ou supérieur
- Les commandes `javac` et `java` doivent être accessibles dans votre variable d'environnement PATH.

## Sortie de Compilation

Les fichiers `.class` compilés sont placés dans le répertoire `bin/`.

Pour nettoyer les fichiers compilés :
- **Linux/macOS :** `make clean`
- **Windows :** `build.bat clean`

