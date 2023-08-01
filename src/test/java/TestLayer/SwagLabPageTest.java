package TestLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.SwagLabPage;

public class SwagLabPageTest extends BaseClass
{
	public SwagLabPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void validateswagLabPagefunctinality() throws IOException 
	{
	SwagLabPage swagLab=new SwagLabPage();
	swagLab.swagLabPagefunctinality("Price (high to low)");
	}
}
