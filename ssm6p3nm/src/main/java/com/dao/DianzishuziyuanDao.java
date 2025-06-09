package com.dao;

import com.entity.DianzishuziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianzishuziyuanVO;
import com.entity.view.DianzishuziyuanView;


/**
 * 电子书资源
 * 
 * @author 
 * @email 
 * @date 2021-04-21 13:51:38
 */
public interface DianzishuziyuanDao extends BaseMapper<DianzishuziyuanEntity> {
	
	List<DianzishuziyuanVO> selectListVO(@Param("ew") Wrapper<DianzishuziyuanEntity> wrapper);
	
	DianzishuziyuanVO selectVO(@Param("ew") Wrapper<DianzishuziyuanEntity> wrapper);
	
	List<DianzishuziyuanView> selectListView(@Param("ew") Wrapper<DianzishuziyuanEntity> wrapper);

	List<DianzishuziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DianzishuziyuanEntity> wrapper);
	
	DianzishuziyuanView selectView(@Param("ew") Wrapper<DianzishuziyuanEntity> wrapper);
	
}
