package com.ai.psims.web.service;

import java.util.List;
import com.ai.psims.web.model.TbGoods2customer;
import com.ai.psims.web.model.TbGoods2customerExample;

public interface IGoods2CustomerService {

	public List<TbGoods2customer> queryGoods2Customer(
			TbGoods2customerExample goods2CustomerQuery);

}
