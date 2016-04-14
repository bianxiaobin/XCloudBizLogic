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
 * Singer entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.Singer
 * @author MyEclipse Persistence Tools
 */
public class SingerDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(SingerDAO.class);
	// property constants
	public static final String SINGER_NAME = "singerName";
	public static final String SINGER_FILESIZE = "singerFilesize";
	public static final String DB_DELETE = "dbDelete";

	public void save(Singer transientInstance) {
		log.debug("saving Singer instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Singer persistentInstance) {
		log.debug("deleting Singer instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Singer findById(java.lang.Integer id) {
		log.debug("getting Singer instance with id: " + id);
		try {
			Singer instance = (Singer) getSession().get(
					"com.xc.bl.pojo.Singer", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Singer instance) {
		log.debug("finding Singer instance by example");
		try {
			List results = getSession().createCriteria("com.xc.bl.pojo.Singer")
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
		log.debug("finding Singer instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Singer as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySingerName(Object singerName) {
		return findByProperty(SINGER_NAME, singerName);
	}

	public List findBySingerFilesize(Object singerFilesize) {
		return findByProperty(SINGER_FILESIZE, singerFilesize);
	}

	public List findByDbDelete(Object dbDelete) {
		return findByProperty(DB_DELETE, dbDelete);
	}

	public List findAll() {
		log.debug("finding all Singer instances");
		try {
			String queryString = "from Singer";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Singer merge(Singer detachedInstance) {
		log.debug("merging Singer instance");
		try {
			Singer result = (Singer) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Singer instance) {
		log.debug("attaching dirty Singer instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Singer instance) {
		log.debug("attaching clean Singer instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}