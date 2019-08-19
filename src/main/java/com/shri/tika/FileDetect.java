package com.shri.tika;

import java.io.File;
import java.io.IOException;

import org.apache.tika.Tika;

public class FileDetect {
    public static void main(String[] args) throws IOException {
        Tika tika = new Tika();
        String type = tika.detect(new File("C:\\SHRIKANT\\PDX\\Documentation\\Tech_Buss_Documentation\\Central Service\\KAFKA-PNM\\PNM EOPN Rearchitecture.docx"));
        System.out.println("file type : " + type);
        type = tika.detect(new File("C:\\SHRIKANT\\PDX\\Documentation\\Tech_Buss_Documentation\\Central Service\\KAFKA-PNM\\PNM Rules.xlsx"));
        System.out.println("file type : " + type);
        type = tika.detect(new File("C:\\SHRIKANT\\PDX\\Documentation\\Tech_Buss_Documentation\\Central Service\\KAFKA-PNM\\PNM - Mobile Service - EOPN Arch.vsdx"));
        System.out.println("file type : " + type);
        type = tika.detect(new File("C:\\SHRIKANT\\PDX\\Documentation\\Tech_Buss_Documentation\\Central Service\\KAFKA-PNM\\PNM - Mobile Service - EOPN Arch.pdf"));
        System.out.println("file type : " + type);

    }
} 