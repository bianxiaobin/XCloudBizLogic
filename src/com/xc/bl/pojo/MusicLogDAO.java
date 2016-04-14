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
 * MusicLog entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.MusicLog
 * @author MyEclipse Persistence Tools
 */
public class MusicLogDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(MusicLogDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String MUSIC_ID = "musicId";
	public static final String MUSIC_LOG_OPT = "musicLogOpt";
	public static final String DB_DELETE = "dbDelete";

	public void save(MusicLog transientInstance) {
		log.debug("saving MusicLog instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MusicLog persistentInstance) {
		log.debug("deleting MusicLog instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MusicLog findById(java.lang.Long id) {
		log.debug("getting MusicLog instance with id: " + id);
		try {
			MusicLog instance = (MusicLog) getSession().get(
					"com.xc.bl.pojo.MusicLog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MusicLog instance) {
		log.debug("finding MusicLog instance by example");
		try {
			List results = getSession()
					.createCriteria("com.xc.bl.pojo.MusicLog")
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
		log.debug("finding MusicLog instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MusicLog as model where model."
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

	public List findByMusicId(Object musicId) {
		return findByProperty(MUSIC_ID, musicId);
	}

	public List findByMusicLogOpt(Object musicLogOpt) {
		return findByProperty(MUSIC_LOG_OPT, musicLogOpt);
	}

	public List findByDbDelete(Object dbDelete) {
		return findByProperty(DB_DELETE, dbDelete);
	}

	public List findAll() {
		log.debug("finding all MusicLog instances");
		try {
			String queryString = "from MusicLog";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MusicLog merge(MusicLog detachedInstance) {
		log.debug("merging MusicLog instance");
		try {
			MusicLog result = (MusicLog) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MusicLog instance) {
		log.debug("attaching dirty MusicLog instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MusicLog instance) {
		log.debug("attaching clean MusicLog instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}