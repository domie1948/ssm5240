package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TushudingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TushudingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TushudingdanView;


/**
 * 图书订单
 *
 * @author 
 * @email 
 * @date 2021-04-21 13:51:38
 */
public interface TushudingdanService extends IService<TushudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TushudingdanVO> selectListVO(Wrapper<TushudingdanEntity> wrapper);
   	
   	TushudingdanVO selectVO(@Param("ew") Wrapper<TushudingdanEntity> wrapper);
   	
   	List<TushudingdanView> selectListView(Wrapper<TushudingdanEntity> wrapper);
   	
   	TushudingdanView selectView(@Param("ew") Wrapper<TushudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TushudingdanEntity> wrapper);
   	
}

