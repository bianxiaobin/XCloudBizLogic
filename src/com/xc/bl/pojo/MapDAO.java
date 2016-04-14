package com.xc.bl.pojo;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Map
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.xc.bl.pojo.Map
 * @author MyEclipse Persistence Tools
 */
public class MapDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(MapDAO.class);
	// property constants
	public static final String MAP_NAME = "mapName";
	public static final String MAP_CITY = "mapCity";
	public static final String PROVINCE_ID = "provinceId";
	public static final String MAP_COMPANY = "mapCompany";
	public static final String MAP_INTRODUCE = "mapIntroduce";
	public static final String DB_DELETE = "dbDelete";

	public void save(Map transientInstance) {
		log.debug("saving Map instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Map persistentInstance) {
		log.debug("deleting Map instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Map findById(java.lang.Integer id) {
		log.debug("getting Map instance with id: " + id);
		try {
			Map instance = (Map) getSession().get("com.xc.bl.pojo.Map", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Map instance) {
		log.debug("finding Map instance by example");
		try {
			List results = getSession().createCriteria("com.xc.bl.pojo.Map")
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
		log.debug("finding Map instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Map as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMapName(Object mapName) {
		return findByProperty(MAP_NAME, mapName);
	}

	public List findByMapCity(Object mapCity) {
		return findByProperty(MAP_CITY, mapCity);
	}

	public List findByProvinceId(Object provinceId) {
		return findByProperty(PROVINCE_ID, provinceId);
	}

	public List findByMapCompany(Object mapCompany) {
		return findByProperty(MAP_COMPANY, mapCompany);
	}

	public List findByMapIntroduce(Object mapIntroduce) {
		return findByProperty(MAP_INTRODUCE, mapIntroduce);
	}

	public List findByDbDelete(Object dbDelete) {
		return findByProperty(DB_DELETE, dbDelete);
	}

	public List findAll() {
		log.debug("finding all Map instances");
		try {
			String queryString = "from Map";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Map merge(Map detachedInstance) {
		log.debug("merging Map instance");
		try {
			Map result = (Map) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Map instance) {
		log.debug("attaching dirty Map instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Map instance) {
		log.debug("attaching clean Map instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}