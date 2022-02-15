package pkg.deepCurse.javlaModlu.managers;

import java.io.File;
import java.util.HashMap;

/**
 * 
 * @author u1d
 *
 * @param <K>  access key, typically the name of the class for simplicity
 * @param <CT> class type, supply InternalReloadable if you are unsure of what
 *             to use
 */
public class ClassManager<K, CT> {

	private HashMap<K, Class<CT>> classMap;
	private ClassLoader classLoader;

	public ClassManager() {
		classLoader = getClass().getClassLoader();
		classMap = new HashMap<K, Class<CT>>();
	}

	@SuppressWarnings("unchecked")
	public void add(K key, String path) throws ClassNotFoundException {
		Class<CT> loadedMyClass = (Class<CT>) classLoader.loadClass(path);
		classMap.put(key, loadedMyClass);
	}

	public void addFile(File file) {

	}

	public void remove(String path) {

	}

	public void removeFile(File file) {

	}

	/**
	 * This reloadable is for internal use, if you wish to add to its functionality,
	 * simply create a new interface that implements this one (InternalReloadable)
	 * 
	 * @author u1d
	 */
	public interface InternalReloadable {
		/**
		 * a data bus for use with dumping data that need to persist across reloads
		 * 
		 * @return
		 */
		default HashMap<String, Object> dump() {
			return null;
		}

		/**
		 * a data bus for use with loading data that need to persist across reloads
		 * 
		 * @param bulk
		 */
		default void load(HashMap<String, Object> dBus) {
		}
	}

}
