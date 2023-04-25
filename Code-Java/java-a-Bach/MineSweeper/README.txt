khung giao diá»‡n -> class button -> hoÃ n thÃ nh giao diá»‡n -> táº¡o máº£ng mÃ¬n, Ä‘iá»�n sá»‘ máº£ng -> Báº¯t sá»± kiá»‡n cho button
-> xá»­ lÃ½ má»Ÿ Ã´, tháº¯ng thua ->

--LoadData: cat hinh anh tu file png
================================================================
--World:
	+ createArrayMin(boom, w, h):ramdom ra 10 bom
	+ dienSo() : kiem tra 8 o xung quanh va dem so bom
	+ open(i, j): Mo o
================================================================
--GameFrame: Tao khung, xu li menu
	+ GameFrame(int w, int h, int boom): khoi tao game
	+ main()
	+ getter/setter
--GamePannel: Bat su kien cho game
	+ GamePannel(int w, int h, int boom, GameFrame gameFrame)
	
	@Override from MouseListener
	+ mouseClicked(MouseEvent e)
	+ mousePressed(MouseEvent e): 
	+ mouseReleased(MouseEvent e)
	+ mouseEntered(MouseEvent e)
	+ mouseExited(MouseEvent e)

	+ getter/setter
--ButtonPlay: cac nut do min
	+ ButtonPlay(PanelPlayer p) 

	@Override
	+ paint(Graphics g)

	+ getter/setter
--ButtonSmile: Hinh mat cuoi
	+ ButtonSmile(PanelNotification p)
	
	@Override
	+ paint(Graphics g)

	+ getter/setter
--PannelNotification: thanh thong bao: gom boom, mat cuoi, thoi gian
	+ PanelNotification(GamePanel game)
	+ updateLbTime()
	+ updateLbBoom()
	+ getter/setter
--PannelPlayer: Khoi tao mang 2 chieu button
	+ PanelPlayer(GamePanel game)
	+ getter/setter
--LableNumber: xu ly tung so trong khung bom va thoi gian
	+ LableNumber(PanelNotification p, String number)
	
	@Override
	+ paint(Graphics g)
	
	+ getter/setter
Tao khung giao dien -> ramdom boom -> dien so -> bat su kien mo o -> 