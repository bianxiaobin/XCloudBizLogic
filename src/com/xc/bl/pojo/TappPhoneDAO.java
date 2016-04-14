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
 * TappPhone entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.TappPhone
 * @author MyEclipse Persistence Tools
 */
public class TappPhoneDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TappPhoneDAO.class);
	// property constants
	public static final String TAPP_PHONE_VERCODE = "tappPhoneVercode";
	public static final String TAPP_PHONE_VER = "tappPhoneVer";
	public static final String TAPP_PHONE_FILENAME = "tappPhoneFilename";
	public static final String TAPP_PHONE_SIZE = "tappPhoneSize";
	public static final String TAPP_PHONE_CONTENT = "tappPhoneContent";
	public static final String TAPP_PHONE_ISFORCEDUPD = "tappPhoneIsforcedupd";
	public static final String DB_DELETE = "dbDelete";

	public void save(TappPhone transientInstance) {
		log.debug("saving TappPhone instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TappPhone persistentInstance) {
		log.debug("deleting TappPhone instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TappPhone findById(java.lang.Integer id) {
		log.debug("getting TappPhone instance with id: " + id);
		try {
			TappPhone instance = (TappPhone) getSession().get(
					"com.xc.bl.pojo.TappPhone", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TappPhone instance) {
		log.debug("finding TappPhone instance by example");
		try {
			List results = getSession()
					.createCriteria("com.xc.bl.pojo.TappPhone")
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
		log.debug("finding TappPhone instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TappPhone as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTappPhoneVercode(Object tappPhoneVercode) {
		return findByProperty(TAPP_PHONE_VERCODE, tappPhoneVercode);
	}

	public List findByTappPhoneVer(Object tappPhoneVer) {
		return findByProperty(TAPP_PHONE_VER, tappPhoneVer);
	}

	public List findByTappPhoneFilename(Object tappPhoneFilename) {
		return findByProperty(TAPP_PHONE_FILENAME, tappPhoneFilename);
	}

	public List findByTappPhoneSize(Object tappPhoneSize) {
		return findByProperty(TAPP_PHONE_SIZE, tappPhoneSize);
	}

	public List findByTappPhoneContent(Object tappPhoneContent) {
		return findByProperty(TAPP_PHONE_CONTENT, tappPhoneContent);
	}

	public List findByTappPhoneIsforcedupd(Object tappPhoneIsforcedupd) {
		return findByProperty(TAPP_PHONE_ISFORCEDUPD, tappPhoneIsforcedupd);
	}

	public List findByDbDelete(Object dbDelete) {
		return findByProperty(DB_DELETE, dbDelete);
	}

	public List findAll() {
		log.debug("finding all TappPhone instances");
		try {
			String queryString = "from TappPhone";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TappPhone merge(TappPhone detachedInstance) {
		log.debug("merging TappPhone instance");
		try {
			TappPhone result = (TappPhone) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TappPhone instance) {
		log.debug("attaching dirty TappPhone instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TappPhone instance) {
		log.debug("attaching clean TappPhone instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}