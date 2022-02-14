package pkg.deepCurse.javlaModlu.managers;

import java.util.HashMap;
/**
 * 
 * @author u1d
 *
 * @param <K> access key, typically the name of the class for simplicity
 * @param <CT> class type, supply InternalReloadable if you are unsure of what to use
 */
public class ClassManager<K, CT> {

	/**
	 * direct access of this is discouraged
	 */
	private HashMap<K, Class<CT>> classMap;

	public ClassManager() {
		classMap = new HashMap<K, Class<CT>>();
	}

	/**
	 * This reloadable is for internal use, if you wish to add to its functionality,
	 * simply create a new interface that implements this one (InternalReloadable)
	 * 
	 * @author u1d
	 */
	interface InternalReloadable {
		/**
		 * a data bus for use with dumping variables that need to persist across reloads
		 * 
		 * @return
		 */
		HashMap<String, Object> dump();

		/**
		 * a data bus for use with loading variables that need to persist across reloads
		 * 
		 * @param bulk
		 */
		void load(HashMap<String, Object> bulk);
	}

}
