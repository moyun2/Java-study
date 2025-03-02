public class EightQueenGame{
	public static void main(String[] args) {


		//创建一个棋盘
		int[][] map = new int[8][8];
		for(int i = 0 ; i < map.length; i++){
			for(int j = 0 ; j < map[i].length; j++){

				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		Address T =  new Address();
		T.move(map ,0,0);
		System.out.println("==================");

		for(int i = 0 ; i < map.length; i++){
			for(int j = 0 ; j < map[i].length; j++){

				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}


class Address{
	public boolean move(int[][] map, int i, int j){
		if(map[i][j] == 0){
			map[i][j] = i;
			for(i = 1;i < map[j].length ;i++){
				map[i][j] = 1;
				map[j][i] = 1;
			}
			for(i = 1;i < map.length-1 ;i++){
				for(j = 0 ; j < map[i].length-1; j++){
					if(i == j){
						map[i][j] = 1;
					}
				}
			}
			return true;

		}else{
			move(map,i,j);
			return true;
		}
	} 
}


