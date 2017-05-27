package com.midasit.carte.common.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {
	@RequestMapping(value = "view/{path}", produces = {MediaType.IMAGE_GIF_VALUE, MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
	public byte[] viewImage(@PathVariable String path) throws IOException {
		File image = new File("D:\\upload\\", path);
		return FileUtils.readFileToByteArray(image);
	}
}
