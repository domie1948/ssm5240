package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianzishuziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianzishuziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianzishuziyuanView;


/**
 * 电子书资源
 *
 * @author 
 * @email 
 * @date 2021-04-21 13:51:38
 */
public interface DianzishuziyuanService extends IService<DianzishuziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianzishuziyuanVO> selectListVO(Wrapper<DianzishuziyuanEntity> wrapper);
   	
   	DianzishuziyuanVO selectVO(@Param("ew") Wrapper<DianzishuziyuanEntity> wrapper);
   	
   	List<DianzishuziyuanView> selectListView(Wrapper<DianzishuziyuanEntity> wrapper);
   	
   	DianzishuziyuanView selectView(@Param("ew") Wrapper<DianzishuziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianzishuziyuanEntity> wrapper);
   	
}

