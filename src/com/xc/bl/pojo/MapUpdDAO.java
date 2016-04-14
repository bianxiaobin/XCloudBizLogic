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
 * MapUpd entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.MapUpd
 * @author MyEclipse Persistence Tools
 */
public class MapUpdDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(MapUpdDAO.class);
	// property constants
	public static final String MAP_ID = "mapId";
	public static final String MAP_UPD_README = "mapUpdReadme";
	public static final String MAP_UPD_VERCODE = "mapUpdVercode";
	public static final String MAP_UPD_VERSION = "mapUpdVersion";
	public static final String MAP_UPD_SIZE = "mapUpdSize";
	public static final String MAP_UPD_PACKAGE_NAME = "mapUpdPackageName";
	public static final String MAP_UPD_ORIGINAL_URL = "mapUpdOriginalUrl";
	public static final String DB_DELETE = "dbDelete";

	public void save(MapUpd transientInstance) {
		log.debug("saving MapUpd instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MapUpd persistentInstance) {
		log.debug("deleting MapUpd instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MapUpd findById(java.lang.Long id) {
		log.debug("getting MapUpd instance with id: " + id);
		try {
			MapUpd instance = (MapUpd) getSession().get(
					"com.xc.bl.pojo.MapUpd", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MapUpd instance) {
		log.debug("finding MapUpd instance by example");
		try {
			List results = getSession().createCriteria("com.xc.bl.pojo.MapUpd")
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
		log.debug("finding MapUpd instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MapUpd as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMapId(Object mapId) {
		return findByProperty(MAP_ID, mapId);
	}

	public List findByMapUpdReadme(Object mapUpdReadme) {
		return findByProperty(MAP_UPD_README, mapUpdReadme);
	}

	public List findByMapUpdVercode(Object mapUpdVercode) {
		return findByProperty(MAP_UPD_VERCODE, mapUpdVercode);
	}

	public List findByMapUpdVersion(Object mapUpdVersion) {
		return findByProperty(MAP_UPD_VERSION, mapUpdVersion);
	}

	public List findByMapUpdSize(Object mapUpdSize) {
		return findByProperty(MAP_UPD_SIZE, mapUpdSize);
	}

	public List findByMapUpdPackageName(Object mapUpdPackageName) {
		return findByProperty(MAP_UPD_PACKAGE_NAME, mapUpdPackageName);
	}

	public List findByMapUpdOriginalUrl(Object mapUpdOriginalUrl) {
		return findByProperty(MAP_UPD_ORIGINAL_URL, mapUpdOriginalUrl);
	}

	public List findByDbDelete(Object dbDelete) {
		return findByProperty(DB_DELETE, dbDelete);
	}

	public List findAll() {
		log.debug("finding all MapUpd instances");
		try {
			String queryString = "from MapUpd";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MapUpd merge(MapUpd detachedInstance) {
		log.debug("merging MapUpd instance");
		try {
			MapUpd result = (MapUpd) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MapUpd instance) {
		log.debug("attaching dirty MapUpd instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MapUpd instance) {
		log.debug("attaching clean MapUpd instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}