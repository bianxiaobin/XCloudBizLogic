package com.xc.bl.pojo;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * UserCarBind entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.UserCarBind
 * @author MyEclipse Persistence Tools
 */
public class UserCarBindDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(UserCarBindDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String CAR_ID = "carId";

	public void save(UserCarBind transientInstance) {
		log.debug("saving UserCarBind instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UserCarBind persistentInstance) {
		log.debug("deleting UserCarBind instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UserCarBind findById(java.lang.Long id) {
		log.debug("getting UserCarBind instance with id: " + id);
		try {
			UserCarBind instance = (UserCarBind) getSession().get(
					"com.xc.bl.pojo.UserCarBind", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UserCarBind instance) {
		log.debug("finding UserCarBind instance by example");
		try {
			List results = getSession()
					.createCriteria("com.xc.bl.pojo.UserCarBind")
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
		log.debug("finding UserCarBind instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UserCarBind as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List findByCarId(Object carId) {
		return findByProperty(CAR_ID, carId);
	}

	public List findAll() {
		log.debug("finding all UserCarBind instances");
		try {
			String queryString = "from UserCarBind";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UserCarBind merge(UserCarBind detachedInstance) {
		log.debug("merging UserCarBind instance");
		try {
			UserCarBind result = (UserCarBind) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UserCarBind instance) {
		log.debug("attaching dirty UserCarBind instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UserCarBind instance) {
		log.debug("attaching clean UserCarBind instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}