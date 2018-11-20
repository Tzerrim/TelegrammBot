package com.nox.functionality.impl;

import com.nox.functionality.inteface.strFunctions;

import java.io.File;
import java.text.SimpleDateFormat;

public class fileLastModified implements strFunctions {

    String result = new String();

    public String lastModified() {
        File file = new File("D:\\Dropbox\\Role Games\\ShadowRun\\LOG SCRIBUS.docx");

        System.out.println("Before Format : " + file.lastModified());

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

       return (file.getName() + " : " + sdf.format(file.lastModified()));
    }


    public String getResult() {
        return lastModified();
    }
}
