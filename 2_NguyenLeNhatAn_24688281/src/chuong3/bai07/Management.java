package chuong3.bai07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Management {

	private List<Person> list;
	public Management(int n) {
		this.list = new ArrayList<>(n);
	}

	
	public List<Person> getList() {
		return list;
	}

	public void setList(List<Person> list) {
		this.list = list;
	}



	public Person them(Person p)
	{
		if(list.contains(p)) return null;
		list.add(p);
		return p;
	}
	
	public Person remove(String name)
	{
		Person p = null;
		for(int i = 0;i < list.size();i++)
		{
			p = list.get(i);
			if(p.getName().equalsIgnoreCase(name))
			{
				return list.remove(i);
			}
		}
		return null;
	}
	
	public void sortByName()
	{
		list.sort(Comparator.comparing(Person::getName));
	}
}
