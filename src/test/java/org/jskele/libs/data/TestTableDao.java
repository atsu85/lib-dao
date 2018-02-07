package org.jskele.libs.data;

import java.util.List;

import org.jskele.libs.dao.CrudDao;
import org.jskele.libs.dao.GenerateSql;

public interface TestTableDao extends CrudDao<TestTableRow, TestTableRowId> {

	@GenerateSql
	List<TestTableRow> selectAll();

	@GenerateSql
	void insertBatch(List<TestTableRow> rows);

	@GenerateSql
	void updateBatch(List<TestTableRow> rows);

	List<TestTableRow> findByNumericColumnIn(String excludedValue, List<Long> numericColumns);
}
