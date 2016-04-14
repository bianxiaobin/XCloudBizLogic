package com.xc.bl.musicalbum.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.pojo.MusicAlbum;

public class MusicAlbumDaoImpl implements IMusicAlbumDao{

	@Override
	public List<MusicAlbum> getMusicAlbumList_desc() {
		// TODO Auto-generated method stub
		String hql="from MusicAlbum WHERE dbDelete=:dbDelete  ORDER BY musicAlbumId DESC";
		Session session=HibernateSessionFactory.getSession();
		Query query=session.createQuery(hql);
		query.setBoolean("dbDelete", false);
		return query.list();
	}

}
