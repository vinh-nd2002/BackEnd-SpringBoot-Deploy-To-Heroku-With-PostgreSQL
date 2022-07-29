package com.hust.utils;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.EnumType;

@SuppressWarnings("rawtypes")
public class PostgreSQLEnumType extends EnumType {
	private static final long serialVersionUID = -1974146478084449799L;

	public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session)
			throws HibernateException, SQLException {
		st.setObject(index, value != null ? ((Enum) value).name() : null, Types.OTHER);
	}
}