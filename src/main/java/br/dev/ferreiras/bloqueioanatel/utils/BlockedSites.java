package pak;

import java.io.*;
import java.util.*;

public class BlockedSites {
  public static void main(String[] args) {
    Set<String> sites = readBlockedSites();
    List<String> list = new ArrayList<>();
    int count = 1;
    for (String site : sites) {

      System.out.println(site);
      count++;
    }
    System.out.println(count);
//    for (String site : list) {
//      System.out.println(" " + site);
//    }
//    System.out.println(list.size());

//    writeBlockedSites(sites);
  }

  public static Set<String> readBlockedSites() {
    String line = null;
    String pathOne = "/home/rferreira/dev/pakTelecom/src/dns/primario/rpz/maissites.csv";
    String pathTwo = "/home/rferreira/dev/pakTelecom/src/dns/primario/rpz/rpz.txt";
    int[] s= {1,2,3,4,5};
    int[] t = Arrays.copyOf(s,3);
    System.out.println(Arrays.toString(t));
    List<String> blockedSitesOne = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(pathOne))) {
      while ((line = br.readLine()) != null) {
        String[] lines = line.split("\\s");
        blockedSitesOne.add(lines[0]);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    List<String> blockedSitesTwo = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(pathTwo))) {
      while ((line = br.readLine()) != null) {
        String[] lines = line.split("\\s");
        blockedSitesTwo.add(lines[0]);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    Set<String> set = new TreeSet<>();
    set.addAll(blockedSitesOne);
    set.addAll(blockedSitesTwo);

    return set;
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
    String fileName = "ascendingBlockedSitesMar24.txt";
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

