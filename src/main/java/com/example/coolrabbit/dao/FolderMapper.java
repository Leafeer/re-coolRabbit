package com.example.coolrabbit.dao;

import com.example.coolrabbit.entity.Folder;

public interface FolderMapper {
    int deleteByPrimaryKey(Integer folderId);

    int insert(Folder record);

    int insertSelective(Folder record);

    Folder selectByPrimaryKey(Integer folderId);

    int updateByPrimaryKeySelective(Folder record);

    int updateByPrimaryKey(Folder record);
}