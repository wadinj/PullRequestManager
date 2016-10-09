package com.escowad.prm.services;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.nio.file.Path;

import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

public class StorageService {
	
	public Logger logger = Logger.getLogger(StorageService.class);
	
	public String store(String folder, MultipartFile file) {
		Path rootLocation = new File("C:\\Temp\\").toPath();
		String name = file.getOriginalFilename();
		logger.info("File empty ? " + file.isEmpty());
		if (!file.isEmpty()) {
			
			try {
				byte[] bytes = file.getBytes();
				File dir = new File("C:\\Temp\\");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				logger.info("Server File Location="
						+ serverFile.getAbsolutePath());

				return serverFile.getAbsolutePath();
			} catch (Exception e) {
				return "";
			}
		} else {
			return "";
		}
    }
	
	public File[] getFiles(){
		FilenameFilter jarFilter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				String lowercaseName = name.toLowerCase();
				if (lowercaseName.endsWith(".jar")) {
					return true;
				} else {
					return false;
				}
			}
		};
		File dir = new File("C:\\Temp\\");
		return dir.listFiles(jarFilter);
	}
}
