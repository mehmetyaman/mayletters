package com.mayletters.service.dao;

import com.mayletters.domain.AbsId;
import com.mayletters.service.AppManager;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class BaseDAO implements Serializable {

	private static final long serialVersionUID = 2746316045807237905L;

	protected static final Log LOG = LogFactory.getLog(BaseDAO.class);

	protected Class targetEntity;

	protected AppManager appManager;

	public abstract Class<?> getTargetEntityClass();

	public void setAppManager(AppManager appManager) {
		this.appManager = appManager;
	}

	public Object findById(long id) {
		Object ret = null;
		try {
			ret = appManager.find(getTargetEntityClass(), id);
			LOG.debug("trovato " + ret);

		} catch (Exception e) {
			LOG.warn("ATTENZIONE: " + e.getLocalizedMessage());
		}
		return ret;
	}

	public List<?> listAll() {
  
		return appManager.createQuery("SELECT a from " + getTargetEntityClass().getSimpleName() + " a")
				.getResultList();
	}

	public Long getCount() {
		return (Long) appManager.createQuery(
				"SELECT COUNT(o) FROM " + getTargetEntityClass().getSimpleName() + " o").getSingleResult();
	}

	public void persist(AbsId obj) {
		appManager.beginTransaction();
		if (obj.getId() == null) {
			appManager.persist(obj);
		} else {
			appManager.merge(obj);
		}
		appManager.commitTransaction();
	}

	public void delete(Long id) {
		appManager.beginTransaction();
		Object obj = appManager.find(getTargetEntityClass(), id);
		appManager.remove(obj);
		appManager.commitTransaction();

	}
}
