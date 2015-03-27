#sample Example

# Introduction #

Model/Pojo class
```
public class TestModel {

	private String col1;
	private Integer col2;
	private Integer col3;
	private Integer col4;
	private Integer col5;
	private Integer name;
 // Setters and Getters
}


```
Main class to Convert Excel file to Java Objects

```


	final HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(this.fileName));
		final ExcelParser<TestModel> parser = new ExcelParser<TestModel>(1);
		final Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(new Integer(1), "col1");
		map.put(new Integer(2), "col2");
		map.put(new Integer(3), "col3");
		map.put(new Integer(4), "name");

		final List<TestModel> list = parser.getObjects(wb.getSheetAt(1), TestModel.class, map);

```