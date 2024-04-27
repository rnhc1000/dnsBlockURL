package br.dev.ferreiras.bloqueioanatel.utils;

import org.springframework.web.multipart.MultipartFile;

import br.dev.ferreiras.bloqueioanatel.entity.BloqueioAnatelEntity;

import java.util.ArrayList;
import java.util.List;

public class ReadCSVFile {

  public static String type = "text/csv";

  public static boolean hasCsvFormat(MultipartFile file) {
    if (!type.equals(file.getContentType())) {
      return false;
    }

    return true;
  }

  public static List<BloqueioAnatelEntity> cvsToList(String path) {
      List<BloqueioAnatelEntity> bloqueioList = new ArrayList<>();
//    try (CSVParser csvParser = new CSVParser(Files.newBufferedReader(Paths.get(path)),
//            CSVFormat.RFC4180)) {
//      for (CSVRecord csvRecord : csvParser) {
//
//        BloqueioAnatelEntity bloqueio = new BloqueioAnatelEntity(
//                Integer.parseInt(csvRecord.get("id")),
//                csvRecord.get("serial"),
//                csvRecord.get((LocalDate)),
//                csvRecord.get("url"),
//                csvRecord.get("status")
//        );
//        bloqueioList.add(bloqueio);
//      }
//
//    } catch (IOException ex) {
//      throw new RuntimeException("CSV data is failed to be parsed! " + ex.getMessage());
//    }

    return bloqueioList;
  }
}
