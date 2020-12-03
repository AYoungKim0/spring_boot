package kr.or.ksmart37.ksmart_mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.ksmart37.ksmart_mybatis.dto.Goods;
import kr.or.ksmart37.ksmart_mybatis.mapper.GoodsMapper;

@Service
@Transactional
public class GoodsService {
	
	@Autowired 
	private GoodsMapper goodsMapper;
	
	public String modifyGoods(Goods goods) {
		String result = "상품 수정 실패";
		
		int modifyCheck = goodsMapper.modifyGoods(goods);
		
		if(modifyCheck > 0) result = "상품 수정 완료";
		
		return result;
	}
	
	public Goods getGoodsByCode(String goodsCode) {
		
		//goodsMapper에서 코드에 일치하는 상품정보가 담긴 객체 받아오기
		Goods goods = goodsMapper.getGoodsByCode(goodsCode);
		
		// Goods 객체 return 
		return goods;
	}

}
