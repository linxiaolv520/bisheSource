package cn.com.until;

import junit.framework.Assert;

import org.junit.Test;

	public class MemcachedUtilTest {

		@Test
		public void testMemcached() {
			MemcachedUtil.put("hello", "world", 60);
			String hello = (String) MemcachedUtil.get("hello");
			System.out.println(hello);
			Assert.assertEquals("world", hello);
			
//			for(int i = 0; i < 10000000; ++i) {
//				UserBean userBean = new UserBean("Jason" + i, "123456-" + i);
//				MemcachedUtil.put("user" + i, userBean, 60);
//				Object obj = MemcachedUtil.get("user" + i);
//				Assert.assertEquals(userBean, obj);
//			}
		}
	}

