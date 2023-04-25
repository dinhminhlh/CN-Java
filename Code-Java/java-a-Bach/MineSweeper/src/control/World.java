package control;

import java.util.Random;

import model.ButtonPlay;
import model.ButtonSmile;
import model.LableNumber;
import view.GamePanel;

public class World {
	private Random rd;

	private ButtonPlay[][] arrayButton; // Mang nut bam
	private int[][] arrayMin; // Mang luu tru boom

	private boolean[][] arrayBoolean; // Mang luu tru nhung o da mo(true)

	private boolean[][] arrayCamCo; // Mang luu tru cam co
	private int co;

	private boolean isComplete; // thang
	private boolean isEnd; // ket thuc

	private ButtonSmile buttonSmile; // Nut mat cuoi
	private LableNumber lbTime, lbBoom; // Label boom va thoi gian (2 ben cua mat cuoi)

	private int boom; // So luong boom

	private GamePanel game; // Khung game

	public World(int w, int h, int boom, GamePanel game) {

		this.game = game;
		this.boom = boom;

		arrayButton = new ButtonPlay[w][h];
		arrayMin = new int[w][h];
		arrayBoolean = new boolean[w][h];
		arrayCamCo = new boolean[w][h];

		rd = new Random();

		createArrayMin(boom, w, h);
		dienSo();

	}

	public ButtonPlay[][] getArrayButton() {
		return arrayButton;
	}

	public void setArrayButton(ButtonPlay[][] arrayButton) {
		this.arrayButton = arrayButton;
	}

	public ButtonSmile getButtonSmile() {
		return buttonSmile;
	}

	public void setButtonSmile(ButtonSmile buttonSmile) {
		this.buttonSmile = buttonSmile;
	}

	public LableNumber getLbTime() {
		return lbTime;
	}

	public void setLbTime(LableNumber lbTime) {
		this.lbTime = lbTime;
	}

	public LableNumber getLbBoom() {
		return lbBoom;
	}

	public void setLbBoom(LableNumber lbBoom) {
		this.lbBoom = lbBoom;
	}

	public boolean[][] getArrayBoolean() {
		return arrayBoolean;
	}

