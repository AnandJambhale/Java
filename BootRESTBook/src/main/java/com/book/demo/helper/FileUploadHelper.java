package com.book.demo.helper;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class FileUploadHelper {

    public final  String UPLOAD_DIR="D:\\REST API\\image";
    public boolean uploadFile(MultipartFile multipartFile){
        boolean f=false;
        try {
//            InputStream is=file.getInputStream();
//            byte data[]=new byte[is.available()];
//            is.read(data);
//
//            //write
//            FileOutputStream fos=new FileOutputStream(UPLOAD_DIR+ File.separator+file.getOriginalFilename());
//            fos.write(data);
//            fos.flush();
//            f=true;

            Files.copy(multipartFile.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            f=true;
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        return f;
    }
}
