package org.wf.core.dao.api;

import java.util.List;

public interface CommonDao<T> {
	
	public boolean save(T entity);
	
	public T get(Integer id);
	
	public List<T> search(T entity);
	
	public boolean delete(Integer id);

}
