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
 * AppUpd entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.AppUpd
 * @author MyEclipse Persistence Tools
 */
public class AppUpdDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(AppUpdDAO.class);
	// property constants
	public static final String APP_ID = "appId";
	public static final String APP_UPD_README = "appUpdReadme";
	public static final String APP_UPD_VERCODE = "appUpdVercode";
	public static final String APP_UPD_VERSION = "appUpdVersion";
	public static final String APP_UPD_SIZE = "appUpdSize";
	public static final String APP_UPD_PACKAGE_NAME = "appUpdPackageName";
	public static final String APP_UPD_PKG_SPACE = "appUpdPkgSpace";
	public static final String DB_DELETE = "dbDelete";

	public void save(AppUpd transientInstance) {
		log.debug("saving AppUpd instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AppUpd persistentInstance) {
		log.debug("deleting AppUpd instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AppUpd findById(java.lang.Long id) {
		log.debug("getting AppUpd instance with id: " + id);
		try {
			AppUpd instance = (AppUpd) getSession().get(
					"com.xc.bl.pojo.AppUpd", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AppUpd instance) {
		log.debug("finding AppUpd instance by example");
		try {
			List results = getSession().createCriteria("com.xc.bl.pojo.AppUpd")
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
		log.debug("finding AppUpd instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AppUpd as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAppId(Object appId) {
		return findByProperty(APP_ID, appId);
	}

	public List findByAppUpdReadme(Object appUpdReadme) {
		return findByProperty(APP_UPD_README, appUpdReadme);
	}

	public List findByAppUpdVercode(Object appUpdVercode) {
		return findByProperty(APP_UPD_VERCODE, appUpdVercode);
	}

	public List findByAppUpdVersion(Object appUpdVersion) {
		return findByProperty(APP_UPD_VERSION, appUpdVersion);
	}

	public List findByAppUpdSize(Object appUpdSize) {
		return findByProperty(APP_UPD_SIZE, appUpdSize);
	}

	public List findByAppUpdPackageName(Object appUpdPackageName) {
		return findByProperty(APP_UPD_PACKAGE_NAME, appUpdPackageName);
	}

	public List findByAppUpdPkgSpace(Object appUpdPkgSpace) {
		return findByProperty(APP_UPD_PKG_SPACE, appUpdPkgSpace);
	}

	public List findByDbDelete(Object dbDelete) {
		return findByProperty(DB_DELETE, dbDelete);
	}

	public List findAll() {
		log.debug("finding all AppUpd instances");
		try {
			String queryString = "from AppUpd";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AppUpd merge(AppUpd detachedInstance) {
		log.debug("merging AppUpd instance");
		try {
			AppUpd result = (AppUpd) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AppUpd instance) {
		log.debug("attaching dirty AppUpd instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AppUpd instance) {
		log.debug("attaching clean AppUpd instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}