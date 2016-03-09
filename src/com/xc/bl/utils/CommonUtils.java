package com.xc.bl.utils;

import java.sql.Timestamp;

public class CommonUtils {
	public static Timestamp getTimestampNow(){
		return new Timestamp(System.currentTimeMillis());
	}
}
