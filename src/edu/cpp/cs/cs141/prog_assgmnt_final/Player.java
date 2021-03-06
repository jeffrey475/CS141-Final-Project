/**
 * 
 */
package edu.cpp.cs.cs141.prog_assgmnt_final;

/**
 * @author Seungyun
 *
 */
public class Player extends GameEntity {
	
	private int row;
	
	private int column;
	
	public Player() {
		super("P", "P");
	}

	
				
	
	
	/**
	 * @param front
	 * @param back
	 * @param row
	 * @param column
	 */
	public Player(String front, String back, int row, int column) {
		super("P", "P");
		this.row = row;
		this.column = column;
	}
	
	public void up() {
		row = row - 1;
	}
	
	public void down() {
		row = row + 1;
	}
	
	public void left() {
		column = column - 1;
	}
	public void right() {
		column = column + 1;
	}
	
	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}





	/**
	 * @param row the row to set
	 */
	public void setRow(int row) {
		this.row = row;
	}





	/**
	 * @return the column
	 */
	public int getColumn() {
		return column;
	}





	/**
	 * @param column the column to set
	 */
	public void setColumn(int column) {
		this.column = column;
	}

	/**
	 * This field represents the initial life points that player will start
	 * with.
	 */
	private int life = 3;

	/**
	 * This field represents if player is got attacked by an enemy.
	 */
	private boolean underAttack = true;

	/**
	 * This field represents if player picked up radar power-up or not.
	 */
	private boolean radar = false;

	/**
	 * This field represents if player picked up invincible power-up or not.
	 */
	private boolean invincible = false;

	/**
	 * This field indicates if an enemy is detected.
	 */
	private boolean detected = false;

	/**
	 * This method is attacking method
	 * 
	 * @return
	 */
	public boolean attack() {
		return false;
	}

	/**
	 * This method is looking method which enables the player to look two-tiles
	 * ahead of him/her.
	 * 
	 * @return
	 */
	public boolean look() {
		return false;
	}
	
	public void move1(int row, int column) {
		
	}

	/**
	 * This method is moving method. Up, down, right, and left only.
	 * 
	 * @param movement
	 * @return
	 */
	public void move(int movement) {
		// read through array and find p location store it
		
		Map map = new Map();

		map.generateEmptySpace();
		map.generateRoomsWithBriefCase();
		map.generatePlayer();
		map.generateEnemy();
		map.generateRadar();
		map.generateAdditionalBullet();
		map.generateInvincibility();


		

		GameEntity[][] tempMap = map.getMap();



		GameEntity[][] tempMap1 = map.getMap();


		for (int i = 0; i < tempMap1.length; ++i) {
			for (int j = 0; j < tempMap1[i].length; ++j) {
				if (tempMap1[i][j].getFront().equals("P")) {

					// **might have to add additional code to each case to fill
					// original
					// player spot empty space
					switch (movement) {
					// up
					case 1:
						tempMap1[i - 1][j] = new Player();
						map.setMap(tempMap1[i - 1][j]);
						break;
					// down
					case 2:
						tempMap1[i + 1][j] = new Player();
						break;
					// left
					case 3:
						tempMap1[i][j - 1] = new Player();
						break;
					// right
					case 4:
						tempMap1[i - 1][j + 1] = new Player();
						break;

					}
				}
			}
		}


		} 

	

	

		
	/**
	 * This method indicates if player got attacked by an enemy. If it did, it
	 * will lose 1 life point.
	 */
	public void gotDamaged() {
		if (underAttack) {
			life -= 1;
		}
	}

	/**
	 * This method is picking up power-ups.
	 */
	public void pickPowerUp() {

	}

	/**
	 * This method is using power-ups.
	 */
	public void usePowerUp() {

	}

	/**
	 * When player finds the brief case, picking up method will pick up the
	 * brief case.
	 */
	public void pickingUpBriefCase() {

	}

	/**
	 * @return the life
	 */
	public int getLife() {
		return life;
	}

	/**
	 * @param life
	 *            the life to set
	 */
	public void setLife(int life) {
		this.life = life;
	}

}
