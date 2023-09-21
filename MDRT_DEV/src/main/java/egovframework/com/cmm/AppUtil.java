package egovframework.com.cmm;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AppUtil {
	public static ObjectMapper jsonConverter;
	private static String SESSION_USER_KEY="SESSION_USER";
	
	public static void sessionUser(HttpSession session,Map<String,Object> user) {
		session.setAttribute(SESSION_USER_KEY, user);
	}
	public static Map<String,String> sessionUser(HttpSession session){
		return cast(session.getAttribute(SESSION_USER_KEY));
	}
	public static <T> T cast(Object obj) {
		return (T)obj;
	}
	public static <T> T cast(Map<String, ?> map,String key) {
		return (T)map.get(key);
	}
	public static Double toDouble(Map<String, ?> map,String key) {
		return Double.valueOf(map.get(key).toString());
	}
	public static Long toLong(Map<String, ?> map,String key) {
		return Long.valueOf(map.get(key).toString());
	}
	public static String phoneFormat(String number) {
		return number.replaceAll("(\\d{3})(\\d{3,4})(\\d{4})", "$1-$2-$3");
	}
	public static Date now() {return new Date();}
	public static<T> List<T> toList(String str,String delim){
		ArrayList<T> rslt = new ArrayList<>();
		T[] arr=(T[]) str.split(delim);
		for (int i = 0; i < arr.length; i++) {
			rslt.add(arr[i]);
		}
		return rslt;
	}
	public static<T> List<T> toList(String str,String delim,boolean removeEmpty){
		ArrayList<T> rslt = new ArrayList<>();
		T[] arr=(T[]) str.split(delim);
		for (int i = 0; i < arr.length; i++) {
			if(!StringUtils.isEmpty(cast(arr[i])))rslt.add(arr[i]);
		}
		return rslt;
	}

	public static String concat(Object...objects) {
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < objects.length; i++) {
			String str=objects[i]==null?"":objects[i].toString();
			sb.append(str);
		}
		return sb.toString();
	}
	public static String sha512(String text) {
        String res = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.reset();
            md.update(text.getBytes("utf8"));
            res = String.format("%0128x", new BigInteger(1, md.digest()));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return res;
    }
	
	public static String yyyyMMdd(Date dt) {
		return new SimpleDateFormat("yyyy-MM-dd").format(dt);
	}
	public static String yyyyMMdd_HHmmss(Date dt) {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(dt);
	}
	public static String nowStr() {
		return yyyyMMdd(now());
	}
	public static String nowStrLong() {
		return yyyyMMdd(now());
	}
	public static Map<String,Object> toMap(final String key,final List<Map<String,?>>list) {
		Map<String,Object> rslt=new HashMap<>();
		list.forEach(item->rslt.put((String)item.get(key),item));
		return rslt;
	}
	public static Map<String,Object> of(Object... ents){
		Map<String,Object> rslt=new HashMap<>();
		String lastkey=null;
		for (int i = 0; i < ents.length; i++) {
			Object ent=ents[i];
			if((i+1)%2==1) {
				lastkey=ent.toString();
			}else {
				rslt.put(lastkey, ent);
			}
		}
		return rslt;
	}

}
