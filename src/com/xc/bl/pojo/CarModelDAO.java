package com.xc.bl.pojo;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * CarModel entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.CarModel
 * @author MyEclipse Persistence Tools
 */
public class CarModelDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CarModelDAO.class);
	// property constants
	public static final String CAR_MODEL_NAME = "carModelName";
	public static final String CAR_FACTORY_ID = "carFactoryId";
	public static final String CAR_MODEL_SI = "carModelSi";

	public void save(CarModel transientInstance) {
		log.debug("saving CarModel instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CarModel persistentInstance) {
		log.debug("deleting CarModel instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CarModel findById(java.lang.Integer id) {
		log.debug("getting CarModel instance with id: " + id);
		try {
			CarModel instance = (CarModel) getSession().get(
					"com.xc.bl.pojo.CarModel", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CarModel instance) {
		log.debug("finding CarModel instance by example");
		try {
			List results = getSession()
					.createCriteria("com.xc.bl.pojo.CarModel")
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
		log.debug("finding CarModel instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CarModel as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCarModelName(Object carModelName) {
		return findByProperty(CAR_MODEL_NAME, carModelName);
	}

	public List findByCarFactoryId(Object carFactoryId) {
		return findByProperty(CAR_FACTORY_ID, carFactoryId);
	}

	public List findByCarModelSi(Object carModelSi) {
		return findByProperty(CAR_MODEL_SI, carModelSi);
	}

	public List findAll() {
		log.debug("finding all CarModel instances");
		try {
			String queryString = "from CarModel";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CarModel merge(CarModel detachedInstance) {
		log.debug("merging CarModel instance");
		try {
			CarModel result = (CarModel) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CarModel instance) {
		log.debug("attaching dirty CarModel instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CarModel instance) {
		log.debug("attaching clean CarModel instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}