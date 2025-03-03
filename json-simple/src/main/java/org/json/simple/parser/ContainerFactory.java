package org.json.simple.parser;

import org.json.simple.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * Container factory for creating containers for JSON object and JSON array.
 * 
 * @see org.json.simple.parser.JSONParser#parse(java.io.Reader,
 * ContainerFactory)
 * 
 * @author FangYidong<fangyidong@yahoo.com.cn>
 */
public interface ContainerFactory
{
	/**
	 * @return A Map instance to store JSON object, or null if you want to
	 * use org.json.simple.JSONObject.
	 */
	Map<String, Object> createObjectContainer();

	/**
	 * @return A List instance to store JSON array, or null if you want to
	 * use org.json.simple.JSONArray.
	 */
	// @Deprecated List<JSONObject> creatArrayContainer();
	//** I hope this typo correction will not harm anywhere…
	List<Object> createArrayContainer();
}
