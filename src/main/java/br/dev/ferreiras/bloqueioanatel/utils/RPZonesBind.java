package pak;

import java.io.*;
import java.util.*;

public class RPZonesBind {
  public static void main(String[] args) throws IOException {
    Set<String> sites = readBlockedSites();
    List<String> list = new ArrayList<>();
    int count = 1;
    for (String site : sites) {

      System.out.println(site);
      count++;
    }
    System.out.println(count);
    for (String site : list) {
      System.out.println(" " + site);
    }
    System.out.println(list.size());

    writeBlockedSites(sites);
  }

  public static Set<String> readBlockedSites() {
    String line = null;
    String path = "/home/rferreira/dev/pakTelecom/src/dns/primario/rpz/";
    String file = "sites.txt";
    String fileName = path.concat(file);
    List<String> blockedSites = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

      while ((line = br.readLine()) != null) {
        String[] lines = line.split("\\s");
        blockedSites.add(lines[0]);

      }

    } catch (IOException e) {

      throw new RuntimeException(e);

    }

    return new TreeSet<>(blockedSites);
  }

  public static boolean fileExists(String filePath, String fileName) throws IOException {
    String fileToBeProcessed = filePath.concat(fileName);
    try {
      File handler = new File(fileToBeProcessed);
      if (handler.createNewFile()) {
        System.out.println("Arquivo de saida criado com sucesso");
      }
    } catch (IOException ex) {
      throw new IOException("Arquivo de saida nao pode ser criado! " + ex.getMessage());
    }

    return true;
  }

  public static void writeBlockedSites(Set<String> blockedSites) throws IOException {
    String filePath = "/home/rferreira/dev/pakTelecom/src/dns/primario/rpz/";
    String fileName = "ascendingBlockedSitesApr24.txt";
    boolean OK = fileExists(filePath, fileName);
    int count = 0;

    if (OK) {
      try (FileWriter fw = new FileWriter(filePath.concat(fileName))) {
        List<String> sortedList = new ArrayList<>();
//        sortedList = blockedSites.stream().sorted().toList();
//        System.out.println(sortedList.size());
        for (String sites : blockedSites) {
          sortedList.add(sites.concat("\s\s\s\sIN\s\s\s\sCNAME\s\s\s\s."));
        }
        System.out.println(blockedSites.size());
        for (String sites : sortedList) {
          fw.write(sites);
          fw.write("\n");
          count++;
        }

      } catch (IOException ex) {
        throw new IOException("File not accessible! " + ex.getMessage());
      }
    }
    System.out.println("Arquivo Criado" + count + " linhas!");
  }

  public static Set<String> mergeFiles(List<String> listOne, List<String> listTwo) {

    Set<String> set = new LinkedHashSet<>();
    set.addAll(listOne);
    set.addAll(listTwo);

    return set;
  }
}



