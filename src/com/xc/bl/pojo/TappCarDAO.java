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
 * TappCar entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.TappCar
 * @author MyEclipse Persistence Tools
 */
public class TappCarDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TappCarDAO.class);
	// property constants
	public static final String TAPP_CAR_VERCODE = "tappCarVercode";
	public static final String TAPP_CAR_VER = "tappCarVer";
	public static final String TAPP_CAR_FILENAME = "tappCarFilename";
	public static final String TAPP_CAR_SIZE = "tappCarSize";
	public static final String TAPP_CAR_CONTENT = "tappCarContent";
	public static final String TAPP_CAR_ISFORCEDUPD = "tappCarIsforcedupd";
	public static final String DB_DELETE = "dbDelete";

	public void save(TappCar transientInstance) {
		log.debug("saving TappCar instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TappCar persistentInstance) {
		log.debug("deleting TappCar instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TappCar findById(java.lang.Integer id) {
		log.debug("getting TappCar instance with id: " + id);
		try {
			TappCar instance = (TappCar) getSession().get(
					"com.xc.bl.pojo.TappCar", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TappCar instance) {
		log.debug("finding TappCar instance by example");
		try {
			List results = getSession()
					.createCriteria("com.xc.bl.pojo.TappCar")
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
		log.debug("finding TappCar instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TappCar as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTappCarVercode(Object tappCarVercode) {
		return findByProperty(TAPP_CAR_VERCODE, tappCarVercode);
	}

	public List findByTappCarVer(Object tappCarVer) {
		return findByProperty(TAPP_CAR_VER, tappCarVer);
	}

	public List findByTappCarFilename(Object tappCarFilename) {
		return findByProperty(TAPP_CAR_FILENAME, tappCarFilename);
	}

	public List findByTappCarSize(Object tappCarSize) {
		return findByProperty(TAPP_CAR_SIZE, tappCarSize);
	}

	public List findByTappCarContent(Object tappCarContent) {
		return findByProperty(TAPP_CAR_CONTENT, tappCarContent);
	}

	public List findByTappCarIsforcedupd(Object tappCarIsforcedupd) {
		return findByProperty(TAPP_CAR_ISFORCEDUPD, tappCarIsforcedupd);
	}

	public List findByDbDelete(Object dbDelete) {
		return findByProperty(DB_DELETE, dbDelete);
	}

	public List findAll() {
		log.debug("finding all TappCar instances");
		try {
			String queryString = "from TappCar";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TappCar merge(TappCar detachedInstance) {
		log.debug("merging TappCar instance");
		try {
			TappCar result = (TappCar) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TappCar instance) {
		log.debug("attaching dirty TappCar instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TappCar instance) {
		log.debug("attaching clean TappCar instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}