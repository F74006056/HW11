package myudf;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

public class UDF extends EvalFunc<String>
{
	public String exec(Tuple input) {
		
	try
	{
		String in=(String)input.get(0);
		if(in.length()<=1)
			return "";		
		in=in.substring(in.indexOf(',')+3,in.indexOf(']'));
		in=in.replaceAll(" ","");
		return in;
	}	
	catch(Exception e)
	{
		
	}
		return "";
	}
}

