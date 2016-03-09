package com.xc.bl.pojo;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * CarFactory entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.CarFactory
 * @author MyEclipse Persistence Tools
 */
public class CarFactoryDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CarFactoryDAO.class);
	// property constants
	public static final String CAR_FACTORY_NAME = "carFactoryName";
	public static final String CAR_BRAND_ID = "carBrandId";

	public void save(CarFactory transientInstance) {
		log.debug("saving CarFactory instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CarFactory persistentInstance) {
		log.debug("deleting CarFactory instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CarFactory findById(java.lang.Integer id) {
		log.debug("getting CarFactory instance with id: " + id);
		try {
			CarFactory instance = (CarFactory) getSession().get(
					"com.xc.bl.pojo.CarFactory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CarFactory instance) {
		log.debug("finding CarFactory instance by example");
		try {
			List results = getSession()
					.createCriteria("com.xc.bl.pojo.CarFactory")
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
		log.debug("finding CarFactory instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CarFactory as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCarFactoryName(Object carFactoryName) {
		return findByProperty(CAR_FACTORY_NAME, carFactoryName);
	}

	public List findByCarBrandId(Object carBrandId) {
		return findByProperty(CAR_BRAND_ID, carBrandId);
	}

	public List findAll() {
		log.debug("finding all CarFactory instances");
		try {
			String queryString = "from CarFactory";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CarFactory merge(CarFactory detachedInstance) {
		log.debug("merging CarFactory instance");
		try {
			CarFactory result = (CarFactory) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CarFactory instance) {
		log.debug("attaching dirty CarFactory instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CarFactory instance) {
		log.debug("attaching clean CarFactory instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}