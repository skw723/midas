package com.midasit.carte.common.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.midasit.carte.common.model.ImageInfo;

@Mapper
public interface ImageMapper {
	public void insertImageInfo(ImageInfo image);

	public void deleteImageInfo(long menuId);
}
