package com.xc.bl.pojo;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * CarGrade entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.CarGrade
 * @author MyEclipse Persistence Tools
 */
public class CarGradeDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CarGradeDAO.class);
	// property constants
	public static final String CAR_GRADE_NAME = "carGradeName";
	public static final String CAR_GRADE_YEAR = "carGradeYear";
	public static final String CAR_GRADE_EMISSIONS = "carGradeEmissions";
	public static final String CAR_MODEL_ID = "carModelId";
	public static final String CAR_GRADE_SI = "carGradeSi";

	public void save(CarGrade transientInstance) {
		log.debug("saving CarGrade instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CarGrade persistentInstance) {
		log.debug("deleting CarGrade instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CarGrade findById(java.lang.Integer id) {
		log.debug("getting CarGrade instance with id: " + id);
		try {
			CarGrade instance = (CarGrade) getSession().get(
					"com.xc.bl.pojo.CarGrade", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CarGrade instance) {
		log.debug("finding CarGrade instance by example");
		try {
			List results = getSession()
					.createCriteria("com.xc.bl.pojo.CarGrade")
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
		log.debug("finding CarGrade instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CarGrade as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCarGradeName(Object carGradeName) {
		return findByProperty(CAR_GRADE_NAME, carGradeName);
	}

	public List findByCarGradeYear(Object carGradeYear) {
		return findByProperty(CAR_GRADE_YEAR, carGradeYear);
	}

	public List findByCarGradeEmissions(Object carGradeEmissions) {
		return findByProperty(CAR_GRADE_EMISSIONS, carGradeEmissions);
	}

	public List findByCarModelId(Object carModelId) {
		return findByProperty(CAR_MODEL_ID, carModelId);
	}

	public List findByCarGradeSi(Object carGradeSi) {
		return findByProperty(CAR_GRADE_SI, carGradeSi);
	}

	public List findAll() {
		log.debug("finding all CarGrade instances");
		try {
			String queryString = "from CarGrade";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CarGrade merge(CarGrade detachedInstance) {
		log.debug("merging CarGrade instance");
		try {
			CarGrade result = (CarGrade) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CarGrade instance) {
		log.debug("attaching dirty CarGrade instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CarGrade instance) {
		log.debug("attaching clean CarGrade instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}