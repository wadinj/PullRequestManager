package com.escowad.prm.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.web.multipart.MultipartFile;

public class StorageService {
	
	
	public String store(String folder, MultipartFile file) {
		Path rootLocation = new File("folder").toPath();
		
        try {
            if (file.isEmpty()) {
                return "Failed to store empty file " + file.getOriginalFilename();
            }
            Files.copy(file.getInputStream(), rootLocation.resolve(file.getOriginalFilename()));
        } catch (IOException e) {
        	return "Failed to store file " + file.getOriginalFilename() + "\n\t" + e;
        }
        return "You successfully uploaded " + file.getOriginalFilename() + "!";
    }
}
