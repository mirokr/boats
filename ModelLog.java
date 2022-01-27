public class ModelLog {
	
	
		public static void main(String... args){
		//other-0, sport-1, yacht-2, trawler -3, cabin-boat-4, 5-flybridge, 6-fishing
		//0-'Year_Built', 	1-'Length', 	2-'Width',  	3-'Boat_Type_0.0', 	4-'Boat_Type_1.0', 	5-'Boat_Type_2.0', 	6-'Boat_Type_3.0', 	7-'Boat_Type_4.0', 	8-'Boat_Type_5.0', 	9-'Boat_Type_6.0', 10-'Fuel_Type_0.0', 	11-'Fuel_Type_1.0', 	12-'Fuel_Type_2.0', 	13-'Fuel_Type_3.0', 	14-'Fuel_Type_4.0', 	15-'Fuel_Type_5.0'	]
		//'Year_Built', 	'Length', 	'Width', 	'Boat_Type_0.0', 	'Boat_Type_1.0', 	'Boat_Type_2.0', 	'Boat_Type_3.0', 	'Boat_Type_4.0', 	'Boat_Type_5.0', 	'Boat_Type_6.0', 'Fuel_Type_0.0', 	'Fuel_Type_1.0', 	'Fuel_Type_2.0', 	'Fuel_Type_3.0', 	'Fuel_Type_4.0', 	'Fuel_Type_5.0'	]]
		double[] input = {2021.0,10.0,2.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		System.out.println(Math.exp(score(input)));

	}
    public static double score(double[] input) {
        return ((((((((((((((((-59.41473695747893) + ((input[0]) * (0.03388162295782835))) + ((input[1]) * (0.18937054159865566))) + ((input[2]) * (0.2652399064351538))) + ((input[3]) * (0.02695870137383033))) + ((input[4]) * (0.02247125462862746))) + ((input[5]) * (0.07440626140876394))) + ((input[6]) * (0.20201740237369228))) + ((input[7]) * (-0.008975037270257995))) + ((input[8]) * (0.035744149584928823))) + ((input[9]) * (-0.35262273209958483))) + ((input[10]) * (-0.24273505793530623))) + ((input[11]) * (-0.1519973266786563))) + ((input[12]) * (0.3578182572109012))) + ((input[13]) * (-0.046416251892144905))) + ((input[14]) * (-0.060179928171620725))) + ((input[15]) * (0.14351030746682686));
    }
}
