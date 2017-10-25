package com.wicresoft.erp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wicresoft.erp.dao.TPermissionMapper;
import com.wicresoft.erp.dao.TRoleMapper;
import com.wicresoft.erp.dao.TUserMapper;
import com.wicresoft.erp.entity.TPermission;
import com.wicresoft.erp.entity.TRole;
import com.wicresoft.erp.entity.TUser;
import com.wicresoft.erp.service.IUserService;

@Service("iUserServiceImpl")
public class IUserServiceImpl implements IUserService {

	@Resource
	private TUserMapper tUserMapper;
	@Resource
	private TRoleMapper tRoleMapper;
	@Resource
	private TPermissionMapper tPermissionMapper;

	@Override
	public TUser findUserByUserName(String userName) {
		return tUserMapper.finByUserName(userName);
	}

	@Override
	public List<TRole> findUserRoles(String userName) {
		return tRoleMapper.findUserRoles(userName);
	}

	@Override
	public List<TPermission> findUserPermissions(String userName) {
		return tPermissionMapper.findUserPermissions(userName);
	}

	public TUserMapper gettUserMapper() {
		return tUserMapper;
	}

	public void settUserMapper(TUserMapper tUserMapper) {
		this.tUserMapper = tUserMapper;
	}

}