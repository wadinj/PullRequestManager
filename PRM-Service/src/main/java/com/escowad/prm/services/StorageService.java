package com.escowad.prm.services;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
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

				return "You successfully uploaded file=" + name;
			} catch (Exception e) {
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		} else {
			return "You failed to upload " + name
					+ " because the file was empty.";
		}
    }
}
