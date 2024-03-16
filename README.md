# Mini Projet : Framework d'injection de dépendances

Ce mini-projet consiste en un framework simplifié pour l'injection de dépendances, similaire à Spring IOC. Il permet aux développeurs de configurer et d'utiliser facilement des dépendances dans leurs applications Java.

## Installation

1. Clonez ce dépôt vers votre machine locale.
2. Importez-le dans votre environnement de développement préféré (par exemple, IntelliJ IDEA, Eclipse, etc.).
3. Compilez le projet et assurez-vous qu'il n'y a pas d'erreurs de compilation.

## Utilisation

Le framework d'injection de dépendances prend en charge deux méthodes d'injection : via un fichier XML de configuration ou à l'aide d'annotations.

### Configuration via XML

1. Créez un fichier XML de configuration avec la structure appropriée.
2. Utilisez la classe `XMLConfigLoader` pour charger la configuration depuis le fichier XML.
3. Injectez les dépendances dans votre application en utilisant les informations extraites du fichier XML.

### Configuration via Annotations

1. Utilisez les annotations `@Component` et `@Autowired` pour marquer vos classes et champs.
2. Le framework se chargera automatiquement de l'injection des dépendances en fonction des annotations.
