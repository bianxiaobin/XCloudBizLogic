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
 * StoreFocusShow entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.StoreFocusShow
 * @author MyEclipse Persistence Tools
 */
public class StoreFocusShowDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(StoreFocusShowDAO.class);
	// property constants
	public static final String STORE_FS_IMG = "storeFsImg";
	public static final String STORE_FS_TYPE = "storeFsType";
	public static final String STORE_FS_DATA = "storeFsData";
	public static final String STORE_FS_POS = "storeFsPos";
	public static final String DB_DELETE = "dbDelete";

	public void save(StoreFocusShow transientInstance) {
		log.debug("saving StoreFocusShow instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(StoreFocusShow persistentInstance) {
		log.debug("deleting StoreFocusShow instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public StoreFocusShow findById(java.lang.Integer id) {
		log.debug("getting StoreFocusShow instance with id: " + id);
		try {
			StoreFocusShow instance = (StoreFocusShow) getSession().get(
					"com.xc.bl.pojo.StoreFocusShow", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(StoreFocusShow instance) {
		log.debug("finding StoreFocusShow instance by example");
		try {
			List results = getSession()
					.createCriteria("com.xc.bl.pojo.StoreFocusShow")
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
		log.debug("finding StoreFocusShow instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from StoreFocusShow as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByStoreFsImg(Object storeFsImg) {
		return findByProperty(STORE_FS_IMG, storeFsImg);
	}

	public List findByStoreFsType(Object storeFsType) {
		return findByProperty(STORE_FS_TYPE, storeFsType);
	}

	public List findByStoreFsData(Object storeFsData) {
		return findByProperty(STORE_FS_DATA, storeFsData);
	}

	public List findByStoreFsPos(Object storeFsPos) {
		return findByProperty(STORE_FS_POS, storeFsPos);
	}

	public List findByDbDelete(Object dbDelete) {
		return findByProperty(DB_DELETE, dbDelete);
	}

	public List findAll() {
		log.debug("finding all StoreFocusShow instances");
		try {
			String queryString = "from StoreFocusShow";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public StoreFocusShow merge(StoreFocusShow detachedInstance) {
		log.debug("merging StoreFocusShow instance");
		try {
			StoreFocusShow result = (StoreFocusShow) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(StoreFocusShow instance) {
		log.debug("attaching dirty StoreFocusShow instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(StoreFocusShow instance) {
		log.debug("attaching clean StoreFocusShow instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}