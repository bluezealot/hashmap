package com.bluezealot.hashmap;

import java.util.concurrent.ThreadLocalRandom;

import com.bluezealot.firstattempt.SearchMap;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
class HashmapApplicationTests {

	private SearchMap searchTarget = new SearchMap();
	private HashMap hashTarget = new HashMap();

	HashmapApplicationTests(){
		for(int i = 0; i < TestDataSet.data.size(); i ++){
			searchTarget.add(TestDataSet.data.get(i)[0], TestDataSet.data.get(i)[1]);
			hashTarget.add(TestDataSet.data.get(i)[0], TestDataSet.data.get(i)[1]);
		}
	}

	/**
	 * 简单字符串查找
	 */
	@Test
	void testSearchMap() {
		
		System.out.println("\nKey:0532," + " Value:" + searchTarget.get("0532"));
		System.out.println("Key:0357," + " Value:" + searchTarget.get("0357"));
		System.out.println("Key:0530," + " Value:" + searchTarget.get("0530"));
		System.out.println("Key:0917," + " Value:" + searchTarget.get("0917"));
		System.out.println("Key:0999," + " Value:" + searchTarget.get("0999"));
		Assert.isTrue(searchTarget.get("0532").equals("山东_青岛市              "), "");
	}

	/**
	 * 自己实现的简单hashmap查找
	 */
	@Test
	void testHashMap() {
		System.out.println("\nKey:0728," + " Value:" + hashTarget.get("0728"));
		System.out.println("Key:0357," + " Value:" + hashTarget.get("0357"));
		System.out.println("Key:0530," + " Value:" + hashTarget.get("0530"));
		System.out.println("Key:0917," + " Value:" + hashTarget.get("0917"));
		System.out.println("Key:0999," + " Value:" + hashTarget.get("0999"));
		Assert.isTrue(hashTarget.get("0728").equals("湖北_江汉（天门/仙桃/潜江）区"), "");
	}

	@Test
	void showHashStatus() {
		// HashMap testTarget = new HashMap();
		// for(int i = 0; i < TestDataSet.data.size(); i ++){
		// 	testTarget.add(TestDataSet.data.get(i)[0], TestDataSet.data.get(i)[1]);
		// }
		// System.out.println("Key:0728," + " Value:" + testTarget.get("0728"));
		// Assert.isTrue(testTarget.get("0728").equals("湖北_江汉（天门/仙桃/潜江）区"), "");
	}

	@Test
	void timeContestSearch(){
		long startTime = System.nanoTime();
		int randomNum = 0;
		for(int i = 0; i < 1500000; i ++){
			randomNum = ThreadLocalRandom.current().nextInt(0, TestDataSet.codes.size());
			String key = TestDataSet.codes.get(randomNum);
			searchTarget.get(key);
		}
		long endTime = System.nanoTime();
		System.out.println(String.format("\nSearch time consumption:", endTime - startTime));
		System.out.print(endTime - startTime);
	}

	@Test
	void timeContestHash(){
		long startTime = System.nanoTime();
		int randomNum = 0;
		for(int i = 0; i < 1500000; i ++){
			randomNum = ThreadLocalRandom.current().nextInt(0, TestDataSet.codes.size());
			String key = TestDataSet.codes.get(randomNum);
			hashTarget.get(key);
		}
		long endTime = System.nanoTime();
		System.out.println(String.format("\nSearch time consumption:", endTime - startTime));
		System.out.print(endTime - startTime);
	}

}
