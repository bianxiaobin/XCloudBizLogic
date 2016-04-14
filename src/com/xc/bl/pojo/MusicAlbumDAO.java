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
 * MusicAlbum entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.xc.bl.pojo.MusicAlbum
 * @author MyEclipse Persistence Tools
 */
public class MusicAlbumDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(MusicAlbumDAO.class);
	// property constants
	public static final String MUSIC_ALBUM_NAME = "musicAlbumName";
	public static final String MUSIC_ALBUM_LABLE = "musicAlbumLable";
	public static final String MUSIC_ALBUM_DESC = "musicAlbumDesc";
	public static final String DB_DELETE = "dbDelete";

	public void save(MusicAlbum transientInstance) {
		log.debug("saving MusicAlbum instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MusicAlbum persistentInstance) {
		log.debug("deleting MusicAlbum instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MusicAlbum findById(java.lang.Integer id) {
		log.debug("getting MusicAlbum instance with id: " + id);
		try {
			MusicAlbum instance = (MusicAlbum) getSession().get(
					"com.xc.bl.pojo.MusicAlbum", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MusicAlbum instance) {
		log.debug("finding MusicAlbum instance by example");
		try {
			List results = getSession()
					.createCriteria("com.xc.bl.pojo.MusicAlbum")
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
		log.debug("finding MusicAlbum instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MusicAlbum as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMusicAlbumName(Object musicAlbumName) {
		return findByProperty(MUSIC_ALBUM_NAME, musicAlbumName);
	}

	public List findByMusicAlbumLable(Object musicAlbumLable) {
		return findByProperty(MUSIC_ALBUM_LABLE, musicAlbumLable);
	}

	public List findByMusicAlbumDesc(Object musicAlbumDesc) {
		return findByProperty(MUSIC_ALBUM_DESC, musicAlbumDesc);
	}

	public List findByDbDelete(Object dbDelete) {
		return findByProperty(DB_DELETE, dbDelete);
	}

	public List findAll() {
		log.debug("finding all MusicAlbum instances");
		try {
			String queryString = "from MusicAlbum";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MusicAlbum merge(MusicAlbum detachedInstance) {
		log.debug("merging MusicAlbum instance");
		try {
			MusicAlbum result = (MusicAlbum) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MusicAlbum instance) {
		log.debug("attaching dirty MusicAlbum instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MusicAlbum instance) {
		log.debug("attaching clean MusicAlbum instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}