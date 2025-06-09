package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TushudingdanDao;
import com.entity.TushudingdanEntity;
import com.service.TushudingdanService;
import com.entity.vo.TushudingdanVO;
import com.entity.view.TushudingdanView;

@Service("tushudingdanService")
public class TushudingdanServiceImpl extends ServiceImpl<TushudingdanDao, TushudingdanEntity> implements TushudingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TushudingdanEntity> page = this.selectPage(
                new Query<TushudingdanEntity>(params).getPage(),
                new EntityWrapper<TushudingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TushudingdanEntity> wrapper) {
		  Page<TushudingdanView> page =new Query<TushudingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TushudingdanVO> selectListVO(Wrapper<TushudingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TushudingdanVO selectVO(Wrapper<TushudingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TushudingdanView> selectListView(Wrapper<TushudingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TushudingdanView selectView(Wrapper<TushudingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
