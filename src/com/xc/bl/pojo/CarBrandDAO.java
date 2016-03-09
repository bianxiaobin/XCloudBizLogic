package com.xc.bl.pojo;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * CarBrand entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.CarBrand
 * @author MyEclipse Persistence Tools
 */
public class CarBrandDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CarBrandDAO.class);
	// property constants
	public static final String CAR_BRAND_NAME = "carBrandName";
	public static final String CAR_BRAND_ISHOT = "carBrandIshot";
	public static final String CAR_BRAND_NAME_LETTER = "carBrandNameLetter";
	public static final String CAR_BRAND_LOGO = "carBrandLogo";

	public void save(CarBrand transientInstance) {
		log.debug("saving CarBrand instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CarBrand persistentInstance) {
		log.debug("deleting CarBrand instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CarBrand findById(java.lang.Integer id) {
		log.debug("getting CarBrand instance with id: " + id);
		try {
			CarBrand instance = (CarBrand) getSession().get(
					"com.xc.bl.pojo.CarBrand", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CarBrand instance) {
		log.debug("finding CarBrand instance by example");
		try {
			List results = getSession()
					.createCriteria("com.xc.bl.pojo.CarBrand")
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
		log.debug("finding CarBrand instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CarBrand as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCarBrandName(Object carBrandName) {
		return findByProperty(CAR_BRAND_NAME, carBrandName);
	}

	public List findByCarBrandIshot(Object carBrandIshot) {
		return findByProperty(CAR_BRAND_ISHOT, carBrandIshot);
	}

	public List findByCarBrandNameLetter(Object carBrandNameLetter) {
		return findByProperty(CAR_BRAND_NAME_LETTER, carBrandNameLetter);
	}

	public List findByCarBrandLogo(Object carBrandLogo) {
		return findByProperty(CAR_BRAND_LOGO, carBrandLogo);
	}

	public List findAll() {
		log.debug("finding all CarBrand instances");
		try {
			String queryString = "from CarBrand";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CarBrand merge(CarBrand detachedInstance) {
		log.debug("merging CarBrand instance");
		try {
			CarBrand result = (CarBrand) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CarBrand instance) {
		log.debug("attaching dirty CarBrand instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CarBrand instance) {
		log.debug("attaching clean CarBrand instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}