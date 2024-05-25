package com.example.lab2.bai1;

import java.io.File;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class ParamService {
	ServletContext app;
	@Autowired
	HttpServletRequest request;

	public String getString(String name, String defaultValue) {
		String value = request.getParameter(name);

		return (value != null) ? value : defaultValue;
	}
	public File UploadService(MultipartFile file , String folder) {
		
		File dir = new File(app.getRealPath(folder));
		if(!dir.exists()) {
			 dir.mkdir();
			 
		}
		try {
			File saveFile 	= new File(dir,file.getOriginalFilename());
			file.transferTo(saveFile);
			
			return saveFile;
		} catch (Exception e) {
			// TODO: handle exception
			 System.out.println("looxi"+e);
		}
		return null;
		
	
		
	}
	
	public int getInt(String name, int defaultValue) {
		String value = request.getParameter(name);
		
		return (value != null) ? Integer.parseInt(value) : defaultValue;

	}

	public double getDouble(String name, double defaultValue) {
		String value = request.getParameter(name);

		return (value != null) ? Double.parseDouble(value) : defaultValue;

	}

	public boolean getBoolean(String name, boolean defaultValue) {

		String value = request.getParameter(name);

		return (value != null) ? Boolean.parseBoolean(value) : defaultValue;

	}

	public Date getDate(String name, String pattern) {
		String value = request.getParameter(name);
		if (value != null) {
			try {
				SimpleDateFormat formatter = new SimpleDateFormat(pattern);
				return (Date) formatter.parse(value);
			} catch (ParseException e) {

				e.printStackTrace();
			}
		}
		return null;
	}

	public File save(MultipartFile file, String path) {
		// Kiểm tra nếu file tải lên không rỗng
		if (!file.isEmpty()) {
			try {

				File directory = new File(path);
				if (!directory.exists()) {
					directory.mkdirs();
				}
				File savedFile = new File(path + File.separator + file.getOriginalFilename());
				file.transferTo(savedFile);
				return savedFile; //
			} catch (Exception e) {
				System.out.println(e);
			}

		} else {
			return null; // Không có file nào được tải lên, trả về null
		}
		return null;
	}
}
