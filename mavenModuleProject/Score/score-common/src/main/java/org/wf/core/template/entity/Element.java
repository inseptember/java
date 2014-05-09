package org.wf.core.template.entity;

import javax.persistence.Table;

import org.wf.core.dao.entity.BaseEntity;


@javax.persistence.Entity
@Table(name = "Element", catalog = "template")
public class Element extends BaseEntity {

	private String name;
	
}
