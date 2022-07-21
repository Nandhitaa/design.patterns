package creational.object.pool.pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class ObjectPool<T> {

	List<T> lock, unlock;

	ObjectPool() {
		lock = new ArrayList<T>();
		unlock = new ArrayList<T>();
	}

	public abstract T create();

	public T getObj() {
		T t = null;
		if (!unlock.isEmpty()) {
			t = unlock.remove(0);
			lock.add(t);
			return t;
		}
		t = create();
		lock.add(t);
		return t;
	}

	public void returnObj(T t) {
		lock.remove(t);
		unlock.add(t);
	}

}