	public void setArrayBoolean(boolean[][] arrayBoolean) {
		this.arrayBoolean = arrayBoolean;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public boolean isEnd() {
		return isEnd;
	}

	public void setEnd(boolean isEnd) {
		this.isEnd = isEnd;
	}

	public boolean[][] getArrayCamCo() {
		return arrayCamCo;
	}

	public void setArrayCamCo(boolean[][] arrayCamCo) {
		this.arrayCamCo = arrayCamCo;
	}

	public int getCo() {
		return co;
	}

	public void setCo(int co) {
		this.co = co;
	}
	
	public void createArrayMin(int boom, int w, int h) { //tao min
		int locationX = rd.nextInt(w);		//4
		int locationY = rd.nextInt(h);		//5

		arrayMin[locationX][locationY] = -1; // gia tri -1 tuong duong voi vi tri min
		int count = 1;
		while (count != boom) {
			locationX = rd.nextInt(w);
			locationY = rd.nextInt(h);
			if (arrayMin[locationX][locationY] != -1) {
			arrayMin[locationX][locationY] = -1;
			count = 0;
			for (int i = 0; i < arrayMin.length; i++) {
				for (int j = 0; j < arrayMin[i].length; j++) {
					if (arrayMin[i][j] == -1)
						count++;
					}
				}
			}
		}
	}

	public void dienSo() {								// do cac o xong quanh co bao nhieu qua min thi se dien so do vao o dang xet					
		for (int i = 0; i < arrayMin.length; i++) {
			for (int j = 0; j < arrayMin[i].length; j++) {
				if (arrayMin[i][j] == 0) {
					int count = 0;
					for (int l = i - 1; l <= i + 1; l++) {
						for (int k = j - 1; k <= j + 1; k++) {
							if (l >= 0 && l <= arrayMin.length - 1 && k >= 0 && k <= arrayMin[i].length - 1) // loat bo truong hop nem ra exception khi xet vi tri ngoai cung
								if (arrayMin[l][k] == -1) {
									count++;
								}
						}
					}
					arrayMin[i][j] = count;
				}
			}
		}
	}
	
	public boolean checkWin() {			//kiem tra xem so luong o chua mo dung bang so luong min thi win
		int count = 0;
		for (int i = 0; i < arrayBoolean.length; i++) {
			for (int j = 0; j < arrayBoolean[i].length; j++) {
				if (!arrayBoolean[i][j]) {
					count++;
				}
			}
		}
		if (count == boom)
			return true;
		else
			return false;
	}
	
	public boolean open(int i, int j) {
		if (!isComplete && !isEnd) {
			if (!arrayBoolean[i][j]) {
				if (arrayMin[i][j] == 0) {  // xu ly khi mo o = 0 (mo o trang)

					arrayBoolean[i][j] = true;
					arrayButton[i][j].setNumber(0); //lay hinh
					arrayButton[i][j].repaint();	//repaint

					if (checkWin()) {
						isEnd = true;
						return false;
					}
					// tu dong mo lan ra khi cac o ben canh cung = 0
					for (int l = i - 1; l <= i + 1; l++) {
						for (int k = j - 1; k <= j + 1; k++) {
							if (l >= 0 && l <= arrayMin.length - 1 && k >= 0 && k <= arrayMin[i].length - 1) { //ngan nem ra exception khi xet cac o ngoai cung
								if (!arrayBoolean[l][k]) {
									open(l, k);
								}
							}
						}
					}

					if (checkWin()) {
						isEnd = true;
						return false;
					}

				} else {	// xu lky khi mo o so 1,2,3,4,5,6,7,8
					int number = arrayMin[i][j];
					
					if (number != -1) {
						arrayBoolean[i][j] = true;
						arrayButton[i][j].setNumber(number);
						arrayButton[i][j].repaint();

						if (checkWin()) {
							isEnd = true;
							return false;
						}
						return true;
					}
				}
			}
			if (arrayMin[i][j] == -1) {	// xu ly khi mo dinh boom 
				arrayButton[i][j].setNumber(11);
				arrayButton[i][j].repaint();
				isComplete = true;
				//khi thua mo ra tat ca cac o chua bom
				for (int j2 = 0; j2 < arrayBoolean.length; j2++) {
					for (int k = 0; k < arrayBoolean[i].length; k++) {
						if (arrayMin[j2][k] == -1 && !arrayBoolean[j2][k]) {
							if (j2 != i || k != j) { //tranh mo o boomred thanh bom thuong
								arrayButton[j2][k].setNumber(10);
								arrayButton[j2][k].repaint();
							}
						}
					}
				}

				return false;
			} else {
				if (checkWin()) {
					isEnd = true;
					return false;
				}
				return true;
			}
		} else return false;
	}
	
	public void camCo(int i, int j) {
		if (!arrayBoolean[i][j]) {
			if (arrayCamCo[i][j]) {
				co--;
				arrayCamCo[i][j] = false;
				arrayButton[i][j].setNumber(-1);
				arrayButton[i][j].repaint();
				game.getP1().updateLbBoom();
			} else if (co < boom) {
				co++;
				arrayCamCo[i][j] = true;
				arrayButton[i][j].setNumber(9);
				arrayButton[i][j].repaint();
				game.getP1().updateLbBoom();
			}
		}

	}

	

	public boolean clickDouble(int i, int j) {

		boolean isCoMin = false;

		for (int l = i - 1; l <= i + 1; l++) {		//mo cac o xung quanh
			for (int k = j - 1; k <= j + 1; k++) {
				if (l >= 0 && l <= arrayMin.length - 1 && k >= 0 && k <= arrayMin[i].length - 1) {
					if (!arrayCamCo[l][k]) {
						if (arrayMin[l][k] == -1) {
							isCoMin = true;
							arrayButton[l][k].setNumber(12);
							arrayButton[l][k].repaint();
							arrayBoolean[l][k] = true;
						} else if (!arrayBoolean[l][k]) {
							if (arrayMin[l][k] == 0) {
								open(l, k);
							} else {
								arrayButton[l][k].setNumber(arrayMin[l][k]);
								arrayButton[l][k].repaint();
								arrayBoolean[l][k] = true;
							}
						}
					}
				}
			}
		}

		if (isCoMin) {	//kiem tra co min hay khong
			for (int j2 = 0; j2 < arrayBoolean.length; j2++) {
				for (int k = 0; k < arrayBoolean[i].length; k++) {
					if (arrayMin[j2][k] == -1 && !arrayBoolean[j2][k]) {
						arrayButton[j2][k].setNumber(10);
						arrayButton[j2][k].repaint();
					}
				}
			}
			return false;
		}
		return true;
	}

	public void fullTrue() {
		for (int i = 0; i < arrayBoolean.length; i++) {
			for (int j = 0; j < arrayBoolean[i].length; j++) {
				if (!arrayBoolean[i][j]) {
					arrayBoolean[i][j] = true;
				}
			}
		}
	}
}
