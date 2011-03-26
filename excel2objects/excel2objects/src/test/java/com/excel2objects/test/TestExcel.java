package com.excel2objects.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.excel2objects.common.excel.engine.ExcelParser;
import com.excel2objects.common.excel.exceptions.UnparsbleException;

public class TestExcel {
	String fileName = "/tmp/test.xls";

	TestExcel() throws FileNotFoundException, IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException, UnparsbleException {
		final HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(this.fileName));
		final ExcelParser<TestModel> parser = new ExcelParser<TestModel>(1);
		final Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(new Integer(1), "col1");
		map.put(new Integer(2), "col2");
		map.put(new Integer(3), "col3");
		map.put(new Integer(4), "name");

		final List<TestModel> list = parser.getObjects(wb.getSheetAt(1), TestModel.class, map);

	}

	/**
	 * @param args
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		try {
			new TestExcel();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

}
