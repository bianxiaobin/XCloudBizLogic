package com.xc.bl.utils;

public class CommonDefine {
	
	public static enum BrandType{
		ALL((short)0),	//所有
		NOT_HOT((short)1),	//非热门
		HOT((short)2);		//热门
		short enum_short=0;
		private BrandType(short enum_short){
			this.enum_short=enum_short;
		}
		public short getValue(){
			return enum_short;
		}
	}

	
	public static enum AppPushType{
		ALL((short)0),		//所有
		NOT_PUSH((short)1),	//非推荐
		PUSH((short)2);		//推荐
		short enum_short=0;
		private AppPushType(short enum_short){
			this.enum_short=enum_short;
		}
		public short getValue(){
			return enum_short;
		}
	}
	
	public static enum TappUpdForce{
		NOT_FORCE((short)1),	//非强制更新
		FORCE((short)2);	//强制更新
		short enum_short=0;
		private TappUpdForce(short enum_short){
			this.enum_short=enum_short;
		}
		public short getValue(){
			return enum_short;
		}
	}
	
	public static enum SmsSubmitResult{
		SUCCESS(2);
		int enum_int=0;
		private SmsSubmitResult(int enum_int){
			this.enum_int=enum_int;
		}
		public int getValue(){
			return enum_int;
		}
	}
	
} 
