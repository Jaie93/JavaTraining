package StreamApiAssignments;

import java.util.*;
import java.util.stream.Collectors;

class State {
	
	int stateid;
	String statename;
	public State(int i, String name) {

		stateid = i;
		statename = name;
	}
	public int getStateid() {
		return stateid;
	}
	public void setStateid(int stateid) {
		this.stateid = stateid;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	
	
	
}

public class City
{
	int cityid;
	String cityname;
	State objState;
	float pollutionIndex;
	int population;
	int area_of_city;
	
	

	public City(int cityid, String cityname, State objState, float pollutionIndex, int population, int area_of_city) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
		this.objState = objState;
		this.pollutionIndex = pollutionIndex;
		this.population = population;
		this.area_of_city = area_of_city;
	}



	public static void main(String args[])
	{
		List<City> cities = new ArrayList<>();
		cities.add(new City(1,"Pune",new State(11,"Maharashtra"),20,1000,500));
		cities.add(new City(2,"Mumbai",new State(11,"Maharashtra"),30,2000,700));
		cities.add(new City(3,"Ranchi",new State(12,"Jharkhand"),80,1500,600));
		cities.add(new City(4,"Patna",new State(13,"Bihar"),60,1200,660));
		
		City cityWithLessAreaHighestPopulation=cities.stream().min(Comparator.comparing(City::getArea_of_city)).stream().max(Comparator.comparing(City::getPopulation)).get();
		System.out.println("-----city with less area and highest population----"+cityWithLessAreaHighestPopulation.cityname);
		
		City cityHighPollutionIndexHighArea=cities.stream().max(Comparator.comparing(City::getPollutionIndex).thenComparing(Comparator.comparing(City::getArea_of_city))).get();
		System.out.println("-----city with high area and high population-----------"+cityHighPollutionIndexHighArea.cityname);
		
		System.out.println("-----sorting cities according to polltion index--------");
		cities.stream().sorted(Comparator.comparing(City::getPollutionIndex)).forEach(city->System.out.println(city.cityname));
		
		City cityWithLowestPollutionIndexLowestCityArea = cities.stream().min(Comparator.comparing(City::getPollutionIndex).thenComparing(Comparator.comparing(City::getArea_of_city))).get();
		System.out.println("-----city with high area and high population-----------"+cityWithLowestPollutionIndexLowestCityArea.cityname);
		
		System.out.println("-----counting cities in each state-------------");
		Map<Object, Long> map1 = cities.stream().collect(Collectors.groupingBy(city->city.getObjState().getStatename(), Collectors.counting()));
		System.out.println(map1);
		
		System.out.println("-------total area of each state------------");
		Map<Object,Double> map2= cities.stream().collect(Collectors.groupingBy(city->city.getObjState().getStatename(),Collectors.averagingDouble(City::getArea_of_city)));
		System.out.println(map2);

	}



	public int getCityid() {
		return cityid;
	}



	public void setCityid(int cityid) {
		this.cityid = cityid;
	}



	public String getCityname() {
		return cityname;
	}



	public void setCityname(String cityname) {
		this.cityname = cityname;
	}



	public State getObjState() {
		return objState;
	}



	public void setObjState(State objState) {
		this.objState = objState;
	}



	public float getPollutionIndex() {
		return pollutionIndex;
	}



	public void setPollutionIndex(float pollutionIndex) {
		this.pollutionIndex = pollutionIndex;
	}



	public int getPopulation() {
		return population;
	}



	public void setPopulation(int population) {
		this.population = population;
	}



	public int getArea_of_city() {
		return area_of_city;
	}



	public void setArea_of_city(int area_of_city) {
		this.area_of_city = area_of_city;
	}
}
