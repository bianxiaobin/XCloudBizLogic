package com.xc.bl.pojo;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * TappVerSupport entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.TappVerSupport
 * @author MyEclipse Persistence Tools
 */
public class TappVerSupportDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TappVerSupportDAO.class);
	// property constants
	public static final String TAPP_PHONE_ID = "tappPhoneId";
	public static final String TAPP_CAR_ID = "tappCarId";
	public static final String DB_DELETE = "dbDelete";

	public void save(TappVerSupport transientInstance) {
		log.debug("saving TappVerSupport instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TappVerSupport persistentInstance) {
		log.debug("deleting TappVerSupport instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TappVerSupport findById(java.lang.Integer id) {
		log.debug("getting TappVerSupport instance with id: " + id);
		try {
			TappVerSupport instance = (TappVerSupport) getSession().get(
					"com.xc.bl.pojo.TappVerSupport", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TappVerSupport instance) {
		log.debug("finding TappVerSupport instance by example");
		try {
			List results = getSession()
					.createCriteria("com.xc.bl.pojo.TappVerSupport")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TappVerSupport instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TappVerSupport as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTappPhoneId(Object tappPhoneId) {
		return findByProperty(TAPP_PHONE_ID, tappPhoneId);
	}

	public List findByTappCarId(Object tappCarId) {
		return findByProperty(TAPP_CAR_ID, tappCarId);
	}

	public List findByDbDelete(Object dbDelete) {
		return findByProperty(DB_DELETE, dbDelete);
	}

	public List findAll() {
		log.debug("finding all TappVerSupport instances");
		try {
			String queryString = "from TappVerSupport";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TappVerSupport merge(TappVerSupport detachedInstance) {
		log.debug("merging TappVerSupport instance");
		try {
			TappVerSupport result = (TappVerSupport) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TappVerSupport instance) {
		log.debug("attaching dirty TappVerSupport instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TappVerSupport instance) {
		log.debug("attaching clean TappVerSupport instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}