package com.soft1721.jianyue.api.mapper;

import com.soft1721.jianyue.api.entity.Img;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ImgMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "a_id", column = "aId"),
            @Result(property = "img_url", column = "imgs")
    })
    @Select("SELECT * FROM t_img WHERE a_id = #{aId}")
    List<Img> selectImgsByAId(int aId);

}
