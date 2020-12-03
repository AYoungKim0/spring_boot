package kr.or.ksmart37.ksmart_mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart37.ksmart_mybatis.dto.Goods;

@Mapper
public interface GoodsMapper {
	
	public int modifyGoods(Goods goods);
	
	public Goods getGoodsByCode(String goodsCode);

}
