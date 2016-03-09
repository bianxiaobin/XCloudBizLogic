package com.xc.bl.pojo;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Car
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.xc.bl.pojo.Car
 * @author MyEclipse Persistence Tools
 */
public class CarDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(CarDAO.class);
	// property constants
	public static final String CAR_GRADE_ID = "carGradeId";
	public static final String CAR_AP_NAME = "carApName";
	public static final String CAR_AP_PWD = "carApPwd";
	public static final String CAR_UUID = "carUuid";
	public static final String CAR_BIND_STATE = "carBindState";

	public void save(Car transientInstance) {
		log.debug("saving Car instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Car persistentInstance) {
		log.debug("deleting Car instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Car findById(java.lang.Long id) {
		log.debug("getting Car instance with id: " + id);
		try {
			Car instance = (Car) getSession().get("com.xc.bl.pojo.Car", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Car instance) {
		log.debug("finding Car instance by example");
		try {
			List results = getSession().createCriteria("com.xc.bl.pojo.Car")
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
		log.debug("finding Car instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Car as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCarGradeId(Object carGradeId) {
		return findByProperty(CAR_GRADE_ID, carGradeId);
	}

	public List findByCarApName(Object carApName) {
		return findByProperty(CAR_AP_NAME, carApName);
	}

	public List findByCarApPwd(Object carApPwd) {
		return findByProperty(CAR_AP_PWD, carApPwd);
	}

	public List findByCarUuid(Object carUuid) {
		return findByProperty(CAR_UUID, carUuid);
	}

	public List findByCarBindState(Object carBindState) {
		return findByProperty(CAR_BIND_STATE, carBindState);
	}

	public List findAll() {
		log.debug("finding all Car instances");
		try {
			String queryString = "from Car";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Car merge(Car detachedInstance) {
		log.debug("merging Car instance");
		try {
			Car result = (Car) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Car instance) {
		log.debug("attaching dirty Car instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Car instance) {
		log.debug("attaching clean Car instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}