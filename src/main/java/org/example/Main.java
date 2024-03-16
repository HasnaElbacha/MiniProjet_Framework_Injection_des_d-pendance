package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DependencyConfig config = XMLConfigLoader.loadConfig("Config.xml");
        if (config != null) {
            for (Bean bean : config.getBeans()) {
                System.out.println("Nom du bean : " + bean.getName());
                System.out.println("Classe du bean : " + bean.getClazz());
            }
        }
    }
}