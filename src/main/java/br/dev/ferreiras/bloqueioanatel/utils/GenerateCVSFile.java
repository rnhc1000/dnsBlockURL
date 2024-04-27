package br.dev.ferreiras.bloqueioanatel.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class GenerateCVSFile {

  public static void main(String[] args) throws IOException {

    String filePath = "/home/rferreira/Downloads/";
    String fileName = "blockedURL.txt";
    Set<String> blockedSites = new TreeSet<>();
    boolean existsFile = fileExists(filePath, fileName);
    if (existsFile) {
      blockedSites = readBlockedSites(filePath, fileName);
    }

    System.out.println(blockedSites);
  }
  public static boolean fileExists(String filePath, String fileName) throws IOException {
    String fileToBeProcessed = filePath.concat(fileName);
    boolean response = true;
    try {

      File handler = new File(fileToBeProcessed);
      if (handler.createNewFile()) {
        System.out.println("Arquivo de saida criado com sucesso");
        response = false;
      } else {
        System.out.println("Arquivo ja existe!");
      }

    } catch (IOException ex) {

      throw new IOException("Arquivo de saida nao pode ser criado! " + ex.getMessage());

    }

    return response;
  }

  public static Set<String> readBlockedSites(String filePath, String fileName) {
    String line = null;
    String path = filePath.concat(fileName);

    List<String> blockedSites = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      while ((line = br.readLine()) != null) {
        String[] lines = line.split("\\s");
        blockedSites.add(lines[0]);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }


    return new TreeSet<>(blockedSites);
  }

  public static void generateCSV(Set<String> blockedSites) {

    enum blockedHeaders {
      id,
      serial,
      created_at,
      url,
      status
    }
  }
}
