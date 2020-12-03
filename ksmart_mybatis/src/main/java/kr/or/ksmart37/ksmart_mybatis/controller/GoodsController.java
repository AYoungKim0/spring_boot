package kr.or.ksmart37.ksmart_mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import kr.or.ksmart37.ksmart_mybatis.dto.Goods;
import kr.or.ksmart37.ksmart_mybatis.service.GoodsService;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	
	@PostMapping("modifyGoods")
	public String modifyGoods(Goods goods) {
		
		System.out.println("상품 수정화면에서 입력 받은 값->"+ goods);
		
		String result = goodsService.modifyGoods(goods);
		
		System.out.println(goods.getGoodsCode() + " : " + result);
		
		return "redirect:/sellerList";
	}

}
