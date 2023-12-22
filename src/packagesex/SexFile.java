package packagesex;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SexFile {
    public SexFile() throws IOException {
    }


    Path sexpathfull = Path.of("C:\\Users\\123\\IdeaProjects\\test2\\src\\sex.txt");
    Scanner sexScanner2 = new Scanner(sexpathfull);

    public Scanner getSexScanner2() {
        return sexScanner2;
    }

    //  ./ Variant

//    Path sexpath = Path.of("./sex.txt");
//    Scanner sexScanner = new Scanner(sexpath);
//    public Scanner getSexScanner() {
//        return sexScanner;
//    }



}
