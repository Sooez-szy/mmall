package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by sooszy on 2017/11/12.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);

}
