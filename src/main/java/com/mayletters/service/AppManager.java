package com.mayletters.service;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public final class AppManager implements Serializable {

	private static final long serialVersionUID = -7562300880164350422L;

	private static final ThreadLocal<EntityManager> threadLocalEntityManager = new ThreadLocal<EntityManager>();

	private static final ThreadLocal<EntityTransaction> threadLocalEntityTransaction = new ThreadLocal<EntityTransaction>();

	private static Log LOG = LogFactory.getLog(AppManager.class);

	private final String unit;

	private final EntityManagerFactory emf;

	public AppManager(String unit_name) {
		unit = unit_name;
		emf = Persistence.createEntityManagerFactory(unit_name);
		LOG.info("creata persistenza " + unit_name);
	}

	public void beginTransaction() {
		EntityTransaction et = getEntityTransaction();
		et.begin();
		LOG.debug("inizia transazione " + et);
	}

	public void commitTransaction() {
		EntityTransaction et = getEntityTransaction();
		et.commit();
		LOG.debug("commit transazione " + et);
		threadLocalEntityTransaction.set(null);
	}

	public void rollbackTransaction() {
		EntityTransaction et = getEntityTransaction();
		et.rollback();
		LOG.warn("ROLLBACK transazione " + et);
		threadLocalEntityTransaction.set(null);
	}

	public void closeAll() {
		emf.close();
		LOG.info("chiusa persistenza " + unit);
	}

	public void closeCommunication() {
		EntityManager em = getEntityManager();
		em.close();
		LOG.debug("chiuso EntityManager " + em);
		threadLocalEntityManager.set(null);
		threadLocalEntityTransaction.set(null);
	}

	public void clear() {
		getEntityManager().clear();
	}

	public boolean contains(Object arg0) {
		return getEntityManager().contains(arg0);
	}

	public Query createNamedQuery(String arg0) {
		return getEntityManager().createNamedQuery(arg0);
	}

	public Query createNativeQuery(String arg0, Class arg1) {
		return getEntityManager().createNativeQuery(arg0, arg1);
	}

	public Query createNativeQuery(String arg0, String arg1) {
		return getEntityManager().createNativeQuery(arg0, arg1);
	}

	public Query createNativeQuery(String arg0) {
		return getEntityManager().createNativeQuery(arg0);
	}

	public Query createQuery(String arg0) {
		return getEntityManager().createQuery(arg0);
	}

	public <T> T find(Class<T> arg0, Object arg1) {
		return getEntityManager().find(arg0, arg1);
	}

	public void flush() {
		getEntityManager().flush();
	}

	public Object getDelegate() {
		return getEntityManager().getDelegate();
	}

	public FlushModeType getFlushMode() {
		return getEntityManager().getFlushMode();
	}

	public <T> T getReference(Class<T> arg0, Object arg1) {
		return getEntityManager().getReference(arg0, arg1);
	}

	public EntityTransaction getTransaction() {
		return getEntityManager().getTransaction();
	}

	public boolean isOpen() {
		return getEntityManager().isOpen();
	}

	public void joinTransaction() {
		getEntityManager().joinTransaction();
	}

	public void lock(Object arg0, LockModeType arg1) {
		getEntityManager().lock(arg0, arg1);
	}

	public <T> T merge(T arg0) {
		return getEntityManager().merge(arg0);
	}

	public void persist(Object arg0) {
		getEntityManager().persist(arg0);
		LOG.debug("salvato " + arg0);
	}

	public void refresh(Object arg0) {
		getEntityManager().refresh(arg0);
	}

	public void remove(Object arg0) {
		getEntityManager().remove(arg0);
		LOG.debug("rimosso " + arg0);		
	}

	public void setFlushMode(FlushModeType arg0) {
		getEntityManager().setFlushMode(arg0);
	}

	public void initCommunication() {
		getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManager ret = threadLocalEntityManager.get();
		if (ret == null) {
			ret = emf.createEntityManager();
			LOG.debug("creato EntityManager " + ret);
			threadLocalEntityManager.set(ret);
		}
		return ret;
	}

	private EntityTransaction getEntityTransaction() {
		EntityTransaction et = threadLocalEntityTransaction.get();
		if (et == null) {
			et = getEntityManager().getTransaction();
			threadLocalEntityTransaction.set(et);
		}
		return et;
	}
}
