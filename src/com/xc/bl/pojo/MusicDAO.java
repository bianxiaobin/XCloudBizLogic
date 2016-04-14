package com.xc.bl.pojo;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Music
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.xc.bl.pojo.Music
 * @author MyEclipse Persistence Tools
 */
public class MusicDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(MusicDAO.class);
	// property constants
	public static final String MUSIC_NAME = "musicName";
	public static final String SINGER_ID = "singerId";
	public static final String MUSIC_SIZE = "musicSize";
	public static final String MUSIC_TIME = "musicTime";
	public static final String MUSIC_ALBUM_ID = "musicAlbumId";
	public static final String MUSIC_PATH = "musicPath";
	public static final String DB_DELETE = "dbDelete";

	public void save(Music transientInstance) {
		log.debug("saving Music instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Music persistentInstance) {
		log.debug("deleting Music instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Music findById(java.lang.Long id) {
		log.debug("getting Music instance with id: " + id);
		try {
			Music instance = (Music) getSession().get("com.xc.bl.pojo.Music",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Music instance) {
		log.debug("finding Music instance by example");
		try {
			List results = getSession().createCriteria("com.xc.bl.pojo.Music")
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
		log.debug("finding Music instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Music as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMusicName(Object musicName) {
		return findByProperty(MUSIC_NAME, musicName);
	}

	public List findBySingerId(Object singerId) {
		return findByProperty(SINGER_ID, singerId);
	}

	public List findByMusicSize(Object musicSize) {
		return findByProperty(MUSIC_SIZE, musicSize);
	}

	public List findByMusicTime(Object musicTime) {
		return findByProperty(MUSIC_TIME, musicTime);
	}

	public List findByMusicAlbumId(Object musicAlbumId) {
		return findByProperty(MUSIC_ALBUM_ID, musicAlbumId);
	}

	public List findByMusicPath(Object musicPath) {
		return findByProperty(MUSIC_PATH, musicPath);
	}

	public List findByDbDelete(Object dbDelete) {
		return findByProperty(DB_DELETE, dbDelete);
	}

	public List findAll() {
		log.debug("finding all Music instances");
		try {
			String queryString = "from Music";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Music merge(Music detachedInstance) {
		log.debug("merging Music instance");
		try {
			Music result = (Music) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Music instance) {
		log.debug("attaching dirty Music instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Music instance) {
		log.debug("attaching clean Music instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}