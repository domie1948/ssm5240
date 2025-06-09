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


import com.dao.DianzishuziyuanDao;
import com.entity.DianzishuziyuanEntity;
import com.service.DianzishuziyuanService;
import com.entity.vo.DianzishuziyuanVO;
import com.entity.view.DianzishuziyuanView;

@Service("dianzishuziyuanService")
public class DianzishuziyuanServiceImpl extends ServiceImpl<DianzishuziyuanDao, DianzishuziyuanEntity> implements DianzishuziyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianzishuziyuanEntity> page = this.selectPage(
                new Query<DianzishuziyuanEntity>(params).getPage(),
                new EntityWrapper<DianzishuziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianzishuziyuanEntity> wrapper) {
		  Page<DianzishuziyuanView> page =new Query<DianzishuziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianzishuziyuanVO> selectListVO(Wrapper<DianzishuziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianzishuziyuanVO selectVO(Wrapper<DianzishuziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianzishuziyuanView> selectListView(Wrapper<DianzishuziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianzishuziyuanView selectView(Wrapper<DianzishuziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
