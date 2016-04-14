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
 * AppLog entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.AppLog
 * @author MyEclipse Persistence Tools
 */
public class AppLogDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(AppLogDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String APP_UPD_ID = "appUpdId";
	public static final String APP_LOG_OPT = "appLogOpt";
	public static final String DB_DELETE = "dbDelete";

	public void save(AppLog transientInstance) {
		log.debug("saving AppLog instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AppLog persistentInstance) {
		log.debug("deleting AppLog instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AppLog findById(java.lang.Long id) {
		log.debug("getting AppLog instance with id: " + id);
		try {
			AppLog instance = (AppLog) getSession().get(
					"com.xc.bl.pojo.AppLog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AppLog instance) {
		log.debug("finding AppLog instance by example");
		try {
			List results = getSession().createCriteria("com.xc.bl.pojo.AppLog")
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
		log.debug("finding AppLog instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AppLog as model where model."
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

	public List findByAppUpdId(Object appUpdId) {
		return findByProperty(APP_UPD_ID, appUpdId);
	}

	public List findByAppLogOpt(Object appLogOpt) {
		return findByProperty(APP_LOG_OPT, appLogOpt);
	}

	public List findByDbDelete(Object dbDelete) {
		return findByProperty(DB_DELETE, dbDelete);
	}

	public List findAll() {
		log.debug("finding all AppLog instances");
		try {
			String queryString = "from AppLog";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AppLog merge(AppLog detachedInstance) {
		log.debug("merging AppLog instance");
		try {
			AppLog result = (AppLog) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AppLog instance) {
		log.debug("attaching dirty AppLog instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AppLog instance) {
		log.debug("attaching clean AppLog instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}