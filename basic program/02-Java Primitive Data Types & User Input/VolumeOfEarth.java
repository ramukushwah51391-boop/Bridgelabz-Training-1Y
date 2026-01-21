class VolumeOfEarth{
		public static void main(String[] args){
		double r = 6378;
		double volume = 4/3*3.14*r*r*r;
		double km = volume;
		double miles = km*0.621371;
		System.out.println("volume in km =" +km);
		System.out.println("volume in miles =" +miles);
		
		}
}