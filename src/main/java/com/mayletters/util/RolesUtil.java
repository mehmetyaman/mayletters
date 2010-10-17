package com.mayletters.util;

import java.util.List;

import com.mayletters.domain.Right;


public class RolesUtil {

	public static List<Right> getGuestRole(List<Right> rights) {
		rights.add(new Right(Constants.SEND_CARD));
		rights.add(new Right(Constants.SEND_LETTER));
		return rights;
	}

	/**
	 * role for only registered roles
	 */
	public static List<Right> getSimpleRole(List<Right> rights) {
		getGuestRole(rights);
		rights.add(new Right(Constants.STORE_LAST_5_LETTERS));
		rights.add(new Right(Constants.TRACKING));
		return rights;
	}

	public static List<Right> getAdvancedRole(List<Right> rights) {
		getSimpleRole(rights);
		rights.add(new Right(Constants.ENDLESS_LETTER_PREPARE));
		rights.add(new Right(Constants.BLOCK_SENDING));
		return rights;
	}

	public static List<Right> getEnterpriseRole(List<Right> rights) {
		rights.add(new Right(Constants.SEND_VIA_WS));
		rights.add(new Right(Constants.MONTHLY_BILLING));
		return rights;
	}

	public static List<Right> getAdminRole(List<Right> rights) {
		rights.add(new Right(Constants.USER_MANAGEMENT));
		rights.add(new Right(Constants.LETTER_CARD_QUERY));
		rights.add(new Right(Constants.LETTER_CARD_UPDATE));
		rights.add(new Right(Constants.MONTHLY_DAILY_SEND_TRACKING));
		rights.add(new Right(Constants.MONTHLY_DAILY_BILLING));
		rights.add(new Right(Constants.BANK_ACCOUNT_REPORT));
		rights.add(new Right(Constants.SEND_AMOUNT_COMPARE_REPORT));
		return rights;
	}

	public static List<Right> getOperatorRole(List<Right> rights) {
		rights.add(new Right(Constants.LETTER_CARD_SEND));
		rights.add(new Right(Constants.LETTER_CARD_PRINT));
		rights.add(new Right(Constants.LETTER_CARD_STATUS_UPDATE));
		rights.add(new Right(Constants.DAILY_STATUS_REPORT_Z_REPORT));
		rights.add(new Right(Constants.LETTER_SELECT_AND_SEND));
		rights.add(new Right(Constants.PUT_POSTING_RESULTS));
		return rights;
	}

}
