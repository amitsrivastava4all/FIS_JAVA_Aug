package com.fis.dao.constants;

public interface DAOConstants {
String LOGIN_SQL = "select users.userid, users.password,users.uid, "
		+ "roles.roleid,roles.rolename,rights.rightid,"
		+ " rights.rightname,rights.screenname from user_mst users,"
		+ " role_master roles , right_master rights, user_role_mapping "
		+ "rolemap, role_right_mapping rightmap where users.uid= rolemap.uid "
		+ "and rolemap.roleid=roles.roleid and "
		+ "roles.roleid = rightmap.roleid and "
		+ "rights.rightid= rightmap.rightid "
		+ " and users.userid=? and users.password=?";
}
