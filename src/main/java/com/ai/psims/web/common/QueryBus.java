package com.ai.psims.web.common;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ai.psims.web.common.interfaces.IQueryBus;
import com.ai.psims.web.dao.ImportMapper;
import com.ai.psims.web.model.Employee;
import com.ai.psims.web.model.EmployeeExample;
import com.ai.psims.web.model.Goods;
import com.ai.psims.web.model.GoodsExample;
import com.ai.psims.web.model.Import;
import com.ai.psims.web.model.ImportExample;
import com.ai.psims.web.model.TbCustomer;
import com.ai.psims.web.model.TbCustomerExample;
import com.ai.psims.web.model.TbProvider;
import com.ai.psims.web.model.TbProviderExample;
import com.ai.psims.web.model.TbStorehouse;
import com.ai.psims.web.model.TbStorehouseExample;
import com.ai.psims.web.service.ICustomerService;
import com.ai.psims.web.service.IEmployeeService;
import com.ai.psims.web.service.IGoodsService;
import com.ai.psims.web.service.IProviderService;
import com.ai.psims.web.service.IStorehouseService;
import com.ai.psims.web.util.CreateIdUtil;

@Service
public class QueryBus implements IQueryBus {
	@Resource(name = "providerServiceImpl")
	private IProviderService providerService;
	@Resource(name = "storehouseServiceImpl")
	private IStorehouseService storehouseService;
	@Resource(name = "goodsServiceImpl")
	private IGoodsService goodsService;
	@Resource(name = "importMapper")
	private ImportMapper importMapper;
	@Resource(name = "customerServiceImpl")
	private ICustomerService customerService;
	@Resource(name = "employeeServiceImpl")
	private IEmployeeService employeeService;

	public List<TbProvider> queryProvider() {
		List<TbProvider> pList = new ArrayList<TbProvider>();
		TbProviderExample tbProviderExample=new  TbProviderExample();
		pList = providerService.queryProvider(tbProviderExample);
		return pList;
	}

	public List<TbStorehouse> queryStorehouse() {
		TbStorehouseExample example = new TbStorehouseExample();
		example.createCriteria().andEndtimeIsNull();
		return storehouseService.queryStorehouse(example);
	}

	public List<TbCustomer> queryCustomer(TbCustomerExample customerExample) {
		return customerService.queryCustomer(customerExample);
	}

	public List<Employee> queryEmployee(EmployeeExample employeeExample) {
		return employeeService.selectByExample(employeeExample);
	}

	public List<Goods> queryGoodsByName(GoodsExample example) {
		return goodsService.selectByExample(example);
	}

	public List<Import> queryImport() {
		List<Import> importList = new ArrayList<Import>();
		ImportExample example = new ImportExample();
		example.createCriteria().andImportStatusNotEqualTo("00");
		importList = importMapper.selectByExample(example);
		for (Import import1 : importList) {
			import1.setImportStatus(CreateIdUtil.getTranslation(import1
					.getImportStatus()));
			import1.setPaymentType(CreateIdUtil.getTranslation(import1
					.getPaymentType()));
		}
		return importList;
	}

}
