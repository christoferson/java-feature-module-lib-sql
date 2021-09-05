import demo.service.IAccountService;
import demo.service.sql.AccountServiceSql;

module demo.module.lib.sql {
	requires demo.module.lib;
	
	provides IAccountService with AccountServiceSql;
}