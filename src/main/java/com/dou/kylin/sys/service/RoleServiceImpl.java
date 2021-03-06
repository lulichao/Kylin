package com.dou.kylin.sys.service;

import com.dou.kylin.common.page.Pagination;
import com.dou.kylin.sys.dao.RoleDao;
import com.dou.kylin.sys.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 
 * @author <Auto generate>
 * @version  2015-05-21 23:16:42
 * @see com.yang.spinach.service.impl.Role
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
    private RoleDao roleDao;
   
    @Override
	public Integer  saveRole(Role entity ) throws Exception{
	       return roleDao.saveRole(entity);
	}

	
	@Override
    public Integer updateRoleById(Role entity ) throws Exception{
	return roleDao.updateRoleById(entity);
    }
    @Override
	public Role selectRoleById(Object id) throws Exception{
	 return roleDao.selectRoleById(id);
	}


	@Override
	public List<Role> listPage(Role role, Pagination pagination) {
		return roleDao.listPage(role, pagination);
	}


	@Override
	public Integer delPermBYId(Long id) {
		return roleDao.delPermBYId(id);
	}


	@Override
	public Integer bathSavePerm(Long[] rid, Long id) {
		return roleDao.bathSavePerm(rid, id);
	}


	@Override
	public List<Role> findByAccountId(Long id) {
		return roleDao.findByAccountId(id);
	}


	@Override
	public Integer delRoleBYId(Long id) {
		return roleDao.delRoleBYId(id);
	}


	@Override
	public Integer bathSaveRole(Long[] rid, Long id) {
		return roleDao.bathSaveRole(rid,id);
	}
	


}
