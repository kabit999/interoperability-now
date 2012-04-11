package com.globalsight.tip;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Represents a TIP resource represented as a file.
 */
public class TIPObjectFile {
    private TIPPackage tipPackage;
    private TIPObjectSection section;

    private String name, location;
    private int sequence;
    
    TIPObjectFile() { }

    /**
     * Constructor where name and location are the same.
     * @param location
     * @param sequence
     */
    public TIPObjectFile(String location, int sequence) {
        this(location, location, sequence);
    }

    public TIPObjectFile(String location, String name, int sequence) {
        this.location = location;
        this.name = name;
        this.sequence = sequence;
    }
    
    public TIPObjectSection getSection() {
        return section;
    }
    
    public void setSection(TIPObjectSection section) {
        this.section = section;
    }
    
    public InputStream getInputStream() throws IOException {
        return new BufferedInputStream(
                new FileInputStream(getFilePath()));
    }

    public OutputStream getOutputStream() throws IOException, TIPException {
        File f = getFilePath();
        if (!f.exists()) {
            if (!FileUtil.recursiveCreate(f)) {
                throw new TIPException(
                        "Unable to open resource for writing: " + location);
            }
        }
        return new BufferedOutputStream(
                new FileOutputStream(getFilePath()));
    }
    
    private File getFilePath() {
        return tipPackage.getPackageObjectFile(
                section.getName() + File.separator + location);
    }
    
    void setPackage(TIPPackage tipPackage) {
        this.tipPackage = tipPackage;
    }

    public String getName() {
        // Name defaults to location, if name is not specified
        return name != null ? name : getLocation();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
    
    @Override
    public String toString() {
        return location + "(" + name + ", " + sequence + ")";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + location.hashCode();
        result = prime * result + name.hashCode();
        result = prime * result + sequence;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || !(o instanceof TIPObjectFile)) {
            return false;
        }
        TIPObjectFile f = (TIPObjectFile)o;
        return f.getLocation().equals(getLocation()) &&
                f.getName().equals(getName()) &&
                f.getSequence() == getSequence();
    }
}