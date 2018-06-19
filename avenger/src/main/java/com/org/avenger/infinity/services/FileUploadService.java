package com.org.avenger.infinity.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;


public abstract class FileUploadService {
	//public ResponseEntity<?> store(MultipartFile file) ;
	public abstract Resource loadFile(String filename);
	public abstract void deleteAll();
	public abstract void init();

}
