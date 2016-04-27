package com.xc.bl.utils;

public class CommonDefine {
	
	public static enum BrandType{
		ALL((short)0),
		NOT_HOT((short)1),
		HOT((short)2);
		short enum_short=0;
		private BrandType(short enum_short){
			this.enum_short=enum_short;
		}
		public short getValue(){
			return enum_short;
		}
	}

	
	public static enum AppPushType{
		ALL((short)0),
		NOT_PUSH((short)1),
		PUSH((short)2);
		short enum_short=0;
		private AppPushType(short enum_short){
			this.enum_short=enum_short;
		}
		public short getValue(){
			return enum_short;
		}
	}
} 
