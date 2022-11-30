class BlueRayDisk{
	String title,director;
	double cost;
	int year;

	public BlueRayDisk(String title,String director,double cost,int year) {
		this.title=title;
		this.director=director;
		this.year=year;
		this.cost=cost;
	}

	@Override
	public String toString() {
		return "$ "+cost+" "+year+" "+title+", "+director;
	}
}

