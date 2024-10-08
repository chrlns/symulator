/*
 * BærOS System Simulator
 * Copyright (c) 2024 Christian Lins <christian@lins.me>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.baeros.sym.kern.mem;

import java.io.FileNotFoundException;

/**
 * Memory of the system.
 *
 * @author Christian Lins
 */
public class Memory {

    private final byte[] physicalMemory;
    private final PageFile pageFile;
    private final int pageSize;

    public Memory(int physSize, int pageFileSize, int pageSize) throws FileNotFoundException {
        if (physSize % pageSize != 0 || pageFileSize % pageSize != 0) {
            throw new IllegalArgumentException("physSize % pageSize != 0 || pageFileSize % pageSize != 0");
        }

        this.pageSize = pageSize;
        physicalMemory = new byte[physSize];
        pageFile = new PageFile(pageFileSize);
    }

    /**
     * Reads the byte at the virtual address.
     *
     * @param address Virtual address to be read
     * @return
     */
    public byte read(int address) {
        return 0;
    }

    /**
     * Write the byte to the virtual address.
     *
     * @param address
     * @param datum
     */
    public void write(int address, byte datum) {

    }

    protected Page getPage(int pageNum) {
        return null;
    }

    protected PageFrame getPageFrame(int pageFrameNum) {
        return null;
    }

    /**
     *
     * @param size
     * @return
     */
    public int allocateMemory(int size) {
        return -1;
    }

    /**
     * 
     * @param ptr
     */
    public void freeMemory(int ptr) {

    }
}
