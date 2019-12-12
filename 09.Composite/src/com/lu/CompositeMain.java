package com.lu;

import com.lu.files.Folder;
import com.lu.files.Markdown;
import com.lu.files.Pdf;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 11:18
 */
public class CompositeMain {
    public static void main(String[] args) {
        Folder root = new Folder("/");

        File jvmPdf2 = new Pdf("深入理解Java虚拟机（第二版）.pdf");
        Folder notes = new Folder("/notes");

        File jvmMd = new Markdown("Jvm笔记.md");
        File jvmPdf3 = new Pdf("深入理解Java虚拟机（第三版）.pdf");

        notes.add(jvmMd);
        notes.add(jvmPdf3);

        root.add(jvmPdf2);
        root.add(notes);

        root.display();
    }
}
