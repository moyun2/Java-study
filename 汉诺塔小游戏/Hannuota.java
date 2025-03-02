public class Hannuota{
	public static void main(String args[]){
		Tower T = new Tower();
		T.move(2, 'a', 'b', 'c');
	}
}

class Tower{
	//n 表示一共有几个盘，a表示原始塔，b表示中间塔，c表示目标塔
	public void move(int num,char a,char b,char c){
		if(num == 1){
			//其实就是每一步让你想要移动的塔到你的目标塔
			System.out.println(a + "->" + c);
		}else{
			//num-1表示每次移动的都是最上层的塔
			//在这里的移动也是将原始塔移到目标塔
			//只不过目标塔改变了
			//以两层为例，num-1是第一层，就进入递归调用前面的if,但是你需要改变你的目标塔，所以是a,c,b ,然后a,b ,c ,最后b,a,c
			move(num-1, a, c, b);
			move(num-1, a, b, c);
			move(num-1, b, a, c);

		}
	}
}