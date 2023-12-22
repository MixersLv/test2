package packagelogic;

import packagesex.SexFile;

import java.io.IOException;
import java.util.Scanner;

public class Logic {
    public Logic() throws IOException {
    }

    SexFile sexFile = new SexFile();
//    Scanner sexScanner = sexFile.getSexScanner();
    Scanner sexScanner2 = sexFile.getSexScanner2();

    public void testMethod() throws IOException {
        String curLine = sexScanner2.nextLine();
        System.out.println(curLine);

        // ./ Variant
//        curLine = sexScanner.nextLine();
//        System.out.println(curLine);
    }
}
