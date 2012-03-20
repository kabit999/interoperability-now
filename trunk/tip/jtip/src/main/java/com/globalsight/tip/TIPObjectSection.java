package com.globalsight.tip;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Represents a TIP object section.  Object sections are identified by
 * a name and a type.  (There may be more than one section 
 * for a given type, distinguished by sequence number.)  An object 
 * section contains one or more objects of the specified type.
 */
// TODO eventually factor out TIPObject from TIPObjectFile
public class TIPObjectSection {
    private TIPPackage tip;
    private String type;
    private String name;
    Collection<TIPObjectFile> objects = new ArrayList<TIPObjectFile>();
    
    TIPObjectSection() { }
    
    public TIPObjectSection(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    void setPackage(TIPPackage tip) {
        this.tip = tip;
    }
    
    TIPPackage getPackage() {
        return tip;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Collection<TIPObjectFile> getObjectFiles() {
        return objects;
    }
    
    public TIPObjectFile addObject(TIPObjectFile object) {
        objects.add(object);
        object.setPackage(tip);
        object.setSection(this);
        return object;
    }
    
    @Override
    public String toString() {
        return name + "(" + type + ")";
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || !(o instanceof TIPObjectSection)) {
            return false;
        }
        TIPObjectSection s = (TIPObjectSection)o;
        return type.equals(s.getType()) && 
                name.equals(s.getName()) &&
                objects.equals(s.getObjectFiles());
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + type.hashCode();
        result = prime * result + objects.hashCode();
        return result;
    }
}