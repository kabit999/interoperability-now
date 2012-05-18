package com.globalsight.tip;

import java.io.IOException;
import java.io.InputStream;

public class TIPPFactory {

    /**
     * Create a new TIPPackage object from a byte stream.  The data 
     * must be ZIP-encoded.  The TIPPackage will be expanded to disk
     * and backed by a set of temporary files.
     * 
     * @param inputStream
     * @return new TIPPackage
     * @throws IOException 
     */
    public static TIPP openFromStream(InputStream inputStream) 
            throws TIPPException, IOException {
    	return new PackageReader(new StreamPackageSource(inputStream)).load();
	}
    
    public static WriteableRequestTIPP newRequestPackage(TIPPTaskType type) 
			throws TIPPException, IOException {
    	PackageSource source = new TempFilePackageSource();
    	source.open();
    	WriteableRequestTIPP tipPackage = new WriteableRequestTIPP(source);
    	tipPackage.setManifest(Manifest.newRequestManifest(tipPackage, type));
    	return tipPackage;
    }
    
    public static WriteableResponseTIPP newResponsePackage(TIPPTaskType type)
    		throws TIPPException, IOException {
    	PackageSource source = new TempFilePackageSource();
    	source.open();
		WriteableResponseTIPP tipPackage = new WriteableResponseTIPP(source);
		tipPackage.setManifest(Manifest.newResponseManifest(tipPackage, type));
		return tipPackage;
    }
    
    public static WriteableResponseTIPP newResponsePackage(RequestTIPP requestPackage)
    		throws TIPPException, IOException {
    	PackageSource source = new TempFilePackageSource();
    	source.open();
    	WriteableResponseTIPP tipPackage = new WriteableResponseTIPP(source);
    	tipPackage.setManifest(Manifest.newResponseManifest(tipPackage, 
    										  requestPackage));
    	return tipPackage;	
    }
}