## DNS RPZ - URL Blocked by DNS - @Ricardo Ferreira
In order to meet brazilian authorities requirements to block URLs 
being used to circumvent the legal brazilian regulatory system, this is 
a way of automate the creation of DNS Zones using BIND 9 and superior in sync 
with the Anatel ( Regulatory Agency ) guidance and data available at
a public API. The goal here is to allow Internet Service Providers that have BIND
as their DNS Engines to be fully compliant with the
legal and justice requirements near real-time with the authorities request.

## _Tools_
- Java 17
- IntelliJ Community Edition
- Spring Boot
- MongoDB
- ReactJS
- HTML
- CSS
- TypeScript

## _Table of contents_
- [DNS RPZ - URL Blocked by DNS - @Ricardo Ferreira](#dns-rpz---url-blocked-by-dns---ricardo-ferreira)
- [_Tools_](#tools)
- [_Table of contents_](#table-of-contents)
- [_Screenshot_](#screenshot)
- [_Links_](#links)
- [_Built with_](#built-with)
- [_What I practiced_](#what-i-practiced)
- [_Continued development_](#continued-development)
  - [_Useful resources_](#useful-resources)
- [_Author_](#author)
- [Acknowledgments](#acknowledgments)


## _Screenshot_
[![](./anablock-page.png)]()
## _Links_
- Live Site URL: [] 
## _Built with_
[![My Skills](https://skillicons.dev/icons?i=java,spring,mongodb,idea,redhat,aws,git,javascript,css,html)](https://skillicons.dev)

  


 ## _What I practiced_
```java
package br.dev.ferreiras.bloqueioanatel;


import java.io.*;
import java.util.*;

public class BlockedSites {


  public static Set<String> readBlockedSites() {
    String line = null;
    String pathOne = "/home/rferreira/dev/src/dns/primario/rpz/sites.csv";
    String pathTwo = "/home/rferreira/dev/src/dns/primario/rpz/rpz.txt";
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
        System.out.println("File created!");
      }
    } catch (IOException ex) {
      throw new IOException("File could not be created! " + ex.getMessage());
    }

    return true;
  }

  public static void writeBlockedSites(Set<String> blockedSites) throws IOException {
    String filePath = "/home/rferreira/dev/pakTelecom/src/dns/primario/rpz/";
    String fileName = "ascendingBlockedSites.txt";
    boolean OK = fileExists(filePath, fileName);
    int count = 0;

    if (OK) {
      try (FileWriter fw = new FileWriter(filePath.concat(fileName))) {
        List<String> sortedList = new ArrayList<>();

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
    
  }

  public static Set<String> mergeFiles(List<String> listOne, List<String> listTwo) {

    Set<String> set = new LinkedHashSet<>();
    set.addAll(listOne);
    set.addAll(listTwo);

    return set;
  }
}



``` 

## _Continued development_
- Application still being developed
### _Useful resources_
- [https://docs.oracle.com/en/java/] Always trust and read the official documentation!
- [https://anatel.gov.br]- Official Agency Regulatory site
- [https://www.zytrax.com/books/dns/ch9/rpz.html] - Response Policy Zone
- [https://start.spring.io/] - Quick start of a Spring Project
- [https://www.mongodb.com/] - NoSQL DB to store more than 5000 URLs
- [https://www.linuxbabe.com/ubuntu/set-up-response-policy-zone-rpz-in-bind-resolver-on-debian-ubuntu]
- 
## _Author_
- Website - [https://ferreiras.dev.br]  
## Acknowledgments
