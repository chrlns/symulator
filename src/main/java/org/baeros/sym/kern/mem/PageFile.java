/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.baeros.sym.kern.mem;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 *
 * @author chris
 */
public class PageFile {

    private RandomAccessFile pageFile;

    public PageFile(int size) throws FileNotFoundException {
        pageFile = new RandomAccessFile("pagefile.bin", "rw");
    }
}
