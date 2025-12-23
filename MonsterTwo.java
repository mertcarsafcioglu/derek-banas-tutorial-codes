import java.util.Arrays;

public class MonsterTwo {

	static char[][] battleBoard= new char[10][10];
	public static void buildBattleBoard() {
		for(char[] row : battleBoard) {
			Arrays.fill(row, '*');
		}
	}
	public static void redrawBoard() {
		int k = 1;
		while (k<=30) {
			System.out.print("-"); 
			k++;
		}
		System.out.println();
		for (int i = 0; i < battleBoard.length; i++) {
			for (int j = 0; j < battleBoard[i].length; j++) {
				System.out.print("|"+ battleBoard[i][j] +"|");
			}
			System.out.println();
		}
		k = 1;
		while (k<=30) {
			System.out.print("-"); 
			k++;
		}
		System.out.println();
	}


	public final String TOMBSTONE ="Here Lies a Dead monster";
	//private fields are not visible outside of the class
	private int health = 500;
	private int attack = 20;
	private int movement = 2;

	private boolean alive = true;
	//public variables are visible outside of the class
	//you should have as few as possible public fields
	public String name = "Big Monster";
	public char nameChar1 = 'B';
	public  int xPosition = 0;
	public  int yPosition = 0;
	public static int numOfMonsters = 0;

	public int getAttack() {
		return attack;
	}
	public int getMovement() {
		return movement;
	}
	public int getHealth() {
		return health;
	}
	public boolean getAlive() {
		return alive;
	}
	public void setHealth(int decreaseHealth) {
		health = health - decreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	public void setHealth(double decreaseHealth) {
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}

	public void moveMonster(MonsterTwo[] monster, int arrayItemIndex) {
    boolean isSpaceOpen = true;

    int maxXBoardSpace = battleBoard.length - 1;
    int maxYBoardSpace = battleBoard[0].length - 1;

    while (isSpaceOpen) {
        int randMoveDirection = (int) (Math.random() * 4); // 0 = yukarı, 1 = sağ, 2 = aşağı, 3 = sol
        int randMoveDistance = (int) (Math.random() * (this.getMovement() + 1)); // 0 - movement arası

        System.out.println("Hareket: " + randMoveDistance + " adım | Yön: " + randMoveDirection);

        // Şu anki pozisyonu temizle
        battleBoard[this.yPosition][this.xPosition] = '*';

        // Yeni pozisyonu hesapla
        if (randMoveDirection == 0) { // yukarı
            this.yPosition = Math.max(0, this.yPosition - randMoveDistance);
        } else if (randMoveDirection == 1) { // sağ
            this.xPosition = Math.min(maxXBoardSpace, this.xPosition + randMoveDistance);
        } else if (randMoveDirection == 2) { // aşağı
            this.yPosition = Math.min(maxYBoardSpace, this.yPosition + randMoveDistance);
        } else { // sol
            this.xPosition = Math.max(0, this.xPosition - randMoveDistance);
        }

        // Çakışma kontrolü (aynı yerde başka canavar var mı?)
        isSpaceOpen = false; 
        for (int i = 0; i < monster.length; i++) {
            if (i == arrayItemIndex) continue; // kendini atla
            if (onMySpace(monster, i, arrayItemIndex)) {
                isSpaceOpen = true; // başka canavarla çakıştı
                break;
            }
        }
    }

    // Yeni pozisyonu tahtada işaretle
    battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
}
//END OF moveMonster

	public boolean onMySpace(MonsterTwo[] monster, int indexToChk1, int indexToChk2 ) {
		if((monster[indexToChk1].xPosition) == (monster[indexToChk2].xPosition)&&(monster[indexToChk1].yPosition) == (monster[indexToChk2].yPosition)) {
			return true;
		} else {
			return false;
		}
	} // END OF onMySpace
	
	
	public	MonsterTwo(int Health, int newAttack, int newMovement, String name) {
		this.health = Health;
		attack = newAttack;
		movement = newMovement;
		this.name = name;  
		int maxXBoardSpace = battleBoard.length -1 ;
		int maxYBoardSpace = battleBoard[0].length -1 ;

		int randNumX, randNumY;
		do {
			randNumX = (int) (Math.random() * maxXBoardSpace);
			randNumY= (int) (Math.random() * maxYBoardSpace);
		} while (battleBoard[randNumX][randNumY] != '*');

		this.xPosition = randNumX;
		this.yPosition = randNumY;

		this.nameChar1 = this.name.charAt(0);

		battleBoard[this.yPosition][this.xPosition] = this.nameChar1;

		numOfMonsters++;
	}
	//Default Constructor
	public MonsterTwo() {
		numOfMonsters++;

	}

}
